package br.com.livraria.teste;

import java.time.LocalDate;

import br.com.livraria.modelo.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor fernanda = new Autor();
		fernanda.setNome("Fernanda");
		fernanda.setEmail("nanda.f.santos@gmail.com");
		fernanda.setDataNascimento(LocalDate.of(1988,7,11));
		fernanda.setMiniCurriculo("Profissional formada em Sistemas de Informa��o, p�s-graduada em Administra��o de Banco\r\n"
				+ "de Dados, com 11 anos de experi�ncia na �rea de TI e certificada em ITIL v3. Habituada a\r\n"
				+ "trabalhar em ambientes de miss�o cr�tica em empresas de m�dio e grande portes, como DBA.");

		
		
//		fernanda.getNome();
//		fernanda.getEmail();
//		fernanda.getDataNascimento();
//		fernanda.getMiniCurriculo();
		
		
		System.out.println(fernanda);
	}

}
 