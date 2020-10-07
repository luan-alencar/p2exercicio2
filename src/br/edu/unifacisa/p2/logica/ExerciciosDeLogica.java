package br.edu.unifacisa.p2.logica;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;

import java.util.regex.*;

public class ExerciciosDeLogica {
	public static int somaArray(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma; // + 2; // kkkkkkkk
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

	public static boolean isCPF(String CPF) {
//		String formatacao = (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
//				+ CPF.substring(9, 11));
		/*
		 * Pesquise na internet. Existem algoritmos prontos. No site da receita federal
		 * existe a explica��o de como os d�gitos verificadores s�o calculados.
//		 */
//
//		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
//				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
//				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
//				|| CPF.equals("99999999999") || (CPF.length() != 11)) {
//			return false;
//		}
//
//		char dig10, dig11;
//		int sm, i, r, num, peso;
//
//		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
//		try {
//			// Calculo do 1o. Digito Verificador
//			sm = 0;
//			peso = 10;
//			for (i = 0; i < 9; i++) {
//				// converte o i-esimo caractere do CPF em um numero:
//				// por exemplo, transforma o caractere '0' no inteiro 0
//				// (48 eh a posicao de '0' na tabela ASCII)
//				num = (int) (CPF.charAt(i) - 48);
//				sm = sm + (num * peso);
//				peso = peso - 1;
//			}
//
//			r = 11 - (sm % 11);
//			if ((r == 10) || (r == 11)) {
//				dig10 = '0';
//			} else {
//				dig10 = (char) (r + 48); // converte no respectivo caractere numerico
//			}
//
//			// Calculo do 2o. Digito Verificador
//			sm = 0;
//			peso = 11;
//			for (i = 0; i < 10; i++) {
//				num = (int) (CPF.charAt(i) - 48);
//				sm = sm + (num * peso);
//				peso = peso - 1;
//			}
//
//			r = 11 - (sm % 11);
//			if ((r == 10) || (r == 11))
//				dig11 = '0';
//			else
//				dig11 = (char) (r + 48);
//
//			// Verifica se os digitos calculados conferem com os digitos informados.
//			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
//				return true;
//			} else {
//				return false;
//			}
//		} catch (InputMismatchException erro) {
//			return false;
//		}
		String padrao = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
		Pattern p = Pattern.compile(padrao);
	
		Matcher m2 = p.matcher(CPF);
	
		if(m2.find())
		{
			return false;
		}else
		{
			return true;
		}
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

//	String padrao = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
//	Pattern p = Pattern.compile(padrao);
//
//	Matcher m2 = p.matcher(CPF);
//
//	if(m2.find())
//	{
//		return false;
//	}else
//	{
//		return true;
//	}

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
