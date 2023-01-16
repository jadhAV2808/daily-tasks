package com.session.management;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberAreaController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action=request.getParameter("action");
		
		switch(action) {
		case "destroy":
			request.getSession().invalidate();
			
			/*when logout using cookie
			 
			//invalidate the cookiee
			Cookie[] cookies=request.getCookies();
			for(Cookie c:cookies) {
				if(c.getName().equals("username")) {
					c.setValue(null);
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
			*/
			request.getSession().invalidate();
			response.sendRedirect("login.jsp");
			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
