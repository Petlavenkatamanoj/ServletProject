package Delete;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private DeleteDAO del;

    public void init() {
        del = new DeleteDAO();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");

        String idStr = req.getParameter("id");
        String message;

        if (idStr == null || idStr.trim().isEmpty()) {
            message = "ID field is required.";
        } else {
            try {
                int id = Integer.parseInt(idStr.trim());
                req.setAttribute("id", id); // Optional, if needed in DAO

                int k = del.delete(req);

                if (k > 0) {
                    message = "Deleted Successfully.";
                } else {
                    message = "No record found with the given ID.";
                }

            } catch (NumberFormatException e) {
                message = "Invalid ID. Please enter a valid number.";
            }
        }

        req.setAttribute("message", message);
        RequestDispatcher rd = req.getRequestDispatcher("deleteview.jsp");
        rd.forward(req, res);
    }
}
