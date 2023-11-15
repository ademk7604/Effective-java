package com.effectivejava.tutorial.item5_DependencyInj;

import java.util.function.Supplier;

public class ItemFiveTest {
	public static void main(String[] args) {
		
		//hic bir esneklik yok
		//YaziAnaliziUtility.isValid();
		
		//burdada esneklik yok her turlu cesitlemeye gitmiyor
		//YaziAnaliziSingleton.INSTANCE.isValid();
		
		Supplier<Sozluk> turkce = () -> new Sozluk("Turkce");
		
		
		YaziAnaliziDepInj asd = new YaziAnaliziDepInj(turkce);
		asd.isValid();
		
		//
		Supplier<String> fs = () -> "Adem"; // dikkat Supplier in get methodu var
		System.out.println(fs.get());
		
		YaziAnaliziUtility.upUzunBirMethodYaziyorumAklimaGelenKelimelerle();
		//bundan ziyade Supplier ile daha kisa ve hizli bir method yazalim
		
		Supplier<String> dahaKisa = () -> YaziAnaliziUtility.upUzunBirMethodYaziyorumAklimaGelenKelimelerle();
		
		dahaKisa.get(); // bu sekilde daha kisa
		
		double randomSayi = Math.random();
		System.out.println(randomSayi);
		System.out.println(randomSayi);
		
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		
	}

}
