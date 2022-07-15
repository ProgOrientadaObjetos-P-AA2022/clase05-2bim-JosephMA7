package paquete10;

public class Principal3 {

    public static void main(String[] args) {
        String nombreArchivo = "Generadores.data";
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        
        lectura.establecerGeneradores();
        System.out.println(lectura);

    }
}
