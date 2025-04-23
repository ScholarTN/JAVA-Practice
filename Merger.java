import java.io.*;

public class Merger {
    // WAP TO ACCEPT a file and reverse every word and write it to another file using StringBuffer.

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Merger <inputFile> <outputFile>");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    StringBuffer sb = new StringBuffer(word);
                    bw.write(sb.reverse().toString() + " ");
                }
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


