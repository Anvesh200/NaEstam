package com.acc.lkm.exceptiondemo;

import java.io.IOException;

public class TestOverriding extends EmpDetails {

	public static void main(String[] args) {
		try {
			validation(100);
		}catch(Exception e) {
			System.out.println("exception Thrown");
		}

	}
	void get(int  proj_id) {
		System.out.println(proj_id);
	}

}
