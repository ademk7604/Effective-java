package com.effectivejava.tutorial.item9a10_OverridingEqualsHashCode;

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
}
