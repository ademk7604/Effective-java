package com.effectivejava.tutorial.item4_UtilityClass_AbstractU;

public class ItemFourTest {
	public static void main(String[] args) {
		/*
		 *  uygulamanin bir cok yerinde kullandigimiz ortak metodlar vardir
		 *  bunlari bir cati altinda toplamak icin Utility class veya Enum kullaniriz.
		 *  Sadece method larin oldugu bir class ve enum da 
		 *  nesne olusturulmamiz icin Const private cekilir.
		 *  ve icerisinde de static methodlar bulunur
		 */
		
		
		/* Collections classinda goruldugu gibi
		 * Collections.sort(null);
		public class Collections {
		  
		    private Collections() {}
		  */
		
		
		/*
		 * public abstract class StringUtils, 
		 * Josh Bloch abstract class a karsi cikiyor. Ama StringUtils class i abstract :)
		 * nenden karsi cikiyor cunku bu class enxtends edildiginde yanlis yonlendirilebilir diyor
		 */
		
		
		// Bu sekilde Abstract class a extends ettiginiz bir siniftan nesne
		// olusturdugunuzda sizi yanlis yonlendirebili. Bu yuzden utility class Abs. yapmayin
		DenemeAbs dAbs = new Dene();
		Dene d = new Dene();
		
		//Bundan yola cikarak Utility class lari Enum yapabiliriz.
		
		// bu sekilde de Utility class ihtiyacimizi gidermis oluruz
		Enum.topla();
		
		
	}
}
