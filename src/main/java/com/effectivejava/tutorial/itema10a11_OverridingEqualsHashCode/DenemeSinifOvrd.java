package com.effectivejava.tutorial.itema10a11_OverridingEqualsHashCode;

public class DenemeSinifOvrd {
	private int a,b;
	
	public DenemeSinifOvrd(int a, int b) {
		this.a=a;
		this.b=b;
	}
	

	// @Override elmemle default gelen equals u gecersiz kiliyorum eziyorum yani.
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if (!(obj instanceof DenemeSinifOvrd)) {
			return false;
		}
		
		DenemeSinifOvrd c = (DenemeSinifOvrd) obj;
		return Integer.compare(a, c.a) == 0
				&& Integer.compare(b, c.b) ==0;
		
	/*
	}
	// overload elttik. overload ettigimizde defaultu gecersiz kilmiyoruz. ONEMLI
	public boolean equals(DenemeSinifOvrd obj) {
		return super.equals(obj);
	}
	*/
		
	}
	
	// EGER equals methodu override edilmisse hashCode u da override etmez zorundayiz
		// bir nesnenin hashcodu na bakildigi klass da hashcode methodu yoksa null verir
		//1. yontem cok daha hizli calisiyor
	
	
		@Override
		public int hashCode() {
			int result = Integer.hashCode(b);
			result = 31*result+Integer.hashCode(a);
			
			return result;
		}
		
		
		/*
		// 2. yontem Autoboxing unautoboxing islemlerinden dolayi cok yavas calisiyor
		@Override
		public int hashCode() {
			return Objects.hash(a,b);
		}
		*/
		
		
}
