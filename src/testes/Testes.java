package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import principais.Repartidor;

//@author Jose Lucas Aguiar da Silva
//DESENVOLVIMENTO GUIADO POR TESTES

public class Testes {
	
	@Test
	public void isAcronimo() {
		assertTrue(Repartidor.isAcronimo("CPF")); // É 
		assertFalse(Repartidor.isAcronimo("jose"));// NÃO É
		assertTrue(Repartidor.isAcronimo("C")); // PARA CASO DE TESTE É
	}
	
	@Test
	public void primeiraLetraEhNumero(){
		assertTrue(Repartidor.firstCharIsLetter("jose"));
		assertTrue(Repartidor.firstCharIsLetter("CPF"));
		assertFalse(Repartidor.firstCharIsLetter("1lucas"));
	}
	
	@Test
	public void existeCaracteresEspeciais(){
		assertTrue(Repartidor.existeCaracteresEspeciais("$#oi"));
		assertFalse(Repartidor.existeCaracteresEspeciais("jose123"));
	}
	
	@Test
	public void checaLista(){
		List<String> lista = Repartidor.quebraCamelCase("CPF10joseLucas");
		assertEquals(4,lista.size());
		assertEquals("CPF",lista.get(0));
		assertEquals("10",lista.get(1));
		assertEquals("jose",lista.get(2));
		assertEquals("lucas",lista.get(3));

	}

}
