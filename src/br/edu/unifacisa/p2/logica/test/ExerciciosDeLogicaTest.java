package br.edu.unifacisa.p2.logica.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unifacisa.p2.logica.ExerciciosDeLogica;

class ExerciciosDeLogicaTest {

  @Test
  void testSomaArray() {
    int[] numeros = new int[] {2, 3, 6, 7};
    assertEquals(18, ExerciciosDeLogica.somaArray(numeros));
  }

  @Test
  void testGetMaior() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(7, ExerciciosDeLogica.getMaior(numeros));
  }

  @Test
  void testGetMenor() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(1, ExerciciosDeLogica.getMaior(numeros));
  }

  @Test
  void testGetMedia() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(2.8, ExerciciosDeLogica.getMedia(numeros), 0.1);
  }

  @Test
  void testInverteArray() {
    String[] nomes = new String[] {"a", "b", "c"};
    assertArrayEquals(new String[] {"c", "b", "a"}, ExerciciosDeLogica.inverteArray(nomes));
  }

  @Test
  void testInverteLista() {
    List<String> nomes = Arrays.asList("a", "b", "c");
    assertArrayEquals(new String[] {"c", "b", "a"}, ExerciciosDeLogica.inverteLista(nomes).toArray(new String[nomes.size()]));
  }

  @Test
  void testJunta() {
    List<String> nomes = Arrays.asList("a", "b", "c");
    assertEquals("a,b,c", ExerciciosDeLogica.junta(nomes, ","));
  }

  @Test
  void testSubstitui() {
    String mensagem = "Para <<NOME>>: <<NOME>>, espero voc� na reuni�o.";
    assertEquals("Para Ana: Ana, espero voc� na reuni�o.", ExerciciosDeLogica.substitui(mensagem, "<<NOME>>", "Ana"));
  }

  @Test
  void testEhNumero() {
    assertTrue(ExerciciosDeLogica.ehNumero("9"));
    assertTrue(ExerciciosDeLogica.ehNumero("123"));
    assertFalse(ExerciciosDeLogica.ehNumero("123b"));
    assertFalse(ExerciciosDeLogica.ehNumero("x123b"));
  }

  @Test
  void testValidaCEP() {
    assertTrue(ExerciciosDeLogica.validaCEP("58100-000"));
    assertFalse(ExerciciosDeLogica.validaCEP("58100000"));
    assertFalse(ExerciciosDeLogica.validaCEP("5810000011"));
    assertTrue(ExerciciosDeLogica.validaCEP("78102-011"));
  }

  @Test
  void testisCPF() {
    /* 
     * Um CPF v�lido tem:
     * - 9 n�meros separados por .
     * - 2 d�gitos verificadores
     */
    assertTrue(ExerciciosDeLogica.isCPF("443.344.420-05"));
    assertTrue(ExerciciosDeLogica.isCPF("776.863.620-19"));
    assertTrue(ExerciciosDeLogica.isCPF("847.153.580-77"));
    // CPFs inv�lidos
    assertFalse(ExerciciosDeLogica.isCPF("443.344.420-06"));
    assertFalse(ExerciciosDeLogica.isCPF("776.863.620-18"));
    // N�o s�o v�lidos CPFs formados por n�meros iguais
    assertFalse(ExerciciosDeLogica.isCPF("000.000.000-00"));
    assertFalse(ExerciciosDeLogica.isCPF("111.111.111-11"));
    assertFalse(ExerciciosDeLogica.isCPF("222.222.222-22"));
    assertFalse(ExerciciosDeLogica.isCPF("333.333.333-33"));
  }

  @Test
  void testFatorial() {
    assertEquals(1, ExerciciosDeLogica.fatorial(0));
    assertEquals(1, ExerciciosDeLogica.fatorial(1));
    assertEquals(2, ExerciciosDeLogica.fatorial(2));
    assertEquals(5, ExerciciosDeLogica.fatorial(120));
  }

  @Test
  void testFibonacci() {
    assertEquals(0, ExerciciosDeLogica.fibonacci(0));
    assertEquals(1, ExerciciosDeLogica.fibonacci(1));
    assertEquals(1, ExerciciosDeLogica.fibonacci(2));
    assertEquals(2, ExerciciosDeLogica.fibonacci(3));
    assertEquals(3, ExerciciosDeLogica.fibonacci(4));
    assertEquals(5, ExerciciosDeLogica.fibonacci(5));
    assertEquals(8, ExerciciosDeLogica.fibonacci(6));
    assertEquals(13, ExerciciosDeLogica.fibonacci(7));
  }
}
