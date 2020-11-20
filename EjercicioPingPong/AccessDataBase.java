import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import persistencia.Asignatura;
import persistencia.Empleado;

public class AccessDataBase {

	//constantes usadas en selectEmpleados
	private static final String SELECT_EMPLEADOS = "SELECT * FROM EMPLEADO";
	private static final String ID_EMPLEADO = "ID_EMPLEADO";
	private static final String NOMBRE = "NOMBRE";
	private static final String APELLIDOS = "APELLIDOS";
	private static final String DNI = "DNI";
	private static final String ID_TIPO_EMPLEADO = "ID_TIPO_EMPLEADO";
	private static final String DOMICILIO = "DOMICILIO";
	private static final String CODIGO_POSTAL = "CODIGO_POSTAL";
	private static final String EMAIL = "EMAIL";
	private static final String IND_VISIBLE = "IND_VISIBLE";
	
	//constantes usadas en selectAsignaturas
	private static final String SELECT_ASIGNATURAS = "SELECT A.* " + 
			" FROM ASIGNATURA A " + 
			" INNER JOIN CURSO C ON A.ID_CURSO = C.ID_CURSO " + 
			" INNER JOIN IMPARTE I ON A.ID_ASIGNATURA = I.ID_ASIGNATURA " + 
			" WHERE  C.NOMBRE=? AND I.ID_EMPLEADO=?";
	private static final String ID_ASIGNATURA="ID_ASIGNATURA";
	private static final String NOMBRE_ASIGNATURA="NOMBRE";
	private static final String ID_CURSO="ID_CURSO";
	private static final String HORAS="HORAS";
	private static final String IND_VISIBLE_ASIGNATURA="IND_VISIBLE";
	
	//Sentencias para realizar inserciones
	private static final String INSERT_EMPLEADO = "INSERT INTO EMPLEADO (NOMBRE, APELLIDOS, DNI, ID_TIPO_EMPLEADO, EMAIL) VALUES (?,?,?,?,?)";
	private static final String INSERT_ASIGNATURA = "INSERT INTO ASIGNATURA (NOMBRE, ID_CURSO, HORAS) VALUES (?,?,?)";
	private static final String INSERT_IMPARTE = "INSERT INTO IMPARTE (ID_ASIGNATURA,ID_EMPLEADO) VALUES (?,?)";
	
	//Sentencia para modificar asignatura
	private static final String UPDATE_ASIGNATURA = "UPDATE ASIGNATURA SET IND_VISIBLE=? WHERE ID_ASIGNATURA NOT IN (SELECT ID_ASIGNATURA FROM IMPARTE) ";
	
	
	/**
	 * Metodo para crear conexion con base de datos Mysql a la bbdd "colegio"
	 * 
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection createConnetion() throws ClassNotFoundException, SQLException {

		Connection connection = null;
		try {
			//Realizamos el registro del driver y obtenemos la conexión
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio?serverTimezone=UTC", "root",
					"root");
			// Nos aseguramos setAutoCommit a false que realizaremos commit solo cuando lo indiquemos
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		}

		return connection;
	}

	/**
	 * Metodo para conectar con base de datos Mysql leyendo nuestro fichero de
	 * propiedades
	 * 
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public Connection createConnByProp() throws ClassNotFoundException, SQLException, IOException {

		Connection connection = null;

		try {
			//Accedemos al fichero de propiedades para recuperar los datos para conectarnos a base de datos
			Properties propiedades = new Properties();
			propiedades.load(new FileReader("src/resources/database.properties"));
			String driver = propiedades.getProperty("database.driver");
			String url = propiedades.getProperty("database.url");
			String user = propiedades.getProperty("database.user");
			String password = propiedades.getProperty("database.password");

			//Relizamos el registro del driver y obtenemos la conexion
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

			// Nos aseguramos setAutoCommit a false que realizaremos commit solo cuando lo indiquemos
			connection.setAutoCommit(false);

		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			throw e;
		}

		return connection;
	}

	/**
	 * Metodo que realiza la desconexión a la conexión dada por parámetro
	 * 
	 * @param connection Connection
	 * @throws SQLException
	 */
	public void disconnect(Connection connection) throws SQLException {

		if (null != connection) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}

