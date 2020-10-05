package com.capgemini.helloworld;
import java.util.Scanner;
public class userRegistration{
	public static void main(String[] args){
	   try{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the phone ");
	String phone = sc.next();
	String pattern = "^[A-Za-z0-9]+[+-_]*/w*[@][A-Za-z0-9]*[.][A-Za-z]*[.][A-Za-z]*";
	if(phone.matches(pattern))
	System.out.println(phone);
	else return;
	}catch(Exception e){return;}}
	}

