import java.io.*;
public class filehandling {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("example.txt");
            obj.write("This is my file handling class");
            obj.close();
            System.out.println("File created successfully");
        }
        catch (IOException e) {
        }
    }
}
