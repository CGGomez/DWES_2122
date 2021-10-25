package org.iesalixar.servidor.cggomez.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(Login.class);
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Formulario.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

if (request.getParameter("Registrarse")!=null && request.getParameter("Registrarse").equals("Registrarse")) {
			HttpSession sesion = request.getSession();
			
			logger.info("Usuario entrando en sesión");
			
			sesion.setAttribute("LOGEADO CON ÉXITO", true);
			
			//Redirijo el flujo de la aplicación al formulario de matriculación
			response.sendRedirect(request.getContextPath()+"/Iniciado");
			
			return;
		}
		
		//No vengo de presionar al botón entrar y he recibido un POST. Vuelvo al GET de este mismo Servlet
		response.sendRedirect(request.getContextPath());
			
	}
}
