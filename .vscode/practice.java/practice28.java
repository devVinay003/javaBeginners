import java.util.Scanner;

    public class practice28 {
        public static void main(String[]args){
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the month btwn (1-12)");
            int month = scanner.nextInt();
            String Season;
            switch (month)
            {

                case 12:
                case 1:
                case 2:
                Season = "Winter";
                break;
                case 3:
                case 4:
                case 05:
                Season = "spring";
                break;
                case 6:
                case 7:
                case 8:
                Season = "knau";
                break;
                case 9:
                case 10:
                case 11:
                break;
                default:
                Season = "Invalid month";
            }
            System.out.println("The season is : " + Season );


            }
        }
        



