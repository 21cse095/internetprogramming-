/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/sessiontracking"})
public class sessiontracking extends HttpServlet {

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
        HttpSession session = request.getSession(true);
            String title = "VISIT YOUR SESSION";
            String q1 = "what is okay?";
             String a1 = request.getParameter("a1");
              String q2 = "what is RBI?";
             String a2 = request.getParameter("a2");
              String q3 = "What is IP?";
             String a3 = request.getParameter("a3");
              String q4 = "what is PYTHON?";
             String a4 = request.getParameter("a4");
              String q5 = "what is java?";
             String a5 = request.getParameter("a5");

          session.setAttribute("q1", q1);
          session.setAttribute("a1", a1);
           session.setAttribute("q2", q2);
          session.setAttribute("a2", a2);
           session.setAttribute("q3", q3);
          session.setAttribute("a3", a3);
           session.setAttribute("q4", q4);
          session.setAttribute("a4", a4);
           session.setAttribute("q5", q5);
          session.setAttribute("a5", a5);
              PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet quizsession</title>");            
            out.println("</head>");
            out.println("<body style='background-color: black;margin-top: 150px;color:white;'><center>");
            out.println("<h1>"+ title + "</h1><br>");
            out.println("<a href='servlet2' style='text-decoration: none;color:white'><h3>visit</h3></a></center>");
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