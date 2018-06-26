package com.techlabs.contacts.controller;

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
@WebServlet("/contacts")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayController() {
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
		ContactService service = ContactService.getInstance();
		response.setContentType("text/html");

		List<Contact> contactList = service.getContacts();
		request.setAttribute("contacts", contactList);
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/displayContacts.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
