package org.example;


import java.io.*;

/**
 * AUTHOR: Poornima Sathya Keerthi
 */
public class Urinals {

    static BufferedWriter bufferedWriter;

    static {
        try {
            int suffix = 1;
            String fileName = "rule.txt";
            File file = new File("src/main/resources/", fileName);
            while (file.exists()) {
                fileName = "rule" + (suffix++) + ".txt";
                file = new File("src/main/resources/", fileName);
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file));
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
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/urinal.dat"));
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
        if(string.length()>20)
            return "-1";
        for(int j=0; j<string.length(); j+=1) {
            char c= urinal.charAt(j);
            if(c!='0' && c!='1')
                return "-1";
            if((j+1)<string.length()){
                if(c=='1' && urinal.charAt(j+1)=='1')
                    return "-1";
            }

        }
        while((i+3)<string.length()){
            if((urinal.charAt(i)=='1') && (urinal.charAt(i+1)=='0') && (urinal.charAt(i+2)=='0') && (urinal.charAt(i+3)=='0')) {
                urinal.setCharAt(i+2, '1');
                count+=1;
            } else if ((urinal.charAt(i)=='0') && (urinal.charAt(i+1)=='0') && (urinal.charAt(i+2)=='0') && (urinal.charAt(i+3)=='0')) {
                urinal.setCharAt(i, '1');
                urinal.setCharAt(i+2, '1');
                count+=2;
            } else if ((urinal.charAt(i)=='0') && (urinal.charAt(i+1)=='0') && (urinal.charAt(i+2)=='1') && (urinal.charAt(i+3)=='0')) {
                if(i!=0) {
                    if(urinal.charAt(i-1)!='1') {
                        urinal.setCharAt(i, '1');
                        count+=1;
                    }
                } else {
                    urinal.setCharAt(i, '1');
                    count+=1;
                }
            } else if ((urinal.charAt(i)=='0') && (urinal.charAt(i+1)=='0') && (urinal.charAt(i+2)=='0') && (urinal.charAt(i+3)=='1')) {
                urinal.setCharAt(i+1, '1');
                count+=1;
            } else if ((urinal.charAt(i)=='0') && (urinal.charAt(i+1)=='1') && (urinal.charAt(i+2)=='0') && (urinal.charAt(i+3)=='0')) {
                if((i+4)<string.length()){
                    if(urinal.charAt(i+4)=='0') {
                        urinal.setCharAt(i+3, '1');
                        count+=1;
                    }
                } else {
                    urinal.setCharAt(i+3, '1');
                    count+=1;
                }
            }
            i+=1;
        }


        return String.valueOf(count);
    }
}


