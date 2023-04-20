import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\JAVA\\Documents\\archivotexto102.java.txt");
            int c = in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }

        } catch (IOException ex) {
            System.out.println("Mensaje Propio:    "+ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
            System.out.println(texto);
        }
    }
}
