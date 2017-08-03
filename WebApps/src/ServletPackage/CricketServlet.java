package ServletPackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "CricketServlet")
public class CricketServlet extends HttpServlet {
    //Map<String, String> data = new HashMap<>();
    List<CricketData> list = new ArrayList<>();


    public void init() throws ServletException {
        list.add(new CricketData("Mumbai", 230,"One-day",new Date(2018, 12,23 ), "India", "England"));
        list.add(new CricketData("Lord's", 200,"One-day",new Date(2018, 12,23 ), "India","Pakistan"));
        list.add(new CricketData("Pune", 400,"Test",new Date(2019, 11,21 ), "India", "England"));
        list.add(new CricketData("London", 600,"Test",new Date(2017, 07,02 ), "India", "Australia"));
        list.add(new CricketData("London", 600,"Test",new Date(2020, 07,02 ), "India", "England"));
    }

    public void destroy() {
        list.clear();
        list = null;
    }

   /* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country1 = request.getParameter("Country1");
        String country2 = request.getParameter("Country2");
        String type = request.getParameter("type");

        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");

        Iterator<CricketData> itr = list.iterator();
        while (itr.hasNext()) {
            CricketData cricketdata = itr.next();
            if( country1.equals(cricketdata.country1) && country2.equals(cricketdata.country2) && type.equals(cricketdata.type)) {
                pw.write(cricketdata.toString());
            }
        }
        //pw.write("Today" + countryName + " scored " + score + " day is : " + data.get(cityName) + " degree.");

    }
}
