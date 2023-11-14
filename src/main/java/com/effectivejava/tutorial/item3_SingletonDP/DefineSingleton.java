package com.effectivejava.tutorial.item3_SingletonDP;

public class DefineSingleton {
	
	// bunun boyle yapma ilerde update gelir sikinti
	public static DefineSingleton ds = new DefineSingleton(); 
	
	
	//peki bunun instance sini nerden uretecegim. yukarda
	private DefineSingleton() {
		
	}
	
	//bunu static factory method ile cagir
	public static DefineSingleton getInstance()
	{
		return ds;
	}

}
