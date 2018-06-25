package com.techlabs.beer.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.beer.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/hello")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String c=request.getParameter("color");
		
		BeerExpert be=new BeerExpert();
		List<String> result=be.getBrands(c);
		//System.out.println("inside");
		//response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		//out.println("Beer Selection advise <br>");
		
		//Iterator it = result.iterator();
		//while (it.hasNext()){
			//out.println("<br> try :"+it.next());
		//}
		request.setAttribute("styles", result);
		RequestDispatcher view=request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
