package view;

import java.sql.Connection;
import java.sql.SQLException;

import persistence.GenericDao;

public class Teste {
    
    public static void main(String[] args) {
        GenericDao gDao =  new GenericDao();

        try {
            Connection c = gDao.getConnection();
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.out.println(sgbd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
