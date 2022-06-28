package Guis;

import dominio.Estudiante;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dominio.Estudiante;

public class Ventana_AgregarEstudianteICC264 extends Ventana implements ActionListener {
    private JLabel labelRut, labelNombre, labelEmail;
    public JTextField textfieldRut, textfieldNombre, textfieldEmail;
    private JButton botonAgregar, botonCancelar;


    public Ventana_AgregarEstudianteICC264() {
        super("Agregar Estudiante ICC 264", 600, 400);
        generarElementosVentana();
    }

    public void generarElementosVentana() {
        generarLabelRut();
        generarLabelNombre();
        generarLabelEmail();
        generarTextFieldRut();
        generarTextFieldNombre();
        generarTextFieldEmail();
        generarBotonAgregar();
        generarBotonCancelar();

    }

    public void generarLabelRut() {
        labelRut = new JLabel("Rut: ");
        labelRut.setBounds(50, 100, 200, 40);
        labelRut.setForeground(Color.BLACK);
        super.add(labelRut);


    }

    public void generarLabelNombre() {
        labelNombre = new JLabel("Nombre: ");
        labelNombre.setBounds(50, 150, 200, 40);
        labelNombre.setForeground(Color.BLACK);
        super.add(labelNombre);


    }

    public void generarLabelEmail() {
        labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(50, 200, 200, 40);
        labelEmail.setForeground(Color.BLACK);
        super.add(labelEmail);

    }

    public void generarTextFieldRut() {
        this.textfieldRut = new JTextField();
        textfieldRut.setBounds(150, 100, 400, 40);
        super.add(textfieldRut);


    }

    public void generarTextFieldNombre() {
        this.textfieldNombre = new JTextField();
        textfieldNombre.setVisible(true);
        textfieldNombre.setBounds(150, 150, 400, 40);
        super.add(textfieldNombre);


    }

    public void generarTextFieldEmail() {
        this.textfieldEmail = new JTextField();
        textfieldEmail.setBounds(150, 200, 400, 40);
        super.add(textfieldEmail);


    }

    public void generarBotonAgregar() {
        String textoBoton = "Agregar";
        this.botonAgregar = super.generarBoton(textoBoton, 50, 300, 200, 50);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);

    }

    public void generarBotonCancelar() {
        String textoBoton = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBoton, 350, 300, 200, 50);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);

    }

    public void registrarUsuario(String rut, String nombre, String email) {
        Estudiante estudiante = new Estudiante(rut, nombre, email);
        if (!estudiante.registroCheck("src\\main\\resources\\registro")) {
            estudiante.registrarUsuario();
            JOptionPane.showMessageDialog(this, "Registro exitoso.");
            this.dispose();
        }


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rut = textfieldRut.getText();
        String  nombre= textfieldNombre.getText();
        String email = textfieldEmail.getText();

        if (e.getSource() == this.botonAgregar) {
            registrarUsuario(rut,nombre, email);
        }else
            this.dispose();

        if (e.getSource() == this.botonCancelar) {
            Ventana_CursoICC264 ventana = new Ventana_CursoICC264();
            this.dispose();

    }


    }



}



