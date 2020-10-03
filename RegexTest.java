package com.capgemini.helloworld;
import java.util.Scanner;
public class userRegistration{
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

import java.util.Scanner;
public class finalPassword {
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

  
import java.util.Scanner;
public class finalPassword2 {
public static void main(String[] args){
		   try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		String pattern = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
		if(password.matches(pattern))
		System.out.println(password);
		else return;
		}catch(Exception e){return;}}
		}

import java.util.Scanner;
public class finalPassword1 {
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

import java.util.regex.*;
import java.util.Scanner;
public class Phone {
	
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

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistraion
{
  public static void main (String[]args)
	{
		try
		{
      Scanner sc = new Scanner (System.in);
			System.out.println ("Enter the email id");
			String email = sc.next ();
			String pattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			if (email.matches (pattern))
	     	System.out.println (email);
			else
				return;
		}
		catch (Exception e)
		{
			return;
		}
  }
  
public class UserReigstration{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ");
			String lname = sc.next();
			String pattern = "[A-Z]*[a-zA-Z]{3,}$";
			if(lname.matches(pattern))
				System.out.println(lname);
else
				return;
		}
		catch (Exception e)
		{
			return;
		}
  }

import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name");
			String fname = sc.next();
			String pattern = "[A-Z]*[a-zA-Z]{3,}$";
			if(fname.matches(pattern))
				System.out.println(fname);
			else return;
		}catch(Exception e){return;}}
