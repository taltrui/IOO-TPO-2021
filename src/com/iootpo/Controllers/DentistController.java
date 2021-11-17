package com.iootpo.Controllers;

import com.iootpo.DAO.DentistDAO;
import com.iootpo.Model.Dentist;

import javax.swing.*;
import java.util.List;

public class DentistController {
    DentistDAO dentistDAO = new DentistDAO();

    public void update(Dentist dentist) {
        dentistDAO.update(dentist);
    }

    public void populateCombo(JComboBox<Dentist> dentistCombo) {
        List<Dentist> dentists = dentistDAO.getAll();

        dentistCombo.addItem(new Dentist());
        dentists.forEach(dentistCombo::addItem);
    }

    public void create(Dentist newDentist) {
        dentistDAO.create(newDentist);
    }
}
