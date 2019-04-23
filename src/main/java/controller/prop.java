package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class prop extends javax.servlet.http.HttpServlet {

	 private String message;

	  public void init() throws ServletException
	  {

	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
	      String pathInfo = request.getPathInfo();
	      System.out.println(pathInfo);
	      request.getRequestDispatcher("/WEB-INF/page/" + pathInfo).forward(request, response);

	  }

	  public void destroy()
	  {
	      // do nothing.
	  }
	}
