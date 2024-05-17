package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
	// Configura tus credenciales de conexión
	private static final String URL = "jdbc:mysql://localhost:3306/restaurante";
	private static final String USUARIO = "root";
	private static final String CONTRASEÑA = "pass";

	// Método para obtener la conexión
	public static Connection obtenerConexion() throws SQLException {
		Connection conexion = null;
		try {
			// Carga el driver de MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establece la conexión
			conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
		} catch (ClassNotFoundException e) {
			// Manejo de errores de clase no encontrada
			e.printStackTrace();
		}
		return conexion;
	}

	// Método para cerrar la conexión
	public static void cerrarConexion(Connection conexion) {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				// Manejo de errores al cerrar la conexión
				e.printStackTrace();
			}
		}
	}

	// Método para comprobar la conexión
	public static boolean comprobarConexion() {
		Connection conexion = null;
		try {
			conexion = obtenerConexion();
			// Si no se produce una excepción al obtener la conexión, se considera que la
			// conexión es exitosa
			return true;
		} catch (SQLException e) {
			// Manejo de errores de conexión
			e.printStackTrace();
			return false;
		} finally {
			// Cerrar la conexión después de la comprobación
			cerrarConexion(conexion);
		}
	}

	// Método para verificar las credenciales de usuario
	public static boolean verificarCredenciales(String nick, String contraseña) {
		Connection conexion = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			conexion = obtenerConexion();
			String consulta = "SELECT * FROM usuario WHERE nick = ? AND contraseña = ?";
			statement = conexion.prepareStatement(consulta);
			statement.setString(1, nick);
			statement.setString(2, contraseña);
			resultSet = statement.executeQuery();

			// Si hay resultados, significa que las credenciales son correctas
			return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			// Cerrar recursos
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			cerrarConexion(conexion);
		}
	}
}
