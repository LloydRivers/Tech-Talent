

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter write = response.getWriter();
			response.setContentType("text/html");
			
			String name = request.getParameter("login");
			String pass = request.getParameter("password");
			
			/*Assume user already register in database with
			 * fname = admin
			 * password = admin@123
			 * */
			
			if(name.equals("admin") && pass.equals("admin@123"))
			{
				//login success -> welcome page
				
//				write.println("<html><certer><h1 style=\"text-align:center ; color:blue\"><b>Hi  <br>"+name+"</b></h1></center></html>");
				//response.sendRedirect("welcome.jsp");
				
				RequestDispatcher dispatch = request.getRequestDispatcher("admin.html");
				dispatch.include(request, response);
			}
			else
			{
				//login fails -> remain on demo.html
				write.println("Oops.. something went wrong...Please check your username or password");
				//response.sendRedirect("demo.html");
				
				RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
				dispatch.include(request, response);
			}
				
			
			
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong.....");
		}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
