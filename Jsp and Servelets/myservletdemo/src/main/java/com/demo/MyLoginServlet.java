package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void Service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		//concept for  RequestDispatcher
		RequestDispatcher rd=null;

		PrintWriter out = response.getWriter(); // io package

	      //this used to send values from web.xml
		ServletConfig  config = getServletConfig();
		
		//concept of  servlet context
		ServletContext context =getServletContext();
		
		String username=config.getInitParameter("username");
		String password = config.getInitParameter("pwd");
		
		
		String username2=context.getInitParameter("username");
		String password2 = context.getInitParameter("pwd");

		if (username.equals("ram") && password.equals("ram")) {
			                   //  /forwardsevlet
		    out.println(" hi");
			 

		}else {
			
			out.print("  not login");
			 rd = request.getRequestDispatcher("/Login.html");
			  rd.include(request, response);
		}

	}

}
