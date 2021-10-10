package com.iootpo;

import com.iootpo.View.Screens.Login;
import com.iootpo.View.Screens.MainWindow;

public class Main {

    public static void main(String[] args) {
//
//        DBHandlerSingleton dbc = DBHandlerSingleton.getConnection();
//
//        UserDAO uDao = new UserDAO();
//
//        List<User> results = new UserDAO().getAll();
//        for (User p : results) {
//            System.out.println(p.getUserName());
//        }
//
//        User res = uDao.get("test");
//
//        System.out.println(res.getUserName());
//        dbc.getEm().close();
//        dbc.getEmf().close();

        Login.getWindow().setVisible(true);
    }
}
