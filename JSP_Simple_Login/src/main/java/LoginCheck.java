

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public LoginCheck() {
        super();
       
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("uname");
	String password=request.getParameter("password");
	if(uname.equals("java") && password.equals("1234"))
	{
		response.sendRedirect("member.jsp");
	}
	
	else
	{
		response.sendRedirect("error.jsp");
	}
	}

}
