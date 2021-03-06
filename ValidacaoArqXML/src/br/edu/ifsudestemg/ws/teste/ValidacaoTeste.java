package br.edu.ifsudestemg.ws.teste;

import java.io.File;

import br.edu.ifsudestemg.ws.validacao.ValidacaoArquivoXML;

public class ValidacaoTeste {

	public static void main(String[] args) {
		ValidacaoArquivoXML validador = new ValidacaoArquivoXML();
		try {
			 validador.valida(new File("arquivos/smartphone.xml"), new File("arquivos/smartphone.xsd"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
