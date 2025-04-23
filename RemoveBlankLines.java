import java.io.*;

public class RemoveBlankLines {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();

        System.out.println("Blank lines removed successfully.");
    }
}
