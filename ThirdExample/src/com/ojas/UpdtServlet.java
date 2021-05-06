package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emps.dao.PersonDAO;
import com.emps.model.Person;

public class UpdtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    PersonDAO personDao;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		personDao = new PersonDAO();
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int num = Integer.parseInt(request.getParameter("no"));
		String ename = request.getParameter("ename");
		String contactno = request.getParameter("contactno");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		
		pw.println("<html><head><style type=text/css>");
		pw.println("table {width: 50%;border-collapse: collapse;background-color: wheat;border-spacing: 10px;}");
		pw.println("table, tr, td {border: 1px solid blue;}th, td {padding: 20px;}");
		pw.println("</style></head><body>");
		pw.println("<form action=UpdtServlet method=POST>");
		pw.println("<h1 style=background-color: maroon; color =white; padding =20px; text-align: center;>");
		pw.println("Welcome to Registration Page</h1>");
		pw.println("<table align=center><tr>");
		pw.println("<input type=hidden name=pid value=" + num + ">");
		pw.println("<td>Enter Name:</td>");
		pw.println("<td><input type=text name=ename value=" + ename +"></td></tr>");
		pw.println("<tr><td>Enter Contact Number:</td>");
		pw.println("<td><input type=text name=contactno value= " + contactno + "></td></tr>");
		pw.println("<tr><td>Email Id:</td>");
		pw.println("<td><input type=text name=email value=" + email + "></td></tr>");
		pw.println("<tr><td>Gender:</td><td>");
		 if(gender.equals("Male")) {
	            pw.println("<input type=radio name=gender value=male>Male");
	            pw.println("<input type=radio name=gender value=female>Female");
	        }
	        else {     
	        pw.println("<input type=radio name=gender value=female>Female</td>");
	        pw.println("<input type=radio name=gender value=male>Male</td>");
	        }
		 pw.println("</tr><tr><td>Enter Address:</td><td><textarea name=address rows=5 cols=20>");
	        pw.println("</textarea></td></tr><tr><td colspan=2 align=center><input type=submit value=click></td></tr>");
	        pw.println("</table></form></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int num = Integer.parseInt(request.getParameter("pid"));
		String ename = request.getParameter("ename");
		String contactno = request.getParameter("contactno");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		Person person = new Person();
		person.setPid(num);
		person.setEname(ename);
		person.setContactno(contactno);
		person.setEmail(email);
		person.setGender(gender);
		person.setAddress(address);
		if(personDao.updatePerson(person)) {
			pw.println("<h3 style=color:blue> Your data is updated successfully</h3>");
		}
		else  {
			pw.println("<h3 style=color:red> Please try again</h3>");
		}
	}

}
