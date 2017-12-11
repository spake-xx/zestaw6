import java.io.*;
import java.util.Scanner;

public class zad3 {
    static void sumujIZapisz(String plikWe) throws IOException {
        File file = new File(plikWe);
        Scanner reader = new Scanner(file);
        BufferedWriter writer = new BufferedWriter(new FileWriter(plikWe));


        writer.close();
    }

    public static void main(String[] args) {
        try {
            sumujIZapisz("zad3.txt");
        }catch(IOException e){
            System.out.println("Blad odczytu badz zapisu:"+e.getMessage());
        }
    }
}
