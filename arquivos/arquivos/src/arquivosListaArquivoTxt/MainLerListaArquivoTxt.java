package arquivosListaArquivoTxt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class MainLerListaArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(
				new File("/home/cafecomjava/arquivos/arquivos/arquivoLista.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			// A condição abaixo não permite o scanner imprimir linhas vazias(linhas em
			// branco).
			// Propositalmente foi adicionado uma linha em branco para teste.
			if (linha != null && !(linha.isEmpty())) {

				String[] dados = linha.split("\\|"); // Quebra linha a cada vez que o scanner encontrar o caracter ";".
														// pulará para próxima linha.

				Pessoa pessoa = new Pessoa();
				
				//Salva e armazenada cada dados em um array (vetor)
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));
				pessoa.setEmail(dados[2]);
				
				listaPessoas.add(pessoa);
				
			}
		}
		for(Pessoa iterator: listaPessoas) {
		System.out.println("Pessoa: " +""+ iterator);
		}
	}

}