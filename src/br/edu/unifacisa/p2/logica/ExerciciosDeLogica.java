package br.edu.unifacisa.p2.logica;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;

import java.util.regex.*;

public class ExerciciosDeLogica {
	public static Integer somaArray(Integer[] numeros) {
		// criei uma lista Integer para receber o parametro
		List<Integer> valores = Arrays.asList(numeros);
		// instanciei uma variavel para somar os valores
		Integer soma = valores.stream()
				// reduce() e responsavel por somar cada elemento
				.reduce(0, (a, b) -> a + b);
		return soma; // e no final retorne
	}

	public static int getMaior(int[] numeros) {
		int maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > i) {
				maior = numeros[i];
			}
		}
		return maior;
	}

	public static int getMenor(int[] numeros) {
		int menor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0 || numeros[i] == 1) {
				menor = numeros[i];
			}
		}
		return menor;
	}

	public static double getMedia(int[] numeros) {
		int numero = numeros.length;
		double media = 0;
		for (int i = 0; i < numero; i++) {
			media += numeros[i];
		}
		return media / numero;
	}

	public static String[] inverteArray(String[] nomes) {
		// armazeno o tamanho do array nomes
		int tamanho = nomes.length;
		// criei outro array para armazenar o mesmo tamanho do
		// primeiro
		String[] outroArray = new String[tamanho];
		for (int i = 0; i < outroArray.length; i++) {
			tamanho--;
			// armazenei o antigo array no outro array que criei
			outroArray[i] = nomes[tamanho];
		}
		// enfim retorno o novo array com os valores invertidos
		return outroArray;
	}

	public static List<String> inverteLista(List<String> nomes) {
		Collections.reverse(nomes);
		return nomes;
	}

	public static String junta(List<String> nomes, String caractere) {
		String juntar = String.join(caractere, nomes);

		return juntar;
	}

	public static String substitui(String mensagem, String localizar, String substituir) {
		String msg = new String(mensagem.replaceAll(localizar, substituir));
		return msg;
	}

	public static boolean ehNumero(String valor) {
		char[] caractere = valor.toCharArray();
		boolean resposta = true;

		for (int i = 0; i < valor.length(); i++) {
			// se o caracter elemento nao for um digito
			if (!Character.isDigit(caractere[i])) {
				// resposta vai ser false
				resposta = false;
			}
		}
		// se nao for a condicao a cima automaticamente vai retornar true
		return resposta;
	}

	public static boolean validaCEP(String cep) {
		String padrao = "\\d{5}[-]\\d{2}";

		Pattern p = Pattern.compile(padrao);

		Matcher m2 = p.matcher(cep);

		if (m2.find()) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isCPF(String cpf) {
//		int iDigito1Aux = 0, iDigito2Aux = 0, iDigitoCPF;
//		int iDigito1 = 0, iDigito2 = 0, iRestoDivisao = 0;
//		String strDigitoVerificador, strDigitoResultado;
//
//		if (!cpf.substring(0, 1).equals("")) {
//			try {
//				cpf = cpf.replace('.', ' ');
//				cpf = cpf.replace('-', ' ');
//				cpf = cpf.replaceAll(" ", "");
//				for (int iCont = 1; iCont < cpf.length() - 1; iCont++) {
//					iDigitoCPF = Integer.valueOf(cpf.substring(iCont - 1, iCont)).intValue();
//					iDigito1Aux = iDigito1Aux + (11 - iCont) * iDigitoCPF;
//					iDigito2Aux = iDigito2Aux + (12 - iCont) * iDigitoCPF;
//				}
//				iRestoDivisao = (iDigito1Aux % 11);
//				if (iRestoDivisao < 2) {
//					iDigito1 = 0;
//				} else {
//					iDigito1 = 11 - iRestoDivisao;
//				}
//				iDigito2Aux += 2 * iDigito1;
//				iRestoDivisao = (iDigito2Aux % 11);
//				if (iRestoDivisao < 2) {
//					iDigito2 = 0;
//				} else {
//					iDigito2 = 11 - iRestoDivisao;
//				}
//				strDigitoVerificador = cpf.substring(cpf.length() - 2, cpf.length());
//				strDigitoResultado = String.valueOf(iDigito1) + String.valueOf(iDigito2);
//				return strDigitoVerificador.equals(strDigitoResultado);
//			} catch (Exception e) {
//				return false;
//			}
//		}
//		return true;
		String padrao = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
		Pattern p = Pattern.compile(padrao);

		Matcher m2 = p.matcher(cpf);

		if (m2.find()) {
			return false;
		} else {
			return true;
		}

	} // fim no metodo isCPF()

	public static long fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fatorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
