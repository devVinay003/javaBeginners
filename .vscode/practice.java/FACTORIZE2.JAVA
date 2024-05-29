public class StaticExample {
    static int count = 0;

    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
    
        System.out.println("Initial count: " + count);

    
        incrementCount();
        System.out.println("Count after increment: " + count);

   
        incrementCount();
        System.out.println("Count after another increment: " + count);
    }
}