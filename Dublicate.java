package com.Amazon_testBase;

import java.util.ArrayList;

public class Dublicate {

	public static void main(String[] args) {
		String s="Ganesha Gh";
		
		
		//int total=0;
		char[] inp=s.toCharArray();
		for(int i=0;i<inp.length;i++) {
			int cnt=0;
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				if(c==inp[j]) {
					//System.out.println(inp[i]+" ");
					cnt++;
					inp[j]=0;
					//total++;
				}
				
			}
			if(cnt>1)
				System.out.println(c+" "+cnt);
		}
	
  
	}

}
