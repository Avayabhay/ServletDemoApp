package com.abhay;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet 
{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		PrintWriter out = res.getWriter();
////		res.getWriter().println(k);
//		out.println("The Result is "+k);
//		
//		
//	}
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		PrintWriter out = res.getWriter();
////		res.getWriter().println(k);
//		out.println("The Result is "+k);
//		
//		
//	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		//-------------------------RequestDispatcher----------------
//		req.setAttribute("k", k);
//		PrintWriter out = res.getWriter();
////		res.getWriter().println(k);
////		out.println("The Result is "+k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,res);
		
		//-------------URL Rewriting
		//----------------------Redirect-------------
		
//		res.sendRedirect("sq?k="+k);	
		
		 //------------Session 	
//		HttpSession session = req.getSession();  
//		session.setAttribute("k",k);
		
		//---------------cookies
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
	}
}
