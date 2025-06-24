package Delete;

import DB.DBConnection;
import jakarta.servlet.ServletRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDAO {
    public int k=0;
    public int delete(ServletRequest req){
        try{
            Connection con= DBConnection.getCon();
            PreparedStatement pr=con.prepareStatement("delete from employment1 where id=?");
            pr.setInt(1,Integer.parseInt(req.getParameter("id")));
            k=pr.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return k;
    }
}
