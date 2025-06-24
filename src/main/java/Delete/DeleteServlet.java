package Delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DeleteServlet extends HttpServlet {
    private DeleteDAO del;

    public void init() {
        del = new DeleteDAO();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        int k = del.delete(req);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (k > 0) {
            out.println("Delete Element Successfully");
        } else {
            out.println("Delete Failed");
        }
    }
}
