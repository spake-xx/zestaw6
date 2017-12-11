import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad1 {

    static int[] zliczZnakiSlowa(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int read;
        int bialeZnaki = 0;
        int slowa = 0;
        int znaki = 0;

        boolean noweSlowo = false;
        while((read = reader.read()) != -1){
            znaki++;
            if(Character.isWhitespace(read)) bialeZnaki++;
            if(!Character.isWhitespace(read) && !noweSlowo){
                noweSlowo = true;
                slowa++;
            }else if(Character.isWhitespace(read)){
                noweSlowo = false;
            }
        }

        System.out.println(bialeZnaki);
        int[] response = {znaki, slowa, bialeZnaki};

        return  response;
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        int[] znaki = new int[2];
        try {
            znaki = zliczZnakiSlowa(file);
        }catch(IOException e){
            System.out.println("Blad odczytu");
        }
    }
}
