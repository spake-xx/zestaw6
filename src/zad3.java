import java.io.*;
import java.util.Scanner;

public class zad3 {
    static void sumujIZapisz(String plikWe) throws IOException {
        File file = new File(plikWe);
        file.createNewFile();
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));

        int suma = 0;
        String readed;
        while((readed = reader.readLine()) != null){
            suma+=Integer.parseInt(readed);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(plikWe, true));
        if(suma>0) writer.newLine();
        writer.write(String.valueOf(suma+1));
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
