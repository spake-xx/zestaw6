import java.io.*;

public class zad5 {
    static void emerytura(String plikWe) throws IOException {
        File file = new File(plikWe);
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));
        BufferedWriter kobiety = new BufferedWriter(new FileWriter("kobiety.txt"));
        BufferedWriter mezczyzni = new BufferedWriter(new FileWriter("mezczyzni.txt"));

        String readed;
        while((readed = reader.readLine()) != null){
            String[] person = readed.split(" ");
            if(person[2].equals("M")){
                mezczyzni.newLine();
                mezczyzni.write(person[1]+" "+person[0]+" "+(65-(Integer.parseInt(person[3]))));
            }else{
                kobiety.newLine();
                kobiety.write(person[1]+" "+person[0]+" "+(60-(Integer.parseInt(person[3]))));
            }
        }

        kobiety.close();
        mezczyzni.close();
    }

    public static void main(String[] args) {
        try {
            emerytura("zad5.txt");
        }catch(IOException e){
            System.out.println("Blad odczytu badz zapisu:"+e.getMessage());
        }
    }
}
