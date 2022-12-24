import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class notadp {
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
                String no_notadp = input.next();
                String tglkmbali = input.next();
                String tgltotal = input.next();
                System.out.println("no notadp : " +no_notadp);
                System.out.println("tanggal sewa : " +tglkmbali);
                System.out.println("total :" +tgltotal);
            }
            input.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
