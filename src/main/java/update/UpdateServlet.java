package update;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    public UpdateDAO up=null;
    public void init(){
        up=new UpdateDAO();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String idStr = req.getParameter("id");
        String salaryStr = req.getParameter("salary");

        res.setContentType("text/html");


        if (idStr == null || salaryStr == null || idStr.trim().isEmpty() || salaryStr.trim().isEmpty()) {
            req.setAttribute("message", "ID and Salary fields are required.");
            RequestDispatcher rd = req.getRequestDispatcher("updateview.jsp");
            rd.forward(req, res);
            return;
        }

        try {
            int id = Integer.parseInt(idStr);
            int salary = Integer.parseInt(salaryStr);
            req.setAttribute("id", id);
            req.setAttribute("salary", salary);

            int k = up.update(req); // assumes update() uses these attributes

            if (k > 0) {
                req.setAttribute("message", "Element Updated Successfully");
            } else {
                req.setAttribute("message", "Update Unsuccessful");
            }
        } catch (NumberFormatException e) {
            req.setAttribute("message", "Please enter valid numeric values for ID and Salary.");
        }

        RequestDispatcher rd = req.getRequestDispatcher("updateview.jsp");
        rd.forward(req, res);
    }

}

