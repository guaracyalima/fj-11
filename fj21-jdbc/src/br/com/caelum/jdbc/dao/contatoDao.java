package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.modelo.contato;

public class contatoDao {

	private Connection connection;
	
	public contatoDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
	public void adciona (contato contato){
		String sql = "insert into contatos" +
	"(nome, email, endereco, dataNascimento)"+
				"values (?, ?, ?, ?)";
		
		try {
			PreparedStatement stm = connection.prepareStatement(sql);
			
			stm.setString(1, contato.getNome());
			stm.setString(2, contato.getEmail());
			stm.setString(3, contato.getEndereco());
			/*
			 * a importação desse date é do
			 * java.sql.Date; e não do java.util.Date!!!!!!!!
			 * */
			stm.setDate(4, new Date(contato.getDataNascimento1().getTimeInMillis()));
			
			stm.execute();
			
			stm.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	}
}
