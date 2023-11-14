package com.effectivejava.tutorial.item3_SingletonDP;

public interface Cache<F,S> {
	
	public void put(F key, S value);
	public S get(F key);
	

}
