package com.example.Biotch;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.server.ResourceConfig;

@Path("hello")
public class HelloWorldResource /*extends ResourceConfig*/{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayhello() {
        return "hello";
    }

}