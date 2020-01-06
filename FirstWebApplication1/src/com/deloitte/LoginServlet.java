package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.bean.User;
import com.deloitte.service.LoginService;
import com.deloitte.service.LoginServiceImpl;

@WebServlet(urlPatterns = { "/login", "/create", "/logout","/usercheck" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService lService;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		lService = new LoginServiceImpl();
	}

	public void destroy() {
		System.out.println("destroy called");
		lService.closeConnection(); // called when servlet is removed from memory
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet called");
		String path = request.getServletPath();
		System.out.println("path: " + path);
		HttpSession session = request.getSession();
		switch (path) {
		case "/login":
			String login = request.getParameter("login");
			String password = request.getParameter("pswd"); // null if not present
			// System.out.println(login +", "+ password);
			User user = new User(login, password, null);
			String type = lService.getUserType(user);
			System.out.println(user.getLogin() + " is of " + type + " type");
			String displayPage = "customer.jsp";
			if (type == null) {
				request.setAttribute("loginerror", "Authentication Failed");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else if (type.equals("admin")) {
				request.setAttribute("usertype", "Login in as Administrator");
				displayPage = "admin.jsp";
			} else if (type.equals("employee")) {
				request.setAttribute("usertype", "Login in as Employee");
				displayPage = "employee.jsp";
			} else {
				// default constructor
				request.setAttribute("usertype", "Login in as Customer");
			}
			if (type != null) {

				session.setAttribute("user", type);
			}
			request.getRequestDispatcher(displayPage).forward(request, response);
			break;
		case "/create":
			login = request.getParameter("login");
			password = request.getParameter("pswd"); // null if not present
			type = request.getParameter("type");
			// System.out.println(login +", "+ password);
			user = new User(login, password, type);
			boolean success = lService.createUser(user);
			// System.out.println(success);
			if (success) {
				request.setAttribute("usercreated", "User Created Successfully");
				displayPage = "success.jsp";
			} 
			else {
				request.setAttribute("createerror", "User Creation Failed");
				displayPage = "failure.jsp";
			}
			request.getRequestDispatcher(displayPage).forward(request, response);
			break;
		case "/logout":
			session.invalidate(); // removes all attributes in session
			break;
		case "/usercheck" :
			login = request.getParameter("login");
			System.out.println("user check login " +login);
			
			response.getWriter().write(login + " already exists");
		default:
			break;
		}

//		response.setContentType("text.html");
//		PrintWriter out = response.getWriter();
//		out.println("<html><head>From servlet</title></head>");
//		out.println("<body>");
//		out.println("<h1>Welcome to Deloitte</h1>");
//		out.println("<p>You are logged in as "+ type +"</p>");
//		out.println("</body>");
//		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post called");
		doGet(request, response);
	}

}
