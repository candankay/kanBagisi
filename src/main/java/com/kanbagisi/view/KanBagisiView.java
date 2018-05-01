package com.kanbagisi.view;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Path("/")
@Controller
@EnableWebMvc
public class KanBagisiView {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		System.out.println("dsasd123123");
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();
 
	}
}
