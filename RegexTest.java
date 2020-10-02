package com.capgemini.helloworld;

import java.util.Scanner;

public class Finalpassword {
	public static void main(String[] args){
		   try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[@$!%*#?&]{1}[0-9a-zA-Z]{8,}";
		if(password.matches(pattern))
		System.out.println(password);
		else return;
		}catch(Exception e){return;}}
}
