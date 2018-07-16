package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.AccountService;
import com.techlabs.model.TransactionService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/transaction.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type=request.getParameter("type");
		String amount=request.getParameter("amount");
		
		TransactionService service = TransactionService.getInstance();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String user=(String) session.getAttribute("userName");

		Boolean flag;
		try {
			flag = service.transaction(user,type,amount);
			System.out.println("Transaction Successful");
			response.sendRedirect("account");
		}  catch (Exception e) {
			//response.sendRedirect("transaction");
			String message=e.getMessage();
			System.out.println(message);
			request.setAttribute("message",message);
			RequestDispatcher view = request
					.getRequestDispatcher("/WEB-INF/transaction.jsp");
			view.forward(request, response);
		}
		
		
	}

}
