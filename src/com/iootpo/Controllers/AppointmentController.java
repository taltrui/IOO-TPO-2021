package com.iootpo.Controllers;

import com.iootpo.DAO.AppointmentDAO;
import com.iootpo.DAO.DentistDAO;
import com.iootpo.DAO.PatientDAO;
import com.iootpo.Model.Appointment;
import com.iootpo.Model.Dentist;
import com.iootpo.Model.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AppointmentController {

    private final AppointmentDAO appointmentDAO = new AppointmentDAO();
    private final List<String> days = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
    private final List<String> hours = Arrays.asList("9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00");

    public void create(Dentist selectedDentist, String selectedDay, String selectedHour) {
        String patientUsername = UserController.getController().getCurrentPatient().getUserName();

        appointmentDAO.create(new Appointment(patientUsername, selectedDentist.getRegistration(), selectedDay, selectedHour));
    }

    public void populateDentistCombo(JComboBox<Dentist> dentistCombo) {
        DentistDAO dentistDAO = new DentistDAO();

        List<Dentist> dentists = dentistDAO.getAll();

        dentistCombo.addItem(new Dentist());
        dentists.forEach(dentistCombo::addItem);
    }

    public void populateDayCombo(JComboBox<String> dayCombo, Dentist selectedDentist) {
        if (selectedDentist == null || selectedDentist.getRegistration() == null) {
            dayCombo.removeAllItems();
            return;
        }

        dayCombo.removeAllItems();
        dayCombo.addItem("");
        days.forEach(dayCombo::addItem);
    }

    public void populateHourCombo(JComboBox<String> hourCombo, Dentist selectedDentist, String selectedDay) {

        if (Objects.equals(selectedDay, "")) {
            hourCombo.removeAllItems();
            return;
        }

        List<Appointment> appointmentsByDentist = appointmentDAO.getAllByDentistAndDay(selectedDentist.getRegistration(), selectedDay);

        List<String> takenHours = appointmentsByDentist.stream().map(Appointment::getHour).toList();

        List<String> availableHours = hours.stream().filter(hour -> !takenHours.contains(hour)).toList();

        hourCombo.removeAllItems();
        hourCombo.addItem("");
        availableHours.forEach(hourCombo::addItem);
    }

    public void populateTable(Dentist selectedDentist, JTable table) {

        List<Appointment> appointmentsByDentist = appointmentDAO.getAllByDentist(selectedDentist.getRegistration());

        String[][] appointments = new String[][]{
                {"9:00", null, null, null, null, null},
                {"9:30", null, null, null, null, null},
                {"10:00", null, null, null, null, null},
                {"10:30", null, null, null, null, null},
                {"11:00", null, null, null, null, null},
                {"11:30", null, null, null, null, null},
                {"12:00", null, null, null, null, null},
                {"14:00", null, null, null, null, null},
                {"14:30", null, null, null, null, null},
                {"15:00", null, null, null, null, null},
                {"15:30", null, null, null, null, null},
                {"16:00", null, null, null, null, null},
                {"16:30", null, null, null, null, null},
                {"17:00", null, null, null, null, null},
        };

        for(Appointment appointment : appointmentsByDentist) {
            int indexOfDay = days.indexOf(appointment.getDay()) + 1;
            int indexOfHour = Math.max(hours.indexOf((appointment.getHour())), 0);
            System.out.println(appointment.getHour());
            Patient patient = new PatientDAO().get(appointment.getPatient());
            appointments[indexOfHour][indexOfDay] =  patient.getFirstName() + " " + patient.getLastName();
        }

        table.setModel(new DefaultTableModel(
                appointments,
                new String[]{
                        "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
                }
        ));

    }
}
