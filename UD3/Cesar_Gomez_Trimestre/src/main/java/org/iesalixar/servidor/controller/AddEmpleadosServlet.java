package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOEmpleadoImpl;
import org.iesalixar.servidor.model.Empleado;

public class AddEmpleadosServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpleadosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Obtengo los datos de todos los clientes para pasarlo a la vista y
		// mostrarlos en el select como opciones
		DAOEmpleadoImpl daoImpl = new DAOEmpleadoImpl();
		ArrayList<Empleado> emple = (ArrayList<Empleado>) daoImpl.getAllEmpleados();
		
		//Lo añado a la petición que se le pasa a la vista
		request.setAttribute("customers", emple);
		
		request.getRequestDispatcher("/WEB-INF/view/admin/addpayment.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Obtengo los parámetros
		String customerNumber = request.getParameter("customerNumber");
		String checkNumber = request.getParameter("checkNumber");
		String date = request.getParameter("paymentDate");
		String amount = request.getParameter("amount");
		
		if (customerNumber!=null && checkNumber!=null && date!=null && amount!=null) {
			
			Empleado empleado = new Empleado();
			
			DAOEmpleadoImpl dao = new DAOEmpleadoImpl();
			
			dao.insertEmpleado(empleado);
			
		}
		
		response.sendRedirect(request.getContextPath()+"/Admin/");
	}
}
