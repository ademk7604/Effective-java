package com.effectivejava.tutorial.item3_SingletonDP;

public class ItemThreeTest {
	
	public static void main(String[] args) {
		
		/* 
		 * bu singleton a tesr bir durumdur. 
		 * cunku Sngleton derki bir sinifin sadece 1 tane instance si olmalidir
		 * 
		 
		DefineSingleton ds =  DefineSingleton.ds;
		DefineSingleton ds2 = DefineSingleton.getInstance();
		
		System.out.println(ds.hashCode());//1510467688

		System.out.println(ds2.hashCode());//1510467688
		*/
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println("HashCode of Lazy: "+LazyCache.getInstance().hashCode());
				System.out.println("HashCode of Eager: "+ EagerCache.getInstance().hashCode());
				System.out.println("HashCode of Enum: "+CacheSingleton.INSTANCE.hashCode());
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				
				}
				System.out.println("HashCode of Lazy: "+LazyCache.getInstance().hashCode());
				System.out.println("HashCode of Eager: "+ EagerCache.getInstance().hashCode());
				System.out.println("HashCode of Enum: "+CacheSingleton.INSTANCE.hashCode());
			}
		}).start();
		
	}
	// Lazy nin Singleton ozelligi korunamiyor

}
