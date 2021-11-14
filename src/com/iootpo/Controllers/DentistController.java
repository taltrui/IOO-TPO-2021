package com.iootpo.Controllers;

import com.iootpo.DAO.DentistDAO;
import com.iootpo.Model.Dentist;
import com.iootpo.Model.Patient;

import javax.swing.*;
import java.util.List;

public class DentistController {
    DentistDAO dentistDAO = new DentistDAO();

    public void update(Dentist dentist) {
        dentistDAO.update(dentist);
    }

    public void populateCombo(JComboBox dentistCombo) {
        List<Dentist> dentists = dentistDAO.getAll();

        dentistCombo.addItem(new Patient());
        dentists.forEach(user -> dentistCombo.addItem(user));
    }

    public void create(Dentist newDentist) {
        dentistDAO.create(newDentist);
    }
}
