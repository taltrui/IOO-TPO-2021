package com.iootpo.View.Screens;

public class ModifyPatient extends PatientData {

    public ModifyPatient() {
        super();
        setTitle("Modificar paciente");
        okButton.setText("Modificar");
        userCombo.setVisible(true);
    }
    @Override
    void onSubmit() {
        System.out.println("MODIFIED");
    }
}
