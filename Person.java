public class Person {

    //Properties Declaration
    public String name;
    public int age;

    //Default Constructor
    public Person() {
    }

    //Parametrized Constructor with name and default age as 18
    public Person(String name) {
        this(name, 18);
    }

    //Parametrized Constructor with name and age
    public Person(String name, int age) {

        //condition to set the default age t0 18
        if (age < 18) {
            System.out.println("Age should be minimum 18");
        } else {
            this.name = name;
            this.age = age;
        }
    }

    //Getter and Setter Method initialization
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
        if (age < 18) {
            System.out.println("Age should be minimum 18");
        } else {
            this.age = age;
        }
    }

    //toString method to display the values
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        //initializing the person object with name and age
        Person p1 = new Person("Shankar", 27);
        Person p2 = new Person("Vihaan");

        //Using Getter method to display the properties
        System.out.println("Person{name='" + p1.getName() + "', age=" + p1.getAge() + "}");

        //Using toString method to display the properties
        System.out.println(p2);


        Person p3 = new Person("Pete", 5);
        if (p3.getAge() < 18) {

        } else {
            System.out.println(p3);
        }


    }
}
