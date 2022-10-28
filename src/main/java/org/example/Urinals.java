package org.example;


import java.io.*;

/**
 * AUTHOR: Poornima Sathya Keerthi
 */
public class Urinals {
    static BufferedWriter bufferedWriter;

    static {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        readFromFile();
        bufferedWriter.close();
    }
    public static void readFromFile() throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/input.txt"));
        while ((line = bufferedReader.readLine()) != null) {
            writeToFile(countUrinals(line));
        }

    }

    public static void writeToFile(String string) throws IOException {
        bufferedWriter.write(string);
        bufferedWriter.newLine();
    }

    public static String countUrinals(String string) {
        StringBuilder urinal = new StringBuilder(string);
        int i =0;
        int count = 0;
        System.out.println("NOT YET IMPLEMENTED");
        return String.valueOf(count);
    }

}