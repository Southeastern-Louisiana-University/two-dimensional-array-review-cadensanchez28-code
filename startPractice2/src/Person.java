public class Person {
    private String name;
    private int age;
    public static void main(String[] args){
        System.out.println("Hello Person Exercise");
        Person person = new Person();
        person.getAge();
        System.out.println("Age is: " + person.getAge());
        person.setAge(10);
        System.out.println("Age is: " + person.getAge());
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
}
