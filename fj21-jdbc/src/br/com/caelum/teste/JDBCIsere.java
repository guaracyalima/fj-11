package br.com.caelum.teste;

import java.sql.*;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;
public class JDBCIsere {

	public static void main(String[] args) throws SQLException{
		
		//Conecta com o banco de dados atravez da fabrica de conexoes
		
		Connection con = new ConnectionFactory().getConnection();
		
		String sql = "insert into contatos" + 
		" (nome, email, endereco, dataNascimento) " 
		+ " values (?, ?, ?, ?)";
		
		PreparedStatement stm = con.prepareStatement(sql);
		
		//inserçãod dos dados no banco de dados
		stm.setString(1, "Caelum");
		stm.setString(2, "contato@caelum.com.br");
		stm.setString(3, "R. Vergueiro 3185 cj57");
		stm.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		
		//execução do codigo
		
		stm.execute();
		
		//fechamento da conexao
		
		stm.close();
		
		System.out.println("Gravado com sucesso!");
	}
	
}
