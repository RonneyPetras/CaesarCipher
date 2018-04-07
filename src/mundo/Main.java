package mundo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String op = null;
		Encriptografador encrip = new Encriptografador();
		while(true) {
			System.out.print("Digite:\n"
					+ "1 - Cripitografar\n"
					+ "2 - Descripitografar\n"
					+ "Outra tecla para sair.\n>> ");
			op = s.nextLine();
			if(!(op.equals("1") || op.equals("2"))) {
				System.out.println("Bye!");
				break;
			}
			System.out.print("Digite o texto.\n>> ");
			String texto = s.nextLine();
			System.out.print("Digite o valor da chave.\n>> ");
			int chave = s.nextInt();
			if(chave >=0 && chave <=25) {
				String resultado = null;
				if(op.equals("1")) {
					resultado = encrip.criptografar(texto, chave);
					System.out.println("Texto criptografado: " + resultado + "\n");
				}else{
					resultado = encrip.descriptografar(texto, chave);
					System.out.println("Texto descriptografado: " + resultado + "\n");
				}
				
			}else {
				System.out.println("Valor de chave invalida!");
			}
			System.out.println("Pressione Enter para continuar.");
			s.nextLine();
			s.nextLine();
		}
		s.close();
	}

}
