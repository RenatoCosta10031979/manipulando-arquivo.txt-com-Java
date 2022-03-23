package arquivosListaArquivoTxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainGravarListaPessoaTxt {

	public static void main(String[] args) throws IOException {

		// Instanciar objeto e atribuir informações
				Pessoa p1 = new Pessoa();
				p1.setNome("Leonço Bragantino Neto");
				p1.setIdade(43);
				p1.setEmail("123456@gmail.com");
				
				Pessoa p2 = new Pessoa();
				p2.setNome("Mariana Conceição  das Rosas");
				p2.setIdade(25);
				p2.setEmail("987654@hotmail.com");
				
				Pessoa p3 = new Pessoa();
				p3.setNome("José da Silva Xavier");
				p3.setIdade(65);
				p3.setEmail("124765@bol.com.br");
				
				// Criar uma lista para armazenar os dados p1,p2 e p3
				
				List<Pessoa> pessoas = new ArrayList<Pessoa>();
				pessoas.add(p1);
				pessoas.add(p2);
				pessoas.add(p3);
				
				File arquivo = new File("/home/cafecomjava/arquivos/arquivos/arquivoLista.txt");
				
				if(!arquivo.exists()) {
					arquivo.createNewFile();
				}
				
				FileWriter escrever_arquivo = new FileWriter(arquivo);
				
				for (Pessoa iterator : pessoas) {
					
					escrever_arquivo.write(iterator.getNome()+";"+ iterator.getIdade()+";"+ iterator.getEmail()+"\n");
				
				}
				
				escrever_arquivo.flush();
				escrever_arquivo.close();
			}

}
