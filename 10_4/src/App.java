import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            /*la siguiente linea  */
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\TEMA 10\\10_4\\src\\NumerosReales.txt"));
            String texto = in.readLine();
            String[] subcadenas = texto.split(" ");
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);
            }
            System.out.println("suma:" + suma + "\tmedia:" + suma / subcadenas.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {

                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}