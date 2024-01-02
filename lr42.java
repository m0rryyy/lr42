import java.io.*;
import java.util.Scanner;

public class lr42 {
    public static void main(String[] args) throws IOException {

        // Handling text file
        String filePath = "C:\\Users\\Home\\Desktop\\lr42.txt";
        int fileWordCount = task1(filePath);
        System.out.println("Total words in file: " + fileWordCount);

        // Handling user input
        System.out.print("Enter your text:\n");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int wordCount = task2(text);
        System.out.println("Total words in input: " + wordCount);
    }
    public static int task1(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int wordCount = 0;

        while ((st = br.readLine()) != null) {
            String[] words = st.split("\\s+");
            wordCount += words.length;
            task3(st);
        }
        return wordCount;
    }

    public static int task2(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        task3(text);

        return wordCount;
    }
    public static void task3(String str) {
        int mid = str.length() / 2;
        String firstHalf = str.substring(0, mid).replaceAll("[^a-zA-Z ]", "");
        String secondHalf = new StringBuilder(str.substring(mid)).reverse().toString().replaceAll("[^a-zA-Z ]", "");
        System.out.println(firstHalf + " " + secondHalf);
    }
}

