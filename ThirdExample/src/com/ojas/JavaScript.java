package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaScript
 */
public class JavaScript extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaScript() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("s1");
		if(name.equals("Andhra Pradesh")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Amaravathi</h2>");
		}
		else if(name.equals("Telangana")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Hyderabad</h2>");
		}
		else if(name.equals("Maharashtra")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Mumbai</h2>");
		}
		else if(name.equals("Tamilnadu")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Chennai</h2>");
		}else if(name.equals("Karnataka")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Bangalore</h2>");
		}else if(name.equals("Kerala")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Thiruvananthapuram</h2>");
		}else if(name.equals("Maharashtra")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Mumbai</h2>");
		}
		else if(name.equals("Madhya Pradesh")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Bhopal</h2>");
		}
		else if(name.equals("Goa")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Panaji</h2>");
		}
		else if(name.equals("Odisha")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Bhuvaneshwar</h2>");
		}
		else if(name.equals("West Bengal")) {
			pw.println("<h2 style=color:green>Your selected state is:"+name+"</h2><br>");
			pw.println("<h2 style=color:pink>Capital=Kolkata</h2>");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
