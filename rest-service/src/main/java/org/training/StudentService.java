package org.training;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import com.example.demo.Student;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;

@Path(value="students")
public class StudentService {
	@GET
	public String findAllStudents() {
		return "ram ,shyam,magnesh";
	}
	
	@GET
	@Path("/{classNumber}")
	@Produces(value=MediaType.APPLICATION_JSON)
	public Response findStudentById(@PathParam("classNumber")  int classNumber) {
		Student obj=new Student(101,"Ramesh",90);
		if(classNumber==2) {
			obj=new Student(102,"rajesh",70);
		}
		return Response.ok().entity(obj).build();
				
	}
	@POST
	@Produces(value=MediaType.APPLICATION_JSON)
	@Consumes(value=MediaType.APPLICATION_JSON)

	public Response addStudent(Student obj) {
		System.out.println(obj + "added");
		return Response.status(201).entity(obj).build();
	}

}