	/**
	 * Metodo para crear una lista con todos los datos de la tabla empleado
	 * 
	 * @return List<Empleado>
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Empleado> selectEmpleados() throws ClassNotFoundException, SQLException {

		//datos a devolver
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		//resources
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			//creamos la conexión a la base de datos
			connection = createConnetion();
			
			//ejecutamos la consulta y recuperamos el resultado
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SELECT_EMPLEADOS);
			Empleado empleado;
			while (resultSet.next()) {
				empleado = new Empleado();
				empleado.setIdEmpleado(resultSet.getLong(ID_EMPLEADO));
				empleado.setNombre(resultSet.getString(NOMBRE));
				empleado.setApellidos(resultSet.getString(APELLIDOS));
				empleado.setDni(resultSet.getString(DNI));
				empleado.setIdTipoEmpleado(resultSet.getLong(ID_TIPO_EMPLEADO));
				empleado.setDomicilio(resultSet.getString(DOMICILIO));
				empleado.setCodigoPostal(resultSet.getInt(CODIGO_POSTAL));
				if(resultSet.wasNull()) {
					empleado.setCodigoPostal(null);
				}
				empleado.setEmail(resultSet.getString(EMAIL));
				empleado.setIndVisible(resultSet.getBoolean(IND_VISIBLE));
				//añadimos cada dato a la lista final
				listaEmpleados.add(empleado);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return listaEmpleados;
	}

	/**
	 * Metodo que devuelve una lista de asignaturas segun unos parametros
	 * determinados
	 * 
	 * @param idEmpleado
	 * @param cursoName
	 * @return List<Asignatura>
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<Asignatura> selectAsignaturas(int idEmpleado, String cursoName) throws SQLException, ClassNotFoundException {
		
		//datos a devolver
		List<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();
		
		//resources
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			//creamos la conexión a la base de datos
			connection = createConnetion();
			
			//ejecutamos la consulta y recuperamos los datos devueltos
			preparedStatement = connection.prepareStatement(SELECT_ASIGNATURAS);
			preparedStatement.setString(1, cursoName);
			preparedStatement.setLong(2, idEmpleado);
			resultSet = preparedStatement.executeQuery();
			
			Asignatura asignatura;
			while (resultSet.next()) {
				asignatura = new Asignatura();
				asignatura.setIdAsignatura(resultSet.getInt(ID_ASIGNATURA));
				asignatura.setNombre(resultSet.getString(NOMBRE_ASIGNATURA));
				asignatura.setIdCurso(resultSet.getLong(ID_CURSO));
				asignatura.setHoras(resultSet.getInt(HORAS));
				asignatura.setIndVisible(resultSet.getBoolean(IND_VISIBLE_ASIGNATURA));
				
				//añadimos cada dato a la lista final
				listaAsignaturas.add(asignatura);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return listaAsignaturas;
	}
	
	/**
	 * Inserta un Empleado en la base de datos
	 * @param connection Connection
	 * @param empleado Empleado
	 * @return long ID_EMPLEADO creado
	 * @throws SQLException 
	 */
	private long insertEmpleado(Connection connection, Empleado empleado) throws SQLException {
		long idEmpleado = 0;
		
		PreparedStatement preparedStatement = null;
		ResultSet generatedKeys = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_EMPLEADO, Statement.RETURN_GENERATED_KEYS);
			
