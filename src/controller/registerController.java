package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Constant;
import model.register;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String phone;
	private String email;
	private String password;
	private String lastname;
	private String firstname;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	
		
		//lấy tham số từ request
		
		email=request.getParameter(Constant.EMAIL);
		phone=request.getParameter(Constant.PHONE);
		password=request.getParameter(Constant.REGISTER_PASWORD);
		lastname=request.getParameter(Constant.LAST_NAME);
		firstname=request.getParameter(Constant.FIRST_NAME);
		
		
		//tạo ra 1 người dùng mới
		
		register userRegister= new register();
		userRegister.setAddress_email(email);
		userRegister.setLastname(lastname);
		userRegister.setFirstname(firstname);
		userRegister.setPassword(password);
		userRegister.setPhone(phone);
		
		//Validate với database và kiểu dữ liệu
		//..............
		//////////////////////////////////////////
		// sau khi validate xong import vào trong database
		
		// Sau khi đang kí xong  và validate xong chuyển hướng sáng Login để đăng nhập
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher(Constant.COMPONENT_LOGIN);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
