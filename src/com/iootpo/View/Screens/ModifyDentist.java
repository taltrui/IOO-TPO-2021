package com.iootpo.View.Screens;

public class ModifyDentist extends DentistData {

    public ModifyDentist() {
        super();
        setTitle("Modificar paciente");
        okButton.setText("Modificar");
        dentistCombo.setVisible(true);
    }

    @Override
    void onSubmit() {
        System.out.println("REGISTERED");
    }
}
