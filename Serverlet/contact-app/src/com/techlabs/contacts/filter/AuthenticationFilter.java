package com.techlabs.contacts.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter({"/addContacts","/editContacts"})
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session=req.getSession(false);
		boolean loggedIn = session.getAttribute("userName") != null;
		System.out.println(loggedIn);
    	if(loggedIn){
    	chain.doFilter(request, response);
    		
    	}else {
            res.sendRedirect("login");
        }
	}
		
		
		//System.out.println("User="+session.getAttribute("user"));
    	//if(session==null)
			//((HttpServletResponse) response).sendRedirect("login");
		//else
			//chain.doFilter(request, response);
		
    	//if(session != null){
    		//session.invalidate();
    	//}
    	//response.sendRedirect("login.html");
		// pass the request along the filter chain
		
		
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
