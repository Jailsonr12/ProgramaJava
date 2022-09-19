package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelaPesosas {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();

		String sql = "CREATE TABLE pessoas (" 
		+ "codigo INT AUTO_INCREMENT PRIMARY KEY" 
		+ "nome VARCHAR(80) NOT NULL "
		+ ")";

		Statement stmt = conexao.createStatement();
		stmt.execute(sql);

		System.out.println("Tabela Criada com sucesso");
		conexao.close();
	}
}
