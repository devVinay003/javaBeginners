public class hello18{
    
    public static void main(String[] args) {
        class Person {
        private String name;
        private int age;
        
        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Copy Constructor
        public Person(Person otherPerson) {
            this.name = otherPerson.name;
            this.age = otherPerson.age;
        }
        
        // Getters and Setters
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
        
        @SuppressWarnings("unused")
        public static void main(String[] args) {
            // Creating a Person object using the constructor
            Person person1 = new Person("Alice", 30);
            
            // Creating a new Person object using the copy constructor
            Person person2 = new Person(person1);
            
            // Modifying person1
            person1.setName("Bob");
            person1.setAge(25);
            
            // Displaying information
            System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
            System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
        }
    }
}
}
