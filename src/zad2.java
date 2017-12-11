import java.io.*;

public class zad2 {

    static void szukaj(String plikWe, String plikWy, String slowo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));
        BufferedWriter writer = new BufferedWriter(new FileWriter(plikWy));

        int read;
        String currentLine;
        char[] slowo_arr = slowo.toCharArray();
        int line = 0;


        while((currentLine = reader.readLine()) != null){
            line++;

            boolean znaleziono=false;
            for(int i=0; i<currentLine.length(); i++){
                int liczbaZgodnych = 0;
                if(currentLine.toCharArray()[i] == slowo_arr[0] && currentLine.length()-i>=slowo_arr.length){
                    for(int k=i; k<currentLine.length() && (k-i)<slowo_arr.length; k++){
                        if(currentLine.toCharArray()[k]==slowo_arr[k-i]) liczbaZgodnych++;
                    }
                }
                if(liczbaZgodnych==slowo_arr.length) znaleziono=true;
            }

            if(znaleziono) writer.write(line+": "+currentLine+"\r");
        }

        writer.close();
    }

    public static void main(String[] args) {
        try {
            szukaj("test.txt", "wyjscie_zad2.txt", "egzam");
        }catch(IOException e){
            System.out.println("Blad odczytu badz zapisu:"+e.getMessage());
        }
    }
}
