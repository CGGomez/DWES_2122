package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.Empleado;

public interface DAOEmpleado {
	public List<Empleado> getAllEmpleados();

	boolean insertEmpleado(Empleado empleado);
}
