package com.training;

import java.lang.reflect.Field;

import com.training.entity.StudentAnnotation;
import com.training.stereotypes.Table;

public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentAnnotation stud=new StudentAnnotation();
				
	    Class<?> cls=stud.getClass();
	    Table tableRef=cls.getAnnotation(Table.class);
	    String tableName=tableRef.tableName();
	    String sql="select * from " + tableName;
	    System.out.println(sql);
	    
	    try {
	    	Field idField=cls.getDeclaredField("id");
	    	Column idCol=idField.getAnnotation(Column.class);
	    	String colName=idCol.name();
	    	String sql2="Selct * from " + tableName + "where" + colName + " ?";
	    	System.out.println(sql2);
	    	
	    }catch(NoSuchFieldException e) {
	    	e.printStackTrace();
	    }catch(SecurityException e) {
	    	e.printStackTrace();
	    }

	}

}
