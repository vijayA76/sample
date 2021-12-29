package com.service;

import javax.servlet.http.Part;

public class Validate {
	public static String result;
	public static String userData(String name,String mob_num,String email,String pass,String answer )
	{
		if(name.charAt(0)!='<' && mob_num.charAt(0)!='<' && email.charAt(0)!='<') {
			if(name.length()<20 && mob_num.length()<11 && pass.length()<16 && email.length()<30 && answer.length()<10) {
				result="valid";
			}
			else {
				result="invalid";
			}
		}
		else {
			result="invalid";
		}
		return result;
	}
	public static String validateLogIn(String mob_num,String pass) {
		if(mob_num.charAt(0)!='<') {
			if(mob_num.length()<11 && pass.length()<10) {
				result="valid";
			}
			else {
				result="invalid";
			}
		}
		else {
			result="inavlid";
		}
		return result;
	}
	public static String validatePass(String mob_num,String answer) {
		if(mob_num.charAt(0)!='<') {
			if(mob_num.length()<11 && answer.length()<10) {
				result="valid";
			}
			else {
				result="invalid";
			}
		}
		else {
			result="inavlid";
		}
		return result;
	}
	public static String adminData(String username,String password) {
		if(username.charAt(0)!='<') {
			if(username.length()<21 && password.length()<21) {
				result="valid";
			}
			else {
				result="invalid";
			}
		}
		else {
			result="inavlid";
		}
		return result;
	}
	public static String validateImg(Part part) {
		
		String contentType = part.getContentType();
		long size = part.getSize();
		System.out.println(contentType);
		System.out.println(size);
		
		if(contentType.startsWith("image")) 
		{
			if(size<5000000) {                        // 5000000 around 5 MB
				result="valid";
			}
			else {
				result="invalidsize";
			}
		}
		else {
			result="invalidformat";
		}
		return result;
	}
}
