package com.session.management;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public SiteController() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getParameter("action");
		switch(action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request,response);
			break;
		default:
			break;
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("pooja") && password.equals("pass")) {
			
			//invalidating session if any
			request.getSession().invalidate();
			
			
			//creating new session
			HttpSession newSession=request.getSession(true);
			
			//max inactive duration
			newSession.setMaxInactiveInterval(3000);
			
			/*logout using cokies
			//creating new cookie
			Cookie c=new Cookie("username",username);
			
			//adding cookie
			response.addCookie(c);
			*/
			
			
			/*logout using session attribute*/
			newSession.setAttribute("username", username);
			
			
			response.sendRedirect("memberArea.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
			
	}

}
