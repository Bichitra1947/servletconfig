package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(
		urlPatterns = {"/test"},
		initParams = {
					@WebInitParam(name = "name", value = "bichitra"),
					@WebInitParam(name = "rollno", value = "cs/05")
		  				}

		)
public class Test extends HttpServlet
{
	ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String newName=config.getInitParameter("name");
		String newRollno=config.getInitParameter("rollno");
		out.println("name : "+newName);
		out.println("rollno : "+newRollno);
		
		out.println("<h1></h1>");
	}

}
