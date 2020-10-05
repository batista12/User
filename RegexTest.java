package com.capgemini.helloworld;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   try{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the phone ");
	String phone = sc.next();
	String pattern = "^[0/91]{2}[' ']{1}[789]{1}[0-9]{9}$";
	if(phone.matches(pattern))
	System.out.println(phone);
	else return;
	}catch(Exception e){return;}}
	}

