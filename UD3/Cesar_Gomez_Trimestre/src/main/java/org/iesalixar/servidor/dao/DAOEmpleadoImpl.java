package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.bd.PoolDBContext;
import org.iesalixar.servidor.dao.DAOEmpleado;
import org.iesalixar.servidor.model.Empleado;
import org.iesalixar.servidor.model.Office;

public class DAOEmpleadoImpl implements DAOEmpleado{
	
	@Override
	public List<Empleado>getAllEmpleados(){
		
		ArrayList<Empleado> empllist = new ArrayList<>();
		Empleado empleado = null;
		Connection con = null;
		try {
			String sql = "select * from employees";
			PoolDB pool = new PoolDB();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				empleado = new Empleado();
				empleado.setEmployeeNumber("employeeNumber");
				empleado.setLastName("lastName");
				empleado.setFirstName("firstName");
				empleado.setExtension("extension");
				empleado.setEmail("email");
				empleado.setOfficeCode("officeCode");
				empleado.setReportsTo("reportsTo");
				empleado.setJobTitle("jobTitle");

				empllist.add(empleado);
			}
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return empllist;
	}
	
	@Override
	public boolean insertEmpleado(Empleado empleado) {
		int resultado = 0;
		Connection con = null;

		try {

			String sql = "insert into empleado values(?,?,?,?,?,?,?,?)";
			PoolDB pool = new PoolDB();
			con = pool.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, empleado.getEmployeeNumber());
			statement.setString(2, empleado.getLastName());
			statement.setString(3, empleado.getFirstName());
			statement.setString(4, empleado.getExtension());
			statement.setString(5, empleado.getEmail());
			statement.setString(6, empleado.getOfficeCode());
			statement.setString(7, empleado.getReportsTo());
			statement.setString(8, empleado.getJobTitle());

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);

	}

}
