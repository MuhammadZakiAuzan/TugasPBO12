import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class kembali {
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
                String tgls = input.next();
                String tglk = input.next();
                String no_kwitansi = input.next();
                System.out.println("tanggal sewa : " + tgls);
                System.out.println("tanggal kembali : " + tglk);
                System.out.println("no kwitansi :" +no_kwitansi);
            }
            input.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
