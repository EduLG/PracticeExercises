package Library;

import java.io.IOException;
import java.lang.reflect.Member;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;


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
            BufferedWriter br = new BufferedWriter(new FileWriter("Register.txt, true"));
            br.write(member.getNumber() + FIELD_SEPARATOR + member.getName() + FIELD_SEPARATOR + member.getAdress() + FIELD_SEPARATOR);
        }catch (IOException e){
            System.out.println("Couldn't register.");
        }

    }

}
