package com.servlet.initialization;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/Demo2" }, 
		initParams = { 
				@WebInitParam(name = "message2", value = "initialization from annotation", description = "initialization from annotation")
		})
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public Demo2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config=getServletConfig();
		String message=config.getInitParameter("message2");
		
		response.getWriter().println(message);
		//response.getWriter().println("<br>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doGet(request, response);
	}

}
