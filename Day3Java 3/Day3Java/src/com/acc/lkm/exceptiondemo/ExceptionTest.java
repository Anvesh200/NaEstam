package com.acc.lkm.exceptiondemo;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a[]=new int[10];
			a[20]=400;
			String str="Accenture";
			Integer num=Integer.valueOf(str);
			System.out.println(num);
			String str2=null;
			System.out.println(str2.length());
		Integer x=100;
		Integer y=x/0;
		System.out.println(y);
		Integer num2=100;
	
		
		}
		catch(ArithmeticException e) {
			System.out.println("ARithmetic Exception");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormat Exception");
		}
		catch(Exception ex) {
			System.out.println("ArrayIndexOutofBound");
		}
		
		
		finally {
			System.out.println("Hii Exception!");
		}
			
		
		int eid=100;
		System.out.println(eid);
		

	}

}
