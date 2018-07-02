package com.techlabs.contacts.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contacts.model.Contact;
import com.techlabs.contacts.model.ContactService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/editContacts")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		ContactService service = ContactService.getInstance();
		Contact contact = service.getByID(id);
		//System.out.println(contact.getID());
		
		request.setAttribute("contactInfo", contact);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Edit.jsp");
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
		//System.out.println("inside");

		if (request.getParameter("name") != null
				&& request.getParameter("email") != null
				&& request.getParameter("number") != null) {

			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String number = request.getParameter("number");
			
			System.out.println(id+" "+name+" "+email+" "+number);
			
			ContactService service = ContactService.getInstance();
			service.EditContact(id, name, email, number);
			response.sendRedirect("contacts");
		}
	}

}
