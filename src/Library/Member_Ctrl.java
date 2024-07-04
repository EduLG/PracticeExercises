package Library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Member_Ctrl {

    private static final String FILE_NAME = "members.txt";
    private static final String FIELD_SEPARATOR = ";";
    private static final String REG_SEPARATOR = "\n";

    public static void requestDataToReg() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid member ID.");
        String number = sc.nextLine();
        System.out.println("Enter a valid user name.");
        String name = sc.nextLine();
        System.out.println("Enter your adress.");
        String adress = sc.nextLine();
        Member_Ctrl.register(new Member(number, name, adress));
        System.out.println("The registration has been saved succesfully.");
    }

    public static void register(Member member) {

        try{
            BufferedWriter br = new BufferedWriter(new FileWriter("Register.txt", true));
            br.write(member.getNumber() + FIELD_SEPARATOR + member.getName() + FIELD_SEPARATOR + member.getAdress() + FIELD_SEPARATOR);
        }catch (IOException e){
            System.out.println("Couldn't register.");
        }

    }

    public static ArrayList<Member> get() {
        ArrayList<Member> members = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(FILE_NAME);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] socioComoArreglo = linea.split(FIELD_SEPARATOR);
                members.add(new Member(socioComoArreglo[0], socioComoArreglo[1], socioComoArreglo[2]));
            }
        }catch (IOException e) {
            System.out.println("Couldn't read file : " + e.getMessage());
        }finally{
            try{
                if (fr != null){
                    fr.close();
                }
                if (br != null){
                    br.close();
                }
            }catch (IOException finalExc){

            }
        }
        return members;
    }



}
