package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.techlabs.model.AccountService;


/**
 * Servlet implementation class AccountController
 */
@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/register.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside registration");
		String name=request.getParameter("user");
		String password=request.getParameter("pwd");
		String rePassword=request.getParameter("repwd");
		String amount=request.getParameter("amount");
		String gRecaptchaResponse = request
				.getParameter("g-recaptcha-response");
		boolean verify = com.techlabs.model.VerifyRecaptcha.verify(gRecaptchaResponse);
		request.setAttribute("verify", verify);
		AccountService service=new AccountService();
		
		
		Boolean flag;
		if(verify&&Double.parseDouble(amount)>1500){
		try {
			flag = service.addNewAccount(name, password, rePassword, amount);
			if(flag && verify ){
				System.out.println("Registration Successful");
				response.sendRedirect("index.jsp");
				}
			else{
				RequestDispatcher view = request
						.getRequestDispatcher("/WEB-INF/register.jsp");
				view.forward(request, response);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		RequestDispatcher view = request
				.getRequestDispatcher("/WEB-INF/register.jsp");
		view.forward(request, response);
		
	}
	}

}
