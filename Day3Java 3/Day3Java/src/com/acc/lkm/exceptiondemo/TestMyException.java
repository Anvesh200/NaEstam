package com.acc.lkm.exceptiondemo;

import java.io.IOException;

public class TestMyException extends EmpSkill {

	public TestMyException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	void display(String exception) throws IOException{
		System.out.println(exception);
	}

	public static void main(String[] args) throws EmpSkill {
		try {
			skill("P5");
		}catch(EmpSkill e) {
			System.out.println("Handled");
		}

	}

}
