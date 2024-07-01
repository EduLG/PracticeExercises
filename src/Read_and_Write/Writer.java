package Read_and_Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {


    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file.dat"));
            for(int i=0; i<=100; i++){
                if (newLine(i)){
                    bw.write(i);
                    System.out.println(i+"\n");
                }
            }
            bw.close();
        }catch(IOException e){
            System.out.println("File could not be created");
        }
    }

    public static boolean newLine(int x){
        for(int i=2;i<=100; i++) {
            if (x % Math.sqrt(i) == 0) {
                return false;
            }
        }
        return true;
    }
}


//package Read_and_Write;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//
//public class Writer {
//
//
//    public static void main(String[] args) {
//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
//            for (int i = 0; i <= 100; i++) {
//                if (justPairs(i)) {
//                    bw.write(i + "\n");
//                    System.out.println(i);
//                }
//            }
//            bw.close();
//        }catch (IOException ioe){
//            System.out.println("File couldn't be created of wtv...");
//        }
//    }
//
//    public static boolean justPairs(int x){
//
//        if( x % 2 != 0 ){
//            return false;
//        }
//        return true;
//    }
//
//}