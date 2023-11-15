package com.effectivejava.tutorial.item5_DependencyInj;

public class YaziAnaliziUtility {
	
	private static final Sozluk turkce = new Sozluk("turkce");
	
	private YaziAnaliziUtility() {}
	//yazdik ama kontrol yok
	public static boolean isValid()
	{
		return true;
	}
	
	public static String upUzunBirMethodYaziyorumAklimaGelenKelimelerle()
	{
		return "Selam";
	}
}
