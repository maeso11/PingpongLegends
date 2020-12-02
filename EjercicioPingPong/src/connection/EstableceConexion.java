package connection;

import java.io.FileReader;
import modelo.Informacion;
import modelo.RegisterDatos;
import vista.Registrarse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

public class EstableceConexion {

	/**
	 * Conecta con la bbdd
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public Connection connectionByProp() throws ClassNotFoundException, SQLException, IOException {
		Connection connection = null;
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("src/connection/db.properties"));
			String driver = properties.getProperty("database.driver");
			String url = properties.getProperty("database.url");
			String user = properties.getProperty("database.user");
			String password = properties.getProperty("database.password");

			// Relizamos el registro del driver y obtenemos la conexion
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

			connection.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			throw e;
		}
		return connection;
	}

	/**
	 * Desconecta de la bbdd
	 * 
	 * @param connection
	 * @throws SQLException
	 */
	public void disconect(Connection connection) throws SQLException {
		try {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Informacion devuelveDatos(String nombre) throws ClassNotFoundException, SQLException, IOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Informacion informacion = null;
		String sentenciaSqle = "SELECT * FROM INFORMACION WHERE NOMBRE= ?";
		try {
			connection = connectionByProp();
			preparedStatement = connection.prepareStatement(sentenciaSqle);
			preparedStatement.setString(1, nombre);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				informacion = new Informacion();
				informacion.setNombre(resultSet.getString("NOMBRE"));
				informacion.setAlias(resultSet.getString("ALIAS"));
				informacion.setAtaque(resultSet.getString("ATAQUE"));
				informacion.setDefensa(resultSet.getString("DEFENSA"));
				informacion.setCiudad(resultSet.getString("CIUDAD"));
				informacion.setEdad(resultSet.getInt("EDAD"));
				informacion.setGif(resultSet.getString("GIF"));
				informacion.setGolpeEstrella(resultSet.getString("GOLPE_ESTRELLA"));
				informacion.setGrito(resultSet.getString("GRITO"));
				informacion.setLateralidad(resultSet.getString("LATERALIDAD"));
				informacion.setLiga(resultSet.getString("LIGA"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				disconect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return informacion;
	}

	/**
	 * Devuelve si existe un Usuario
	 * 
	 * @param usuario
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean compruebaUsuarioExiste(String usuario, Connection connection)
			throws IOException, ClassNotFoundException, SQLException {
		boolean existe = false;

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		RegisterDatos register = null;
		String sentenciaSqle = "SELECT * FROM INFORMACION WHERE NOMBRE= ?";
		try {
			preparedStatement = connection.prepareStatement(sentenciaSqle);
			preparedStatement.setString(1, usuario);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				register = new RegisterDatos();
				register.setUsuario(resultSet.getString("USUARIO"));
				register.setContraseña(resultSet.getString("CONTRASEÑA"));
				if (register.getUsuario() != null) {
					existe = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return existe;
	}

	/**
	 * Crea un usuario nuevo
	 * 
	 * @param usuario
	 * @param contraseña
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public void creaUsuario(String usuario, String contraseña, String contraseña2)
			throws ClassNotFoundException, IOException, SQLException {

		String sentenciaSql = "INSERT INTO REGISTER (USUARIO, CONTRASEÑA) VALUES (?, ?)";
		PreparedStatement pStatement = null;

		try {
			if (contraseña != contraseña2) {
				JOptionPane.showMessageDialog(null, "La contraseña no coincide.");
			} else {
				Connection connection = connectionByProp();
				if (compruebaUsuarioExiste(usuario, connection) == false) {
					pStatement = connection.prepareStatement(sentenciaSql);
					pStatement.setString(1, "USUARIO"); // USUARIO
					pStatement.setString(2, "CONTRASEÑA"); // CONTRASEÑA
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(null, "Usuario creado.");
				} else {
					JOptionPane.showMessageDialog(null, "Este nombre de usuario ya existe");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (pStatement != null)
				try {
					pStatement.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
	}
}
