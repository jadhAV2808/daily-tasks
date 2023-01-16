package com.servlet.initialization;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	String message;
	
    public Home() {
        super();
        
    }


	public void init(ServletConfig config) throws ServletException {
		
		message="init() method to initialize the global variable.";
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println(message);
		//response.getWriter().println("<br>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
