import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class notakembali {
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
                String no_notak = input.next();
                String tgl_nota = input.next();
                System.out.println("no nota kembali : " +no_notak);
                System.out.println("tanggal kembali : " +tgl_nota);
            }
            input.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
