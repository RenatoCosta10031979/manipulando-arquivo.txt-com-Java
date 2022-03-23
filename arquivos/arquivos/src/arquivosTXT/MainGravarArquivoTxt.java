package arquivosTXT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGravarArquivoTxt {

	public static void main(String[] args) throws IOException {
		
		//Gravação de dados tipo string em um arquivo.txt
		File arquivo = new File("/home/cafecomjava/arquivos/arquivos/arquivos.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();

		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);

		escrever_no_arquivo.write("Hello world\n");
		

		for (int i = 1; i <= 5; i++) {
			escrever_no_arquivo.write(i + "Estudando java\n");

		}
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close(); // final da gravação dados em um arquivo.txt
		
		
		
		}
}