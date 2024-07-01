package Read_and_Write;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 3. Write a program that saves the content of two other files into a new file,
 *    such that the lines in the resulting file are interleaved. That is, the first
 *    line will be from the first file, the second line will be from the second file,
 *    the third line will be the next line from the first file, and so on.
 *    The names of the two source files and the name of the destination file should
 *    be passed as command-line arguments.
 *    It should be noted that the source files may have different sizes.
 */



public class Read_n_Write {

    public static void main(String[] args){
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("File_1.dat"));
            BufferedReader br2 = new BufferedReader(new FileReader("File_2.dat"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("File_3.dat"));

            String line1 = br1.readLine();
            String line2 = br2.readLine();

            while(line1 != null || line2 !=null){

                if(line1 != null) {
                    bw1.write(line1 + "\n");
                    line1 = br1.readLine();
                }

                if(line2 != null) {
                    bw1.write(line2 + "\n");
                    line2 = br2.readLine();
                }

            }
            br1.close();
            br2.close();
            bw1.close();

        }catch (IOException ioe){
            System.out.println("Couldn't do de job. Something happened.");
            System.err.println(ioe.getMessage());
        }
    }

}

