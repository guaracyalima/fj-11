package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.contatoDao;
import br.com.caelum.modelo.contato;

public class testaInsere {

	public static void main(String[] args) {
		contato contato = new contato();
		
		contato.setNome("Caelum");
		contato.setEmail("contato@forebulinos.com.br");
		contato.setEndereco("Rua pqp, Nº 777, b. putaiada, ilhes - pko");
		contato.setDataNascimento(Calendar.getInstance());
		
		contatoDao dao = new contatoDao();
		
		dao.adciona(contato);
		
		System.out.println("Operação realizada com sucesso");
	}
}
