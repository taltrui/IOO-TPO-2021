package com.iootpo.View.Screens;

public class RegisterPatient extends PatientData {

    public RegisterPatient() {
        super();
        setTitle("Registrar paciente");
        okButton.setText("Registrar");
    }

    @Override
    void onSubmit() {
        System.out.println("REGISTERED");
    }
}
