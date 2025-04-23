
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class comparefiles {
    // WAP to compare two files line by line and display true if lines are same, and false for different lines for as many lines are there.
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("lpu.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Scholar2.txt"));

        String line1, line2;
        while (true) {
            line1 = br1.readLine();
            line2 = br2.readLine();

            if (line1 == null && line2 == null) {
                break; // both files ended
            }

            if (line1 == null || line2 == null || !line1.equals(line2)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }

        br1.close();
        br2.close();
    }
}

