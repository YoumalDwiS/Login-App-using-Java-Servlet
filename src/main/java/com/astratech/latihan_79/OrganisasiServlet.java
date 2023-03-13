package com.astratech.prg7_m2_p1_079;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrganisasiServlet", value = "/OrganisasiServlet")
public class OrganisasiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String organisasiValues[] = request.getParameterValues("daftarOrganisasi");
        StringBuffer myResponse = new StringBuffer();
        myResponse.append("<!DOCTYPE html>");
        myResponse.append("<html>");
        myResponse.append("<head>");
        myResponse.append("<title>Organisasi</title>");
        myResponse.append("</head>");
        myResponse.append("<body>");
        myResponse.append("<h1>Berikut organisasi yang kamu ikuti : </h1>");
        for (int i = 0; i <organisasiValues.length;i++){
            myResponse.append("<br/><li>");
            myResponse.append(organisasiValues[i]);
        }
        myResponse.append("</body>");
        myResponse.append("<html>");
        out.println(myResponse.toString());

    }
}
