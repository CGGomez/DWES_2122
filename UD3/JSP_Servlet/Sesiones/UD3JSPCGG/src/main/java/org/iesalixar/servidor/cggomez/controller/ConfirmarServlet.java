package org.iesalixar.servidor.cggomez.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ConfirmarServlet
 */
@WebServlet("/ConfirmarServlet")
public class ConfirmarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(ConfirmarServlet.class);
       
    public ConfirmarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		String fechin = request.getParameter("fechin");
		String fechfin = request.getParameter("fechfin");
		String personas = request.getParameter("numpersonas");
		String servicios[] = request.getParameterValues("servicios");
			
		request.setAttribute("fechin",fechin);
		request.setAttribute("fechfin", fechfin);
		request.setAttribute("numpersonas", personas);
		request.setAttribute("servicios", Arrays.toString(servicios));

		request.getRequestDispatcher("Confirmar.jsp").forward(request, response);
	}
}
