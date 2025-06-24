package com.telusko.web;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Alian extends HttpServlet {
     public Worker w=null;
     public void init(){
         w=new Worker();
     }
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
       w.setId(Integer.parseInt(req.getParameter("id")));
       w.setSalary(Integer.parseInt(req.getParameter("salary")));
       w.setName(req.getParameter("name"));
       w.setDepartment(req.getParameter("department"));
       int k=new InsertDAO().insert(w);
       PrintWriter out=res.getWriter();
       res.setContentType("text/html");
       if(k>0){
           out.println("add successfully");
       }
    }
    public void destroy(){
        w=null;
    }
}
