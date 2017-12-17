import java.io.*;

public class zad4 {
    static void szyfruj(String plikWe, int przesuniecie) throws IOException {
        File file = new File(plikWe);
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));
        BufferedWriter writer = new BufferedWriter(new FileWriter("_"+plikWe));

        int readed;
        while((readed = reader.read()) != -1){
            writer.write(readed+przesuniecie);
        }

        writer.close();
    }
    static void deszyfruj(String plikWe, int przesuniecie) throws IOException {
        File file = new File(plikWe);
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));
        BufferedWriter writer = new BufferedWriter(new FileWriter("_"+plikWe));

        int readed;
        while((readed = reader.read()) != -1){
            System.out.print((char)(readed-przesuniecie));
        }

        writer.close();
    }

    public static void main(String[] args) {
        try {
            szyfruj("zad4.txt", 1);
            deszyfruj("_zad4.txt", 1);
        }catch(IOException e){
            System.out.println("Blad odczytu badz zapisu:"+e.getMessage());
        }
    }
}
