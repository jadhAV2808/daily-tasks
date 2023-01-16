package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println(request.getParameter("name"));
		//response.getWriter().print("<br/>");
		response.getWriter().println(request.getParameter("gender"));
		//response.getWriter().println(request.getParameter("language"));
		
		PrintWriter out=response.getWriter();
		String[] languages=request.getParameterValues("language");
        if(languages!=null){
      	  for(int i=0;i<languages.length;i++){
      		  
      		  out.println(languages[i]);
      		  //out.print("<br />");
      		  
      	  }
        }
        else{
      	  out.println("None selected");
        }
		
		response.getWriter().println(request.getParameter("country"));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		response.getWriter().println(request.getParameter("name"));
		//response.getWriter().print("<br/>");
		response.getWriter().println(request.getParameter("gender"));
		response.getWriter().println(request.getParameter("language"));
		response.getWriter().println(request.getParameter("country"));
		*/
	}

}
