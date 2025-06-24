package view;

import DB.DBConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ViewDAO {
    public int i=0;
    public ArrayList<ArrayList<Object>> arr=new ArrayList<>();
    public ArrayList<ArrayList<Object>> view(){
        try{
            ArrayList<Object> arr1=new ArrayList<>();
            Connection con= DBConnection.getCon();
            PreparedStatement pm=con.prepareStatement("Select * from employment1");
            ResultSet k=pm.executeQuery();
            while(k.next()){
                int m=k.getInt("id");
                int s=k.getInt("salary");
                String n=k.getString("name");
                String l=k.getString("department");
                arr1.add(m);
                arr1.add(s);
                arr1.add(n);
                arr1.add(l);

                arr.add(arr1);
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
}
