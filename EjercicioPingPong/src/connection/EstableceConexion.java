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

	/**
	 * Devuelve todos los datos de los jugadores
	 * 
	 * @param nombre
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
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
				register.setContrase�a(resultSet.getString("CONTRASE�A"));
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
		}

		return existe;
	}

	/**
	 * Crea un usuario nuevo
	 * 
	 * @param usuario
	 * @param contrase�a
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public void creaUsuario(String usuario, String contrase�a, String contrase�a2)
			throws ClassNotFoundException, IOException, SQLException {

		String sentenciaSql = "INSERT INTO REGISTER (USUARIO, CONTRASE�A) VALUES (?, ?)";
		PreparedStatement pStatement = null;
		Connection connection = null;
		try {
			connection = connectionByProp();
			if (compruebaUsuarioExiste(usuario, connection) == false) {
				pStatement = connection.prepareStatement(sentenciaSql);
				pStatement.setString(1, usuario); // USUARIO
				pStatement.setString(2, contrase�a); // CONTRASE�A
				try {
					pStatement.executeUpdate();
				} catch (SQLException sqle) {
					JOptionPane.showMessageDialog(null, "Este nombre de usuario ya existe");
					throw sqle;
				}

				JOptionPane.showMessageDialog(null, "Usuario creado.");
				connection.commit();
			}
		} catch (SQLException e) {
			connection.rollback();
			throw e;
		} finally {
			if (pStatement != null)
				try {
					pStatement.close();
				} catch (SQLException sqle) {
					throw sqle;
				}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	/**
	 * Comprueba si la cuenta est� registrada
	 * 
	 * @param usuario
	 * @param contrase�a
	 * @param connection
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean compruebaRegistro(String usuario, String contrase�a)
			throws IOException, ClassNotFoundException, SQLException {
		boolean existe = false;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		RegisterDatos registerD = null;
		String sentenciaSqle = "SELECT USUARIO, CONTRASE�A FROM REGISTER WHERE USUARIO = ? && CONTRASE�A = ?";
		try {
			connection = connectionByProp();
			preparedStatement = connection.prepareStatement(sentenciaSqle);
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, contrase�a);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				registerD = new RegisterDatos();
				registerD.setUsuario(resultSet.getString("USUARIO"));
				registerD.setContrase�a(resultSet.getString("CONTRASE�A"));
				if (registerD.getUsuario() == null) {
					existe = false;
				} else {
					existe = true;
				}
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
					resultSet = null;
				}
			} catch (SQLException e) {
				throw e;
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
					preparedStatement = null;
				}
			} catch (SQLException e) {
				throw e;
			}
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				throw e;
			}
		}

		return existe;
	}
}
