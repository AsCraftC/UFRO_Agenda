package ac.ufroagenda.DataManaging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataReader {
    
    private String route;
    
    public DataReader(String route){
        this.route=route;
    }
    /**
     * Le das una ruta y te devuelve los bites del archivo de esa ruta.
     */
    public String readFile() {
        Path file = Paths.get(route);
        String data = new String();
        try {
            data = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            data="";
        }
        return data;
    }
    /**
     * Le das una ruta y un texto a guardar para con ello escribir los bites de 
     * un archivo con esa información
     * @param data
     */
    public void writeFile(String data) {
        Path archivo = Paths.get(route);
        try {
            Files.write(archivo, data.getBytes());
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser escrito");
            System.err.println(e);
        }
    }
}