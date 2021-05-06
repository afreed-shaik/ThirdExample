package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String cnames = null;
    public ConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		cnames = config.getInitParameter("cnames");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor = wheat text=blue>");
		pw.println("<form action=ConfigDemo method=POST>");
		pw.println("<h1 style=color:Green> Online Courses</h1><hr/>");
		pw.println("<p>Select course name : </p>");
		pw.println("<p><select name =cname>");
		String cn[] = cnames.split(",");
		for(String x : cn) {
			pw.println("<option>" + x + "</option>");
		}
		pw.println("</select></p>");
		pw.println("<p><input type=submit value=Register></p></form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String cs[] = {"JAVA",".NET","TETSTING","ORACLE"};
		double prices[] = {25000.00,20000.00,15000.00,18000.00};
		String cname = request.getParameter("cname");
		int ind = 0;
		for(int i =  0;i < cs.length;i++) {
			if(cname.equalsIgnoreCase(cs[i])) {
				ind = i;
			}
		}
		pw.println("<h1 style=color:green> Your Select Course Name: " + cname +" <br>");
		pw.println("You have to pay " + prices[ind] + "Rs. only</h1>");
		pw.println("<h4 style=color:indigo>Thank You</h4>");
	}

}
