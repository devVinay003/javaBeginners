import java.util.Arrays;
public class main {


    public static void main(Sting[]args){
        int age = 39;
        int phy = 30;
        int chem= 40;
        int eng= 10;
         
        int[] marks = new int[3];
        marks[0]=30;
        marks[1]=40;
        marks[2]=10;


        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[2]);

        }
    }