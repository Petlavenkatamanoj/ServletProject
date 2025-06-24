package update;

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
        int k = up.update(req);  // UpdateDAO should now accept HttpServletRequest
        res.setContentType("text/html");
        try (PrintWriter out = res.getWriter()) {
            if (k > 0) {
                out.println("Element Updated Successfully");
            } else {
                out.println("Update unsuccessfully");
            }
        }
    }

}
