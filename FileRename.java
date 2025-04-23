import java.io.File;

public class FileRename {
    // Rename a file using File's renameTo method

    public static void main(String[] args) {
        File oldFile = new File("oldname.txt");
        File newFile = new File("newname.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
