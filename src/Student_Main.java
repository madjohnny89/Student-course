import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Student_Main {
    public static void main(String[] args) {
        char q;
        int index=0;
        List<Student_DataBase> list = new ArrayList<>();

        while (true){

            System.out.println("\nFor new student press Y to enroll or press N to exit\n");
            Scanner scanner =new Scanner(System.in);
            q=scanner.nextLine().charAt(0);
            System.out.println();
            if (q=='Y'){
                list.add(index,(new Student_DataBase()));
                index++;
            }
            else if (q=='N')
                System.exit(0);
            else
                System.out.println("Press Y or N only!");

        }
    }
}
