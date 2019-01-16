package tests;

import org.junit.jupiter.api.Test;

import exercice.PoleEmploi;
import junit.framework.Assert;

public class TestPoleEmploiJunit {
//	System.out.println(javanais("bonjour"));
//	System.out.println("bavonjavour");
//	System.out.println(javanais("chante"));
//	System.out.println(("chavantave"));
//	System.out.println(javanais("moyen"));
//	System.out.println((("mavoyen")));
//	System.out.println(javanais("exemple"));
//	System.out.println(("));
//	System.out.println(javanais("au"));
//	System.out.println(("avau"));
	
	@Test
	public void testExemple() {
		PoleEmploi poleEmploi = new PoleEmploi();
		String reponse = poleEmploi.javanais("exemple");
		Assert.assertEquals(reponse,"avexavemplave");
	}
	@Test
	public void testChante() {
		PoleEmploi poleEmploi = new PoleEmploi();
		String reponse = poleEmploi.javanais("chante");
		Assert.assertEquals(reponse,"chavantave");
	}
	@Test
	public void testMoyen() {
		PoleEmploi poleEmploi = new PoleEmploi();
		String reponse = poleEmploi.javanais("moyen");
		Assert.assertEquals(reponse,"mavoyen");
	}
	@Test
	public void testAu() {
		PoleEmploi poleEmploi = new PoleEmploi();
		String reponse = poleEmploi.javanais("au");
		Assert.assertEquals(reponse,"avau");
	}
	
	
	

}
