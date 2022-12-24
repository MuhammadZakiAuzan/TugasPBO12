import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Penyewa {
    public static void main(String[] args) {
        FileReader reader;
        try {
            reader = new FileReader("mobil.txt");
            BufferedReader br = new BufferedReader(reader);
        } catch (Exception e) {
            Logger.getLogger(Mobil.class.getName()).log(Level.SEVERE, null, e);
        };

        java.io.File file = new java.io.File("mobil.txt");
        try {
            Scanner input = new Scanner(file);
            input.useDelimiter("\n");
            while (input.hasNext()) {
                String id_mobil = input.next();
                String nama = input.next();
                String notelp = input.next();
                String almt = input.next();
                System.out.println("id_penyewa : " + id_mobil);
                System.out.println("nama : " + nama);
                System.out.println("no telpon :" + notelp);
                System.out.println("Alamat Penyewa : "+almt);
            }
            input.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
