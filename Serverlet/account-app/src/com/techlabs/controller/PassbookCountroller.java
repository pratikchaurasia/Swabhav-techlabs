package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Transaction;
import com.techlabs.model.TransactionService;

/**
 * Servlet implementation class AccountCountroller
 */
@WebServlet("/account")
public class PassbookCountroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassbookCountroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TransactionService service = TransactionService.getInstance();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String user=(String) session.getAttribute("userName");

		List<Transaction> transactionList = service.getTransactions(user);
		request.setAttribute("transactions", transactionList);
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/passbook.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
