package br.com.livraria.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.livraria.modelo.Autor;

public class AutorDao {
	
	private Connection conexao;
	
	public AutorDao(Connection conexao) {
		this.conexao = conexao;
	}

	
	public void cadastrar(Autor autor) {
		try {
			
			
			 String sql= "insert into autores (nome,email,dataNascimento,miniCurriculo) values (?,?,?,?)";
			 
			 PreparedStatement ps = conexao.prepareStatement(sql);
			 ps.setString(1,autor.getNome());
			 ps.setString(2,autor.getEmail());
			 ps.setDate(3, Date.valueOf(autor.getDataNascimento()));
			 ps.setString(4,autor.getMiniCurriculo());
			 
			 ps.execute();
			 
		} catch (SQLException erro) {
			throw new RuntimeException(erro);
		}

	}

	public List<Autor> listar(){
			
		try {
			 String sql= "select nome,email, dataNascimento from autores";
			 
			 PreparedStatement ps = conexao.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();
			 
			 List<Autor> autores = new ArrayList<>();
			 
			 while (rs.next()) {
				Autor a = new Autor();
				a.setNome(rs.getString("nome"));
				a.setEmail(rs.getString("email"));
				a.setDataNascimento(rs.getObject("dataNascimento", LocalDate.class));
								
				autores.add(a);
				
				}
			 return autores;
			 } 
		catch (SQLException erro) {
			throw new RuntimeException(erro);
		}
	}
}
