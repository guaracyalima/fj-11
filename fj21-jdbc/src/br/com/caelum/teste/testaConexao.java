package br.com.caelum.teste;

import java.sql.*;
import br.com.caelum.jdbc.ConnectionFactory;

public class testaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta com sucesso!");
		connection.close();
	}
}
