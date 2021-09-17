package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Constant;
import model.users;
/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//variable
	private String name;
	private String password;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		name=request.getParameter(Constant.TXT_USERNAME);
		password=request.getParameter(Constant.TXT_PASWORD);
		users Login=new users();
		
		Login.setName(name);
		Login.setPassword(password);
		request.setAttribute(Constant.LOGIN, Login);
		boolean status=Login.validate();
		RequestDispatcher dispatcher;
		if(status) {
			dispatcher=request.getRequestDispatcher(Constant.LOGIN_SUCCESS);
		}
		else {
			dispatcher=request.getRequestDispatcher(Constant.LOGIN_ERROR);
		}
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
