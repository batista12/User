package com.capgemini.helloworld;
import java.util.Scanner;
public class Password2 {
	public static void main(String[] args){
		   try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		String pattern = "^(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
		if(password.matches(pattern))
		System.out.println(password);
		else return;
		}catch(Exception e){return;}}
		}


