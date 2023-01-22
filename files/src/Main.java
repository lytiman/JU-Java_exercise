import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter write = new FileWriter("file.txt");
            write.write("\tjava file system may be trick but it is funny" +
                    " hi dude\n");
            write.write("\t\twhy we always write things my friend\n");
            write.write("\t\t\tbecause human brain want to remember things that written than unwritten one ");
            write.close();
        } catch (IOException e) {
            System.out.println("error:"+ e);
        }
        try {
            File myfile=new File("file.txt");
        Scanner readFrom=new Scanner(myfile);
        while (readFrom.hasNextLine()) {
                    String data = readFrom.nextLine();
                    System.out.println(data);
                }
            } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    }
