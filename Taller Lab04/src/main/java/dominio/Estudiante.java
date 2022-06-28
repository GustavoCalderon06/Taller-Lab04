package dominio;


import datos.DataUpdater;
import datos.FileReader;

import java.util.ArrayList;

public class Estudiante  {
    private String rut;
    private String nombre;
    private String email;
    private boolean loginState = false;

    public Estudiante(String rut, String nombre, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
    }
    public void registrarUsuario() {
        int newId = FileReader.leerArchivo("src\\main\\java\\datos\\ICC264.txt").size() + 1;
        DataUpdater.guardarUsuario(this.rut, this.nombre,this.email, "src\\main\\java\\datos\\ICC264.txt", newId);
    }
    public boolean registroCheck(String filepath) {
        ArrayList<String> registros = FileReader.leerArchivo(filepath);
        this.loginState = false;
        for (String registro : registros) {
            String[] temp = registro.split(",");
            if (this.rut.equalsIgnoreCase(temp[0])) {
                this.loginState = true;
                break;
            }
            if (this.nombre.equalsIgnoreCase(temp[0])) {
                this.loginState = true;
                break;
            }
            if (this.email.equalsIgnoreCase(temp[0])) {
                this.loginState = true;
                break;
            }
        }
        return this.loginState;
    }


}
