/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author manthan
 */
@WebServlet(urlPatterns = {"/servletInfo"})
public class M_servletInfo extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>M_04</title>");
            out.println("</head>");
            out.println("<body>");
//            out.println("<h1>Servlet M_servletInfo at " + request.getContextPath() + "</h1>");
            out.println("<table border=1");
            out.println("<tr>");
            out.println("<th>Server Port : </th><td>" + request.getServerPort() + "</td></tr>");
            out.println("<tr><th> Server Name : </th><td>" + request.getServerName() + "</td></tr>");
            out.println("<tr><th> Protocol: </th><td>" + request.getProtocol() + "</td></tr>");
            out.println("<tr><th> Character-Encoding:</th><td>" + request.getCharacterEncoding() + "</td></tr>");
            out.println("<tr><th> Content Type : </th><td>" + request.getContentType() + "</td></tr>");
            out.println("<tr><th> Content Length : </th><td>" + request.getContentLength() + "</td></tr>");
            out.println("<tr><th> Remote Address : </th><td>" + request.getRemoteAddr() + "</td></tr>");
            out.println("<tr><th> Remote Host : </th><td>" + request.getRemoteHost() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
