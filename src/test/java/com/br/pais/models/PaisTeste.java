package com.br.pais.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PaisTeste {

	private Pais pais1;
	private Pais pais2;
	private Pais pais3;

	@Before
	public void prepararPaises() {
		pais1 = new Pais();
		pais1.setCodigoIso("BRA");
		pais1.setNome("Braisl");
		pais1.setPopulacao(1);
		pais1.setDimensao(1d);

		pais2 = new Pais();
		pais2.setCodigoIso("BRA");
		pais2.setNome("Braisl");
		pais2.setPopulacao(1);
		pais2.setDimensao(1d);

		pais3 = new Pais();
		pais3.setCodigoIso("USA");
		pais3.setNome("Estados Unidos");
		pais3.setPopulacao(1);
		pais3.setDimensao(1d);

	}

	@Test
	public void testarIgualdade() {
		assertEquals("Os paises são iguais", pais1.comparaPaises(pais2));
	}

	@Test
	public void testarDiferenca() {
		assertEquals("Os paises são diferentes", pais1.comparaPaises(pais3));

	}

	@Test
	public void testerDensidade() {
		assertEquals(1, pais1.calculaDensidade(1, 1), 0d);

	}

}
