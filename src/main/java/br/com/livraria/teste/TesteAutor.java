package br.com.livraria.teste;

import java.time.LocalDate;

import br.com.livraria.modelo.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor fernanda = new Autor();
		fernanda.setNome("Fernanda");
		fernanda.setEmail("nanda.f.santos@gmail.com");
		fernanda.setDataNascimento(LocalDate.of(1988,7,11));
		fernanda.setMiniCurriculo("Profissional formada em Sistemas de Informação, pós-graduada em Administração de Banco\r\n"
				+ "de Dados, com 11 anos de experiência na área de TI e certificada em ITIL v3. Habituada a\r\n"
				+ "trabalhar em ambientes de missão crítica em empresas de médio e grande portes, como DBA.");

		
		
//		fernanda.getNome();
//		fernanda.getEmail();
//		fernanda.getDataNascimento();
//		fernanda.getMiniCurriculo();
		
		
		System.out.println(fernanda);
	}

}
 