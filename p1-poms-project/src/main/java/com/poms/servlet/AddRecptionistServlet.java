package com.poms.servlet;
	
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;
import com.poms.config.DatabaseConnection;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import com.poms.dao.impl.CustomerDaoImpl;
import com.poms.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRecptionistServlet
 */
@WebServlet("/AddCustomer")
public class AddRecptionistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Connection conn = DatabaseConnection.getConnection();
	public PreparedStatement preparedStatement = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRecptionistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone= request.getParameter("phone");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		String proof = request.getParameter("proof");
		String login = request.getParameter("login");
		Customer customer = new Customer(name, email, phone, address, dob, age, password, proof,login);
		System.out.println(customer);
		
		try {
			
			PreparedStatement preparedStatement = null;
			String query = "insert into customerionist(Customer_name,email, Phone ,address, date_of_birth, age,password,identity_proof,preferred_login_id) values(?,?,?,?,?,?,?,?,?)";
			preparedStatement = conn.prepareStatement(query);
//			preparedStatement.setString(1, customer.getcustomerionistName());
			preparedStatement.setString(2, customer.getEmail());
			preparedStatement.setString(3, customer.getPhone());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setNString(5, customer.getDateOfBirth());
			preparedStatement.setString(6, customer.getAge());
			preparedStatement.setString(7, customer.getPassword());
			preparedStatement.setString(8, customer.getIdProof());
			preparedStatement.setString(9, customer.getPreferredLoginId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
