package com.example.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class MainApp
{
	public static void main( final String[] args ) throws Exception
	{
		final ResourceConfig config = new ResourceConfig();
		config.packages( "com.example.resource" );
		final ServletHolder servlet = new ServletHolder( new ServletContainer( config ) );

		final Server server = new Server( 2222 );
		final ServletContextHandler context = new ServletContextHandler( server, "/*" );
		context.addServlet( servlet, "/*" );

		try
		{
			server.start();
			server.join();
		}
		finally
		{
			server.destroy();
		}
	}
}