package com.techlabs.contacts.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contacts.model.ContactService;

/**
 * Servlet implementation class AddContactController
 */
@WebServlet("/addContacts")
public class AddContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactService service = ContactService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/Add.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ContactService service = ContactService.getInstance();
		
		if (request.getParameter("name") != null
				&& request.getParameter("email") != null
				&& request.getParameter("number") != null) {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String number = request.getParameter("number");
			service.addContact(name, email, number);
			response.sendRedirect("contacts");
		}
	}

}
