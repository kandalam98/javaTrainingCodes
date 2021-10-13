package com.training.server;
import java.util.*;
import java.util.List;

public class MemberService {
	
	HashMap<String,List<String>> details;
	public MemberService(){
		details=new HashMap<>();
		details.put("Mahesh",Arrays.asList("A","B","C"));
		details.put("Suresh",Arrays.asList("1","2","3"));
		
	}
	public List<String> findByname(String name){
		return details.get(name);
	}
	

}
