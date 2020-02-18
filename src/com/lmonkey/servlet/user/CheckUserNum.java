package com.lmonkey.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckUserNum
 */
@WebServlet("/checkusernum")
public class CheckUserNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		HttpSession session = request.getSession();
		String sysCode = (String)session.getAttribute("code");
		System.out.println(sysCode+"----------------"+num);
		
		PrintWriter out = response.getWriter();
		if(sysCode.equals(num)) {
			out.print("true");
		}else {
			out.print("false");
		}
		out.close();
	}

}
