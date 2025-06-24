package com.telusko.web;

import DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDAO {
    public int insert(Worker w){

        int k=0;
        try{
            Connection con= DBConnection.getCon();
            PreparedStatement pm=con.prepareStatement("insert into employment1 values(?,?,?,?)");
            pm.setInt(1,w.getId());
            pm.setInt(2,w.getSalary());
            pm.setString(3, w.getName());
            pm.setString(4,w.getDepartment());

            k=pm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return k;
    }
}
