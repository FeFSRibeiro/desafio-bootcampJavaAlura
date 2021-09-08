package br.com.livraria.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Autor {
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String miniCurriculo;
	
	
	public Autor() {
	
	}
	
	//Definindo construtor
	
	public Autor(String nome, String email, LocalDate dataNascimento, String miniCurriculo) {
		this.nome = nome;
		this.email=email;
		this.dataNascimento = dataNascimento;
		this.miniCurriculo = miniCurriculo;
	}
	
	
	@Override
	public String toString() {
		return "Nome do autor: "+nome+ "\n"+
			   "E-mail: "+email+ "\n"+
				"Data de Nascimento: " +dataNascimento +"\n"+
				"Mini currículo: "+ miniCurriculo +"\n" ;
	}
	
	//Getter e Setters
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	
	public String getMiniCurriculo() {
		return this.miniCurriculo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDataNascimento (LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setMiniCurriculo(String miniCurriculo) {
		this.miniCurriculo = miniCurriculo;
	}
	
}
