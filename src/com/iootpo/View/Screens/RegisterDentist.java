package com.iootpo.View.Screens;

public class RegisterDentist extends DentistData {

    public RegisterDentist() {
        super();
        setTitle("Registrar odontólogo");
        okButton.setText("Registrar");
    }

    @Override
    void onSubmit() {
        System.out.println("REGISTERED");
    }
}
