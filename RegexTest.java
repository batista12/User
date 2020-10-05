package com.capgemini.helloworld;
import java.util.Scanner;
public class Password {
	public static void main(String[] args){
		   try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		String pattern = "[^ ]{8,}$";
		if(password.matches(pattern))
		System.out.println(password);
		else return;
		}catch(Exception e){return;}}
		}

