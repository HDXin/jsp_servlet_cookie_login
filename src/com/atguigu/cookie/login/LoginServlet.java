package com.atguigu.cookie.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		System.out.println("name:" + name + ",pass:" + pass);
		
		String path = null;
		if("tom".equalsIgnoreCase(name) && "123456".equals(pass)){
			Cookie cookie = new Cookie("name",name);
			response.addCookie(cookie);
			cookie = new Cookie("pass",pass);
			response.addCookie(cookie);
		
			path = "wellcom.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/"+path);
			requestDispatcher.forward(request, response);
		}else{
			path = "login.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/"+path);
			requestDispatcher.forward(request, response);
		}

		
	}

}
