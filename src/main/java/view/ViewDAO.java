package view;

import DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewDAO {
    public ArrayList<ArrayList<Object>> view() {
        ArrayList<ArrayList<Object>> arr = new ArrayList<>();
        try {
            Connection con = DBConnection.getCon();
            PreparedStatement pm = con.prepareStatement("SELECT * FROM employment1");
            ResultSet rs = pm.executeQuery();

            while (rs.next()) {
                ArrayList<Object> row = new ArrayList<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("name"));
                row.add(rs.getInt("salary"));
                row.add(rs.getString("department"));
                arr.add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
}
