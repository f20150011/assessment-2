package com.sapient.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dto.Data;
import com.sapient.service.IService;
import com.sapient.service.ServiceImpl;

/**
 * 
 * Servlet implementation class Servlet
 * 
 * @author shrshrir
 * 
 */
@WebServlet("/test")
public class Servlet extends HttpServlet {

	IService service = new ServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// getting request params
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		Float salary = Float.valueOf(request.getParameter("salary"));

		// creating a dto
		Data data = new Data();
		data.setName(name);
		data.setAge(age);
		data.setSalary(salary);
		
		// passing on to service layer
		service.process(data);

	}

}
