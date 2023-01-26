import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

// Qns -->  Write a program to demonstrate File Handling in Java

/* File is an abstract data type, a named location used to store related information is known as a File.
 operation -->  create, read, write, delete */

/*  Stream -->  A series of data is referred to as a stream. -
    types -> Byte stream(byte data) and Character stream(character data)
*/

/* methods --> 
    1. boolean canRead() --> return true if readable
    2. boolean createNewFile() --> create new file and true if file successfully created
    3. 
 * 
 */

public class Csw27_File_Handling {
    public static void main(String[] args) {
        try {
            // 1. create a new file in this directory
            File f1 = new File(System.getProperty("user.dir") + "/sample.txt");

            if (f1.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File not created");
            }

            // 2. Get File Info
            if (f1.exists()) {
                // Getting file name
                System.out.println("The name of the file is: " + f1.getName());

                // Getting path of the file
                System.out.println("The absolute path of the file is: " + f1.getAbsolutePath());

                // Checking whether the file is writable or not
                System.out.println("Is file writeable?: " + f1.canWrite());

                // Checking whether the file is readable or not
                System.out.println("Is file readable " + f1.canRead());

                // Getting the length of the file in bytes
                System.out.println("The size of the file in bytes is: " + f1.length());
            } else {
                System.out.println("File not found");
            }

            // 3. Writing to the file
            FileWriter fileWriter = new FileWriter(f1);
            fileWriter.write("Hello from File Handling.");
            fileWriter.close();
            System.out.println("SuccessFully Written");

            // 4. Read from a file
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                System.out.println(dataReader.nextLine());
            }
            dataReader.close();

            // 5. Delete the File
            if (f1.delete()) {
                System.out.println("File SuccessFully Deleted");
            } else {
                System.out.println("File not deleted");
            }

        } catch (IOException e) {
            // err stream
            System.err.println(e);
        }
    }
}
