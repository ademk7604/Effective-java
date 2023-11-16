package com.effectivejava.tutorial.item6_AutoboxingAndUna;

import java.util.regex.Pattern;

public class RegExample {
	
	// gereksiz yere obje yaratmamak konumuz. uygulama buyuk ise performans dusuklugune neden olmasin
	
		private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
		
		public static boolean isRomanNumeral(String s)
		{
			return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
		}
		
		static boolean isNonNumeral(String s)
		{
			return ROMAN.matcher(s).matches();
		}
			
}
