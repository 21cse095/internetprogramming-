
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/lang2"})
public class lang2 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String language = request.getParameter("lang");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletwel2</title>");            
            out.println("</head>");
            out.println("<body style='background-color:beige;color:black;padding:50px;'>");
         
             out.println("<center>");
           String language1 = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals("lang1")) {
          language1 = cookie.getValue();
          break;
        }
      }
    }
    String contentType = "";
    String greeting = "";
    switch (language1) {
      case "tamil":
          out.println("<h1>வணக்கம்</h1>");
        greeting = "தமிழ் மொழி உலகிற்கு வரவேற்கிறோம்";
        break;
      case "english":
        out.println("<h1>HELLO </h1>");
        greeting = "WELCOME TO THE WORLD OF ENGLISH LANUAGE";
        break;
      case "telugu":
          out.println("<h1>హలో</h1>");
        greeting = "తెలుగు భాషా ప్రపంచానికి స్వాగతం";
        break;
      case "malayalam":
       out.println("<h1>ഹലോ</h1>");
        greeting = "മലയാള ഭാഷയുടെ ലോകത്തേക്ക് സ്വാഗതം";
        break;
      default:
       
        greeting = "Hello!";
        break;
    }
 
    
    // Write the greeting to the response
    out.println("<h1>" + greeting + "</html>");
 
    out.close();
     out.println("</center>");
 
            out.println("</body>");
            out.println("</html>");
        }
    }

