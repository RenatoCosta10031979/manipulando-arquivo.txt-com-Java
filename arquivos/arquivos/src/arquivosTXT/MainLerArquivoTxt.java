package arquivosTXT;

import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Leitura de dados tipo string de um  arquivo.txt
				FileInputStream entradaArquivo = new FileInputStream(
						new File("/home/cafecomjava/arquivos/arquivos/arquivos.txt"));

				Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");


				while (lerArquivo.hasNext()) {

					String linha = lerArquivo.nextLine();
					
					System.out.println(linha);
				}
	}

}