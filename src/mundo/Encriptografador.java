package mundo;

public class Encriptografador {

	public String criptografar(String textoClaro, int chave) {
		char[] array = textoClaro.toLowerCase().toCharArray();
		int i = 0;
		for (char c : array) {
			if(c >= 97 && c <= 122 ) {
				if((c + chave) > 122) {
					c = (char)(c-26 + chave);
				}else {
					c = (char)(c + chave);
				}
			}
			array[i] = c;
			i++;
		}
		String retorno = "";
		for (char c : array) retorno += String.valueOf(c);	
		return retorno;
	}

	public String descriptografar(String textoSecreto, int chave) {
		char[] array = textoSecreto.toCharArray();
		int i = 0;
		for (char c : array) {
			if(c >= 97 && c <= 122 ) {
				if((c - chave) < 97) {
					c = (char)(c + 26 - chave);
				}else {
					c = (char)(c - chave);
				}
			}
			array[i] = c;
			i++;
		}
		String retorno = "";
		for (char c : array) retorno += String.valueOf(c);	
		return retorno;
	}
	
}
