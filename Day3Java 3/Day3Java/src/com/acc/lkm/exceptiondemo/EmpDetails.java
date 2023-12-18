package com.acc.lkm.exceptiondemo;

import java.io.IOException;
import java.sql.SQLException;

public class EmpDetails {
public static void validation(int proj_id)throws SQLException{
	if(proj_id==100) {
		//throw new IOException("Project is Pharma");
	}
	else {
		throw new SQLException("Invalid Project");
	}
}
static void get(int eid) throws IOException{
	System.out.println(eid);
}
	

}
