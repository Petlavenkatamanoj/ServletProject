package update;

import DB.DBConnection;
import jakarta.servlet.ServletRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDAO {
    public int k=0;
    public int update(ServletRequest req){

        try{
            Connection con= DBConnection.getCon();
            PreparedStatement pw=con.prepareStatement("update employment1 set salary=?, name=? ,department=? where id=?");
            pw.setString(1,req.getParameter("salary"));
            pw.setString(2,req.getParameter("name"));
            pw.setString(3,req.getParameter( "department"));
            pw.setInt(4,Integer.parseInt(req.getParameter( "id")));
            k=pw.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        return k;
    }
}
