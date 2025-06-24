package view;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {

     public ViewDAO vd=null;
     public void init(){

         vd=new ViewDAO();
     }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        ArrayList<ArrayList<Object>> arr=vd.view();
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        for(Object a:arr){
            out.println(a.toString());
        }

    }
}
