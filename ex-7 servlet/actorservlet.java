/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/actors"})
public class actors extends HttpServlet {

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
        String c=request.getParameter("surf");
        String info="";
        String a="";
        String b="";
        String r="";
        String d="";
        String url = "";
        if(c.equals("thalapathy")||c.equals("vijay")){
            info="Vijay Chandrasekhar (born 22 June 1974), known professionally as Vijay, is an Indian actor and singer who works predominantly in Tamil cinema.[ He is among the highest paid actors in India.[4 He has played the lead in 66 films and the International Business Times framed him as a \"consistent performer\".[ Referred to as \"Thalapathy\", Vijay has a significant following internationally.[4][5] He has won several awards, including a South Indian International Movie Award." ;      
            a="mersal";
            b="thuppaki";
            r="sarkar";
            d="varisu";
            url="https://m.media-amazon.com/images/M/MV5BZWJlODhlMzctOTU0Yi00MTUwLTkxODYtMDNjNTQxYTI2YTE1XkEyXkFqcGdeQXVyMTEzNzg0Mjkx._V1_.jpg";
        }
        else if(c.equals("ulaganayagan")||c.equals("kamal")){
            info="Kamal Haasan (born 7 November 1954)[5] is an Indian actor, filmmaker, screenwriter, playback singer, television presenter and politician who works mainly in Tamil cinema and has also appeared in some Telugu, Malayalam, Hindi, Kannada and Bengali films. He has been recognised as an influence for actors and filmmakers in the Tamil film industry. He is also known for introducing many new technologies and cosmetics to the Indian film industry.[6][7][8] He has won numerous accolades, including Four National Film Awards, Nine Tamil Nadu State Film Awards, Four Nandi Awards, One Rashtrapati Award, Two Filmfare Awards and 17 Filmfare Awards South. He was awarded the Kalaimamani Award in 1984, the Padma Shri in 1990, the Padma Bhushan in 2014 and the Ordre des Arts et des Lettres (Chevalier) in 2016";
        a="vikram";
        b="papanasam";
        r="Anbe sivam";
        d="Thenali";
        url="https://images.news18.com/ibnlive/uploads/2021/11/kamal-haasan-2.jpg";
        }
        else if(c.equals("dq")||c.equals("dulquer salmaan")){
            
            info="Dulquer Salmaan (born 28 July 1983) is an Indian actor, playback singer and film producer who predominantly works in Malayalam films, in addition to few Tamil, Telugu and Hindi films. He graduated with a bachelor's degree in business management from Purdue University and worked as a business manager in Dubai before pursuing a career in acting. Dulquer is a recipient of several awards including, four Filmfare Awards South and a Kerala State Film Award.";
        a="ok kanmani";
        b="Sita Ramam";
        r="Charlie";
        d="Kali";
        url="https://pbs.twimg.com/media/EtRRoDuU4AIQsQP?format=jpg&name=large";
        }
        else if(c.equals("thalaivar")||c.equals("Rajinikanth")){
            
        info="Rajinikanth is an Indian actor who has appeared in over 260 films, predominantly in Tamil cinema. He began his film career by playing antagonistic and supporting roles before graduating to a lead actor. After starring in numerous commercially successful films throughout the 1980s and 1990s, he has continued to hold a matinée idol status in the popular culture of Tamil Nadu.[3] Writing for Slate, Grady Hendrix called him the \"biggest movie star you've probably never heard of.Rajinikanth has also worked in other Indian film industries such as Hindi, Telugu, Kannada, Malayalam and Bengali";
        a="Padayappa";
        b="Thalapathi";
        r="Muthu";
        d="2.O";
        url="https://upload.wikimedia.org/wikipedia/commons/8/88/Rajinikanth_at_the_Inauguration_of_MGR_Statue_%28cropped%29.jpg";
        }
         PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet city</title>");            
            out.println("</head>");
            out.println("<body style='background-color:white;color:black;margin-top:150px;'><center>");
            out.println("<h1>"+c+"</h1><br>");
            out.println("<img src='"+url+"'alt='image'heigth=600px width=500px><br>");
            out.println("<p>"+info +"</p></center>");
            out.println("<ul><li>"+ a+"</li>"+"<li>"+ b+"</li>"+"<li>"+ r+"</li>"+"<li>"+ d+"</li></ul>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}