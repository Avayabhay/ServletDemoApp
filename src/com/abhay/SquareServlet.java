package com.abhay;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		out.println("THis is Inside Square Servlet!");
//		out.println(req.getParameter("num1"));
//		out.println(req.getParameter("num2"));
//		int k = (int)req.getAttribute("k");
//		out.println("restult is : "+ k*k);
		
		System.out.println("IT is Working");
//		int k = (Integer.parseInt(req.getParameter("k")));
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		
		int k =0;
		Cookie cookies [] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		out.println("THE ANS IS "+ k*k);
		
//		//------------------ServletContext-------------
//		ServletContext ctx = getServletContext();		
//		out.println(ctx.getInitParameter("name"));
//		
//		//------------------ServletConfig-----------
//		ServletConfig cfg = getServletConfig();
//		out.println("This is the Servlet Config VAlues"+cfg.getInitParameter("name"));
		
		
	}

}
