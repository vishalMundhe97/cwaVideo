package com.Amazon_testBase;

public class StringINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vishal123mundhe";
		String[] v=s.split("\\d+D");
		for (String part : v) {
			System.out.println(part);
			
		}
	}

}
