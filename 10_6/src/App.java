import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream flujo=null;
        try{
            flujo=new FileInputStream("Enteros.txt");

        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        Scanner s= new Scanner (flujo);
        int contador = 0;
        int suma=0;
        while(s.hasNext()){
            int n=s.nextInt();
            System.out.println(n + " ");
            suma +=n;
            contador ++;
        }
        double media=(double) suma/contador;
        System.out.println("\nsuma: " + suma + " media:" + media);
    }
}
