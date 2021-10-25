package org.iesalixar.servidor.cggomez.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ReservarServlet
 */
@WebServlet("/ReservarServlet")
public class ReservarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(ReservarServlet.class);
	
	public ReservarServlet() {
		super();
        
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("usuario") != null) {
			
			request.getRequestDispatcher("Iniciado.jsp").forward(request, response);

			return;
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
