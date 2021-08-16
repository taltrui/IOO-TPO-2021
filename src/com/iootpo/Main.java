package com.iootpo;

import com.iootpo.DAO.DBHandler;
import com.iootpo.DAO.UserDAO;
import com.iootpo.Model.User;
import com.iootpo.View.MainWindow;
import org.w3c.dom.UserDataHandler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DBHandler dbc = DBHandler.getConnection();

        UserDAO uDao = new UserDAO();

        List<User> results = new UserDAO().getAll();
        for (User p : results) {
            System.out.println(p.getUserName());
        }

        User res = uDao.get("test");

        System.out.println(res.getUserName());
        dbc.getEm().close();
        dbc.getEmf().close();

        new MainWindow();
    }
}
