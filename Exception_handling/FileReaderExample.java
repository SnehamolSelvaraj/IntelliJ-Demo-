import java.io.*;

public class FileReaderExample {
    public static void readFile() throws IOException {
        File file = new File("data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        System.out.print("File contains: ");
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) {
        System.out.println("Trying to open 'data.txt'");
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
