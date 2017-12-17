import java.io.*;

public class zad6 {
    static void tabToHTML(String plikWe) throws IOException {
        File file = new File(plikWe);
        BufferedReader reader = new BufferedReader(new FileReader(plikWe));
        BufferedWriter writer = new BufferedWriter(new FileWriter("HTML_"+plikWe));
        writer.write("<html><body><table>\n");


        String readed;
        while((readed = reader.readLine()) != null){
            String[] lineContent = readed.split(" ");
            writer.newLine();
            writer.write("<tr>");
            for(String x:lineContent){
                writer.write("<td>"+x+"</td>");
            }
            writer.write("</tr>");
        }

        writer.write("</table></body></html>");
        writer.close();
    }

    public static void main(String[] args) {
        try {
            tabToHTML("zad6.txt");
        }catch(IOException e){
            System.out.println("Blad odczytu badz zapisu:"+e.getMessage());
        }
    }
}
