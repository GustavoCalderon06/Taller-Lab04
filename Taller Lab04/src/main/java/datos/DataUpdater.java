package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataUpdater {
    public static void guardarUsuario(String rut, String nombre,String email, String filepath, int id){
        BufferedWriter bw = null;
        FileWriter fichero = null;

        try {
            File file = new File(filepath);
            fichero = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fichero);
            if(id == 1){
                bw.write(rut+","+nombre+","+email);
            }
            else {
                bw.write("\n" +rut+","+nombre+","+email);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fichero != null)
                    fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
