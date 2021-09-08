package br.com.livraria.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.livraria.dao.AutorDao;

public class ConnectionFactory {
	
	
	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3307/livraria"; 
			String usuario = "livraria";
			String senha = "mudar@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexao =  DriverManager.getConnection(url,usuario,senha);
			return conexao;
		}catch(Exception erro) {
			throw new RuntimeException(erro);
		}
	}
}
