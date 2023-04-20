import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*En el siguiente código me falla la variable cad ¿porque? */
public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            String cad = ("En un lugar de la mancha");
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));//escribimos caracter a caracter
            }
            cad = "de cuyo nombre no quiero acordarme. ";//segunda linea
            out.newLine();//cambio de linea en el archivo
            out.write(cad);//escribimos con una unica sentencia
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();//hacemos que se vacie el bufer y se escriba en el archivo
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
