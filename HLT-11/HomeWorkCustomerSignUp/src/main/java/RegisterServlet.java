

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegisterServlet
 */

@WebServlet("/")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
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
			
			System.out.println("I am on Register Servlet");
			
			String cname = request.getParameter("uname");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			String cid = request.getParameter("cid");//String
			
			//String-> int
			int c = Integer.parseInt(cid);// parsing
			
			
			//JDBC Code.
			DBConnect obj = new DBConnect();
			int row_update = obj.insert(cname, email, pass, c);//get row_update
			
			if(row_update == 1)
			{
				//login page
				response.sendRedirect("login.jsp");
			}
			else
			{
				//stay on register page
				write.print("Please check customer details");
				RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
				dispatcher.include(request, response);
				
			}
			
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Servlet Error :"+ex);
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
