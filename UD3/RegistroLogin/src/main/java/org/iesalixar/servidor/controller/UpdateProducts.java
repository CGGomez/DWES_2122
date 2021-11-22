package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOCustomerImpl;
import org.iesalixar.servidor.dao.DAOPaymentImpl;
import org.iesalixar.servidor.dao.DAOProductImpl;
import org.iesalixar.servidor.model.Customer;
import org.iesalixar.servidor.model.Payment;
import org.iesalixar.servidor.model.Product;

public class UpdateProducts extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productCode = request.getParameter("pc");
		
		if (productCode!=null) {
			
			DAOProductImpl daoProductImpl = new DAOProductImpl();
			
			Product prodyct = daoProductImpl.getProduct(productCode); 
			
			ArrayList<Product> products = daoProductImpl.getAllProducts();
			
			request.setAttribute("product", products);
			
			
			request.getRequestDispatcher("/WEB-INF/view/admin/EditarProduct.jsp").forward(request, response);
		} else {
			response.sendRedirect("/Admin/");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
}
