import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String lang = request.getParameter("lang");
        Cookie c = new Cookie("lang1", lang);
            response.addCookie(c);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body style='background-color:beige;color:black;padding:50px;'>");
             out.println("<center>");
            out.println("<h1> welcome to " + lang + " Language</h1>");
            out.println(
                "<h1><a href =\"lang2\" style='color:black;text-decoration:none;'>greetings!!!</a></h1>");
            // Creating a cookie
             out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
    }