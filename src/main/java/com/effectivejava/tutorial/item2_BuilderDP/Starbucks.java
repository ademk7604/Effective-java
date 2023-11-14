package com.effectivejava.tutorial.item2_BuilderDP;

public class Starbucks {

		//gerekli
		private String kahveBoyutu;
		
		//secime gore degisir
		private String laktozsuzSutMiktari;
		private String yumusatici;
		
		/* 2. cozum
		 *JavaBeans Pattern
		 * bos constructor araciligiya verileri set etme yontemi
		public Starbucks() {
			
		}

		public void setKahveBoyutu(String kahveBoyutu) {
			this.kahveBoyutu = kahveBoyutu;
		}

		public void setLaktozsuzSutMiktari(String laktozsuzSutMiktari) {
			this.laktozsuzSutMiktari = laktozsuzSutMiktari;
		}

		public void setYumusatici(String yumusatici) {
			this.yumusatici = yumusatici;
		}
		*/
		
		/* 1.cozum
		// Telescope Pattern diye geciyor. 
		 * iyi bir cozum degil. hepsi icin ayri bir constracter uretmek :)
		
		public Starbucks(String kahveBoyutu) {
			this.kahveBoyutu = kahveBoyutu;
		}
		public Starbucks(String kahveBoyutu, String laktozsuzSutMiktari) {
			this.kahveBoyutu = kahveBoyutu;
			this.laktozsuzSutMiktari = laktozsuzSutMiktari;
		}
		*/
}
