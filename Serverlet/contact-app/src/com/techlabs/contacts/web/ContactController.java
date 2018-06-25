package com.techlabs.contacts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.dynalink.beans.StaticClass;

import com.techlabs.contacts.model.Contact;
import com.techlabs.contacts.model.ContactService;

/**
 * Servlet implementation class ContactServerlet
 */
@WebServlet("/contactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactService service = new ContactService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		List<Contact> contactList = service.getContacts();
		request.setAttribute("contacts", contactList);
		RequestDispatcher view = request
				.getRequestDispatcher("displayContacts.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		if (request.getParameter("name") != null
				&& request.getParameter("email") != null
				&& request.getParameter("number") != null) {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String number = request.getParameter("number");
			service.addContact(name, email, number);
			response.sendRedirect("Display.html");
		}
	}

}
