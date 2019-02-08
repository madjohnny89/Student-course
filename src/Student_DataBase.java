import javax.swing.*;

public class Student_DataBase {
    private String name;
    private int year;
    private static int id= 1000;
    private String course = "";
    private static int fee = 600;
    private int balance;
   private  int count=0;

    public Student_DataBase (){
        this.name= JOptionPane.showInputDialog("Enter your name");
        this.year= Integer.parseInt(JOptionPane.showInputDialog("Which year are you in?(1-4)"));
        this.balance=Integer.parseInt(JOptionPane.showInputDialog("Enter your balance"));
        getCourse();
        display();

    }
    private void getCourse(){

        String q=null;
        String p = "q";
        JOptionPane.showMessageDialog(null,"Start entering your courses,press q to stop\n" +
                "Available courses are-\nHistory 101\n" +
                "Mathematics 101\n" +
                "English 101\n" +
                "Chemistry 101\n" +
                "Computer Science 101");
        while (!p.equals(q)){
            q=JOptionPane.showInputDialog("");
            if (!p.equals(q)) {
                course = course + "\n" + q;
                count++;
            }

        }
    }
    private void display(){
        System.out.println("Hello "+name+"\nYour ID : "+id+" Your prefered course\\courses are "+course+"\nYour balance is "+balance+"$"+
                "\nYour total tuition fee is "+count*fee);
        id++;
    }


}
