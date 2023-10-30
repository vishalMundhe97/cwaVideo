package com.Amazon_testBase;

public class B2C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccddddE";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			int counter=0;
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++){
				if(c==ch[j]){   
		     			counter++;
				ch[j] = '\u0000'; // OR ch[j] = 0; 
				}
			}
			if(counter>0)
			System.out.println(c+" "+counter);
		} 

	}

}