			//añado los valores para cada uno de los parametros
			preparedStatement.setString(1, empleado.getNombre());
			preparedStatement.setString(2, empleado.getApellidos());
			preparedStatement.setString(3, empleado.getDni());
			preparedStatement.setLong(4, empleado.getIdTipoEmpleado());
			preparedStatement.setString(5, empleado.getEmail());
			if (preparedStatement.executeUpdate() > 0) {
				generatedKeys = preparedStatement.getGeneratedKeys();
				if (generatedKeys.next()) {
					idEmpleado = generatedKeys.getLong(1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != generatedKeys) {
				try {
					generatedKeys.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return idEmpleado;
	}
	
	/**
	 * Inserta los datos de una asignatura en base de datos
	 * @param connection Connection
	 * @param asignatura Asignatura
	 * @return long ID_ASIGNATURA creada
	 * @throws SQLException
	 */
	private long insertAsignatura(Connection connection, Asignatura asignatura) throws SQLException {
		long idAsignatura = 0;
		
		PreparedStatement preparedStatement = null;
		ResultSet generatedKeys = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_ASIGNATURA, Statement.RETURN_GENERATED_KEYS);
			
			//añado los valores para cada uno de los parametros
			preparedStatement.setString(1, asignatura.getNombre());
			preparedStatement.setLong(2, asignatura.getIdCurso());
			preparedStatement.setLong(3, asignatura.getHoras());
			if (preparedStatement.executeUpdate() > 0) {
				generatedKeys = preparedStatement.getGeneratedKeys();
				if (generatedKeys.next()) {
					idAsignatura = generatedKeys.getLong(1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != generatedKeys) {
				try {
					generatedKeys.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return idAsignatura;
	}

	/**
	 * Asocia un empleado con la asignatura que imparte
	 * 
	 * @param connection Connection
	 * @param idAsignatura long
	 * @param idEmpleado long
	 * @return long ID_IMPARTE creado
	 * @throws SQLException
	 */
	private long insertImparte(Connection connection, long idAsignatura, long idEmpleado) throws SQLException {
		long idImparte = 0;
		
		PreparedStatement preparedStatement = null;
		ResultSet generatedKeys = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_IMPARTE, Statement.RETURN_GENERATED_KEYS);
			
			//añado los valores para cada uno de los parametros
			preparedStatement.setLong(1, idAsignatura);
			preparedStatement.setLong(2, idEmpleado);
			if (preparedStatement.executeUpdate() > 0) {
				generatedKeys = preparedStatement.getGeneratedKeys();
				if (generatedKeys.next()) {
					idImparte = generatedKeys.getLong(1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != generatedKeys) {
				try {
					generatedKeys.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return idImparte;
	}
	
	/**
	 * Metodo que inserta un empleado en la base de datos y le asigna dos asignaturas que son creadas
	 * 
	 * @param empleado Empleado
	 * @param asignatura1 Asignatura
	 * @param asignatura2 Asignatura
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void asignarAsignaturas(Empleado empleado, Asignatura asignatura1, Asignatura asignatura2)
			throws ClassNotFoundException, SQLException {

		
		Connection connection = null;
		
		try {
			//se crea la conexión con la base de datos
			connection = createConnetion();
			
			//creamos el empleado
			long idEmpleado = insertEmpleado(connection, empleado);
			
			//registramos las asignaturas
			long idAsignatura1 = insertAsignatura(connection, asignatura1);
			long idAsignatura2 = insertAsignatura(connection, asignatura2);
			
			//asignamos las asignaturas al empleado creado
			insertImparte(connection, idAsignatura1, idEmpleado);
			insertImparte(connection, idAsignatura2, idEmpleado);
			
			//si todo se realiza correctamente
			connection.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			//en caso de error, deshacemos los datos
			connection.rollback();
			
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos la conexión a bbdd
			try {
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Metodo para modificar el IND_VISIBLE de las asignaturas que no tienen asignado ningún empleado
	 * 
	 * @param indVisible valor a poner
	 * @throws ClassNotFoundException 
	 * @throws SQLException
	 */
	public void modificarAsignaturas(boolean indVisible) throws ClassNotFoundException, SQLException{

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			//se crea la conexión con la base de datos
			connection = createConnetion();
			//se realiza la modificación
			preparedStatement = connection.prepareStatement(UPDATE_ASIGNATURA);
			preparedStatement.setBoolean(1, indVisible);
			preparedStatement.executeUpdate();
			
			//si todo se realizó correctamente, confirmar
			connection.commit();

		} catch (ClassNotFoundException | SQLException e) {
			//en caso de error, deshacer los cambios
			connection.rollback();
			
			e.printStackTrace();
			throw e;
		} finally {
			//cerrar resources
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			try {
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Metodo principal de la clase
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		AccessDataBase helper = new AccessDataBase();
		try {
			//Listar los empleados
			final List<Empleado> listaEmpleados = helper.selectEmpleados();
			System.out.println(listaEmpleados);
			
			//Listar asignaturas
			List<Asignatura> listaAsignaturas = helper.selectAsignaturas(1, "DAM 1");
			System.out.println(listaAsignaturas);
			
			//Asignar un empleado a dos asignaturas nuevas
			Empleado empleado = new Empleado();
			empleado.setNombre("David");
			empleado.setApellidos("Garcia");
			empleado.setDni("05234566B");
			empleado.setIdTipoEmpleado(1);
			empleado.setEmail("dgarcia@efamoratalaz.com");
			
			Asignatura asignatura = new Asignatura();
			asignatura.setNombre("PROGRAMACION");
			asignatura.setIdCurso(1);
			asignatura.setHoras(6);
			
			Asignatura asignatura2= new Asignatura();			
			asignatura2.setNombre("DESARROLLO INTERFACES");
			asignatura2.setIdCurso(2);
			asignatura2.setHoras(8);
			
			helper.asignarAsignaturas(empleado, asignatura, asignatura2);
			
			// Ponemos a 1 (no visible) las asignaturas que no tienen asignado empleado
			helper.modificarAsignaturas(true);			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
