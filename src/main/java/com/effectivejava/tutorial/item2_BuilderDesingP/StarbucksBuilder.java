package com.effectivejava.tutorial.item2_BuilderDesingP;

public class StarbucksBuilder {
	
	//gerekli
	private String kahveBoyutu;
	
	//secime gore degisir
	private String laktozsuzSutMiktari;
	private String yumusatici;
	
	
	
	public static class Builder{
		
		//gerekli
		private final String kahveBoyutu;
		
		//secime gore degisir
		private String laktozsuzSutMiktari;
		private String yumusatici;
		
		public Builder(String kahveBoyutu) {
			this.kahveBoyutu = kahveBoyutu;
		}
		
		
		public Builder laktozsuzIcenler(String laktozsuzSut)
		{
			laktozsuzSutMiktari = laktozsuzSut;
			return this;
		}
		
		public Builder yumusakIcenler(String yumusakDeger)
		{
			yumusatici=yumusakDeger;
			return this;
		}
		
		public StarbucksBuilder build()
		{
			return new StarbucksBuilder(this);
		}
		
		
	}
	
	public StarbucksBuilder(Builder builder) {
		kahveBoyutu=builder.kahveBoyutu;
		laktozsuzSutMiktari=builder.laktozsuzSutMiktari;
		yumusatici=builder.yumusatici;
	}
	/*
	 * Builder Desing pattern in temel mantigi su:
	 * Obsiyonel paramaetrelerin cok olmasi lazim
	 * ayni zamanda constructor icinsindeki parametrelerin ornegin 
	 * 5 ten veya 6 dan fazla degerlere ciktiginda genelde tercih ediliyor.
	 */
	
	/*
	 * Peki Builder methodun dezavantaji yokmu?
	 * Eger gerekmeyen bir yerde gerezsiz bir sekilde birsey kullanirsaniz bu herturlu zararlidir.
	 * or, bir sinizfimiz var sadece iki tane degiskeni var yani kompleks bir yapisi yoksa, 
	 * ikiside gerekli parametre ise burda gidip builder D P kullanirsaniz isleri karistirmis oluruz.
	 */
	
	
	
	

}
