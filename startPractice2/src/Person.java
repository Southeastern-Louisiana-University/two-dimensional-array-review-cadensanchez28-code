import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Person Exercise");
        Person person = new Person();
        person.getAge();
        System.out.println("Age is: " + person.getAge());
        System.out.println("Please enter your Age: ");
        int userage = scanner.nextInt();
        person.setAge(userage);
        System.out.println("Age is: " + person.getAge());
        person.getName();
        scanner.nextLine();
        System.out.println("Name is: " + person.getName());
        System.out.println("Please enter your Name: ");
        String userName = scanner.nextLine();
        person.setName(userName);
        System.out.println("Name is: " + person.getName());


    }

    public void Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
}
