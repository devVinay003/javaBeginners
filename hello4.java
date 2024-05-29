import java.util.Scanner;
class dempl
{


    public static void main(String[] args)
        {
            String name;
            byte age; 
            int salary; 
            System.out.println("Enter name: ");
            @SuppressWarnings("resource")
            Scanner SC =new Scanner(System.in);
            name = SC.nextLine();
            System.out.println("Enter age:");
            age = SC.nextByte();
            System.out.println("Enter salery:");
            salary = SC.nextInt();
            System.out.println("name:" + name);
            System.out.println("Age:"+ age);
            System.out.println("Salery:" + salary);



            

    }
}