package com.achala.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.achala.dao.EmployeeDAO;
import com.achala.model.Employee;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Employee emp = new Employee(
            req.getParameter("empId"),
            req.getParameter("fullName"),
            req.getParameter("gender"),
            req.getParameter("maritalStatus"),
            req.getParameter("roleType"),
            req.getParameter("primarySkills"),
            req.getParameter("secondarySkills"),
            req.getParameter("certifications"),
            Integer.parseInt(req.getParameter("totalExp")),
            Integer.parseInt(req.getParameter("achalaExp")),
            Integer.parseInt(req.getParameter("skillRating")),
            req.getParameter("skillGaps"),
            req.getParameter("resourcing"),
            req.getParameter("onCall"),
            req.getParameter("comments")
        );

        EmployeeDAO.save(emp);

        req.setAttribute("emp", emp);
        req.getRequestDispatcher("response.jsp").forward(req, res);
    }
}
