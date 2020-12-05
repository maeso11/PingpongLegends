package connection;

import java.io.FileReader;
import modelo.Informacion;
import modelo.ModeloClasificacion;
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
		Connection connection = null;
		try {
			connection = connectionByProp();
			if (compruebaUsuarioExiste(usuario, connection) == false) {
				pStatement = connection.prepareStatement(sentenciaSql);
				pStatement.setString(1, usuario); // USUARIO
				pStatement.setString(2, contraseña); // CONTRASEÑA
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
	 * Comprueba si la cuenta está registrada
	 * 
	 * @param usuario
	 * @param contraseña
	 * @param connection
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean compruebaRegistro(String usuario, String contraseña)
			throws IOException, ClassNotFoundException, SQLException {
		boolean existe = false;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		RegisterDatos registerD = null;
		String sentenciaSqle = "SELECT USUARIO, CONTRASEÑA FROM REGISTER WHERE USUARIO = ? && CONTRASEÑA = ?";
		try {
			connection = connectionByProp();
			preparedStatement = connection.prepareStatement(sentenciaSqle);
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, contraseña);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				registerD = new RegisterDatos();
				registerD.setUsuario(resultSet.getString("USUARIO"));
				registerD.setContraseña(resultSet.getString("CONTRASEÑA"));
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

	/**
	 * Devuelve datos clasificacion según el nombre pasado
	 * 
	 * @param nombre
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public int devuelvePuntos(String nombre) throws ClassNotFoundException, SQLException, IOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ModeloClasificacion clasif = null;
		int puntos = 0;
		String sentenciaSqle = "SELECT * FROM CLASIFICACION WHERE NOMBRE = ?";
		try {
			connection = connectionByProp();
			preparedStatement = connection.prepareStatement(sentenciaSqle);
			preparedStatement.setString(1, nombre);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				clasif = new ModeloClasificacion();
				clasif.setNombre(resultSet.getString("NOMBRE"));
				clasif.setPuntos(resultSet.getInt("PUNTOS"));
				puntos = clasif.getPuntos();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
					resultSet = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
			try {
				disconect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
		return puntos;
	}

	/**
	 * Actualiza los puntos en la bbdd
	 * 
	 * @param puntos
	 * @param nombre
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public void actualizaPuntos(int puntos, String nombre) throws ClassNotFoundException, IOException, SQLException {
		String sentenciaSql = "UPDATE CLASIFICACION SET PUNTOS = ? WHERE NOMBRE = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;
		try {
			connection = connectionByProp();
			pStatement = connection.prepareStatement(sentenciaSql);
			pStatement.setInt(1, puntos); // PUNTOS
			pStatement.setString(2, nombre); // NOMBRE
			try {
				pStatement.executeUpdate();
			} catch (SQLException sqle) {
				throw sqle;
			} finally {
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
					connection = null;
				}
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	/**
	 * Actualiza el jugador en la bbdd
	 * 
	 * @param puntos
	 * @param nombre
	 * @param alias
	 * @param edad
	 * @param ciudad
	 * @param lateralidad
	 * @param golpeEstrella
	 * @param ataque
	 * @param defensa
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public void actualizaJugador(String alias, int edad, String ciudad, String lateralidad,
			String golpeEstrella, String ataque, String defensa, String nombre)
			throws ClassNotFoundException, IOException, SQLException {
		String sentenciaSql = "UPDATE INFORMACION SET ALIAS = ?, EDAD = ?, CIUDAD = ?, LATERALIDAD = ?, GOLPE_ESTRELLA = ?, ATAQUE = ?, DEFENSA = ? WHERE NOMBRE = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;
		try {
			connection = connectionByProp();
			pStatement = connection.prepareStatement(sentenciaSql);
			pStatement.setString(1, alias);
			pStatement.setInt(2, edad);
			pStatement.setString(3, ciudad);
			pStatement.setString(4, lateralidad);
			pStatement.setString(5, golpeEstrella);
			pStatement.setString(6, ataque);
			pStatement.setString(7, defensa);
			pStatement.setString(8, nombre);
			try {
				pStatement.executeUpdate();
			} catch (SQLException sqle) {
				throw sqle;
			} finally {
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
					connection = null;
				}
			} catch (SQLException e) {
				throw e;
			}
		}
	}
}
