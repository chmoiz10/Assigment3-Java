
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String UserName = request.getParameter("username");
        String Password = request.getParameter("password");

        if (UserName.equals("moiz") && Password.equals("moiz")) {
            out.println("<h1>Login Successfull. Username =  " + UserName + "</h1>");
        } else {
            out.println("<h1>Incorrect username and password</h1>");
        }

    }
}
