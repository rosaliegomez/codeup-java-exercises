public class Person {

    private String firstName;
    public Person(String aFirstName)

    {
        this.firstName = aFirstName;

    }
    public  Person(Person person){
        this.firstName = person.firstName;
    }

    public String getName() {
        return firstName;
    }
    public void setName(String name) {
        this.firstName = name;
    }

    public void sayHello(){
        System.out.println(this.firstName + " " + "says hello");
    }

    public static void main(String[] args) {
        Person person = new Person("Rosalie");
        System.out.println(person.getName() );
        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
    }

}
