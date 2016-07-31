package com.example.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.backend.PrintThings;

@Path("home")
public class ResourceClass
{
	@GET
	@Path("boo")
	@Produces(MediaType.TEXT_PLAIN)
	public String boo()
	{
		return PrintThings.returnMeThis( "Hello boo" );
	}

	@GET
	@Path("meow")
	@Produces(MediaType.TEXT_PLAIN)
	public String meow( @QueryParam("animal") final String animal )
	{
		return PrintThings.printQueriedAnimal( animal );
	}

	@POST
	@Path("post")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public String postMethod( @FormParam("name") final String name )
	{
		return "<h2>Hello, " + name + "</h2>";
	}
}
