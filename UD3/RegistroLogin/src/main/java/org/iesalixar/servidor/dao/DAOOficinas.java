package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.model.Offices;

public interface DAOOficinas {
	public Offices getProduct(String city);
	public ArrayList<Offices> getOfficesSearch(String searchTerm);
}
