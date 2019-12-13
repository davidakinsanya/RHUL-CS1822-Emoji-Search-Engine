import java.util.*;
import java.io.*;

class EmojiSearch {

    public static void read_method() {
        try {
            BufferedReader buffer;
            String line;
            buffer = new BufferedReader(new FileReader("emoji-formatted.txt"));
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter what type of emoji you would like to search: ");
            String search_term = sc.nextLine();
            
            while ((line = buffer.readLine())!= null) {
            
                for (int i = 0; i < line.length(); i++) { 
                    if (line.indexOf(search_term) != -1) {
                        System.out.println(line);
                        break;
                    } else {
                        continue;
                    }
                }
            }
            
        } catch(IOException ioEx) {
            System.err.format("Error: %s%n", ioEx);
        }
    }

    public static void main(String[] args) {
        read_method();
    }
}
