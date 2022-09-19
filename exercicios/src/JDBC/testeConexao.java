package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String stringDeConexao = "jdbc:mysql://localHost";
		final String usuario = "root";
		final String senha= "1234567890";
		
		Connection conexao = DriverManager
				.getConnection(stringDeConexao, usuario, senha);
		
		
		System.out.println("Conexao efetuada com sucesso!");
		conexao.close();
		
	}

}
