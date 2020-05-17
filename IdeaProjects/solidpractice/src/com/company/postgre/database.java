package com.company.postgre;

import com.company.Interface.IDBRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database implements IDBRepository {


    @Override
    public Connection getConnection() {
        try {
            String connStr = "jdbc:postgresql://localhost:5432/employee";
            Connection conn = DriverManager.getConnection(connStr, "postgres", "almazik555");
            return conn;
        } catch (SQLException ex) {
            ex.getErrorCode();
        }
        return null;
    }
    }

