package com.telusko.web;
import jakarta.servlet.RequestDispatcher;
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
           req.setAttribute("message","Record add Successfully");
       }else{
           req.setAttribute("message","Record add Unsuccessfully");
       }
       try{
           RequestDispatcher rd=req.getRequestDispatcher("response.jsp");
           rd.forward(req,res);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public void destroy(){
        w=null;
    }
}
