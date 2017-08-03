package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss" );
        Date date = new Date();
        pw.write("<h2><b>The Date And Time is :</b></h2><br/>" +dateFormat.format(date));
        pw.write("<br><h2>The random numbers generated are: </h2><br/>" +Math.random());
    }
}