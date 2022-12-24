import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mobil {
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
                String jenis_mobil = input.next();
                String harga = input.next();
                System.out.println("id_mobil : " + id_mobil);
                System.out.println("jenis mobilnya : " + jenis_mobil);
                System.out.println("harga cuci mobilnya :" + harga);
            }
            input.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
