package Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import datos.FileReader;

public class Ventana_CursoICC264 extends Ventana implements ActionListener {
    private JLabel labelNombre,labelEmail;
    private JTextField textfieldNombre,textfieldEmail;
    private JComboBox mostrarLista;
    private JButton botonNuevoEstudiante;

    public Ventana_CursoICC264() {
        super("Curso ICC264",600,400);
        generarElementosVentana();


    }
    public void generarElementosVentana(){
        generarLista();
        generarLabelNombre();
        generarLabelEmail();
        generarTextFieldNombre();
        generarTextFieldEmail();
        generarBotonNuevoEstudiante();

    }
    public void generarLista(){
        String [] marcas = {};
        this.mostrarLista= new JComboBox(marcas);
        mostrarLista.setBounds(50,50,130,20);
        super.add(mostrarLista);

    }
    public void generarLabelNombre(){
        labelNombre = new JLabel("Nombre: ");
        labelNombre.setBounds(50, 100, 200, 40);
        labelNombre.setForeground(Color.BLACK);
        super.add(labelNombre);


    }
    public void generarLabelEmail(){
        labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(50, 150, 200, 40);
        labelEmail.setForeground(Color.BLACK);
        super.add(labelEmail);

    }
    public void generarTextFieldNombre(){
        this.textfieldNombre = new JTextField();
        textfieldNombre.setBounds(150, 100, 400, 40);
        textfieldNombre.setEditable(false);
        super.add(textfieldNombre);


    }
    public void generarTextFieldEmail(){
        this.textfieldEmail = new JTextField();
        textfieldEmail.setBounds(150, 150, 400, 40);
        textfieldEmail.setEditable(false);
        super.add(textfieldEmail);



    }
    public void generarBotonNuevoEstudiante(){
        String textoBoton = "Nuevo Estudiante";
        this.botonNuevoEstudiante = super.generarBoton(textoBoton, 350, 300, 200, 50);
        this.add(this.botonNuevoEstudiante);
        this.botonNuevoEstudiante.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonNuevoEstudiante){
            Ventana_AgregarEstudianteICC264 ventana= new Ventana_AgregarEstudianteICC264();
            this.dispose();
        }
    }
}
