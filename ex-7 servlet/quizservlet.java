import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet2 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
  
        HttpSession session = request.getSession(false);

         String title = "session details";
         Date createTime = new Date(session.getCreationTime());
         Date lastAccessTime = new Date(session.getLastAccessedTime());
        String q1 = (String)session.getAttribute("q1");
        String a1 = (String)session.getAttribute("a1");
         String q2 = (String)session.getAttribute("q2");
        String a2 = (String)session.getAttribute("a2");
         String q3 = (String)session.getAttribute("q3");
        String a3 = (String)session.getAttribute("a3");
         String q4 = (String)session.getAttribute("q4");
        String a4 = (String)session.getAttribute("a4");
         String q5 = (String)session.getAttribute("q5");
        String a5 = (String)session.getAttribute("a5");
        try{
      
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>quiz session</title>");            
            out.println("</head>");
            out.println("<body style='background-color: white;margin-top: 150px;color:black;'><center>");
            out.println("<h1>"+ title + "</h1><br>");
            out.println("<h3>start session : " + createTime + "</h3><br>");
            out.println("<h3>question 1: " + q1 + "</h3><br>");
            out.println("<h3>answer 1 : " + a1 + "</h3><br>");
            out.println("<h3>question 2: " + q2 + "</h3><br>");
            out.println("<h3>answer 2 : " + a2 + "</h3><br>");
            out.println("<h3>question 3: " + q3 + "</h3><br>");
            out.println("<h3>answer 3 : " + a3 + "</h3><br>");
            out.println("<h3>question 4: " + q4 + "</h3><br>");
            out.println("<h3>answer 4 : " + a4+ "</h3><br>");
            out.println("<h3>question 5: " + q5 + "</h3><br>");
            out.println("<h3>answer 5 : " + a5 + "</h3><br>");
            out.println("<h3>End session: " + lastAccessTime + "</h3><br></center>");
    
            out.println("</body>");
            out.println("</html>");
            }finally{
      out.close();

    }


}
