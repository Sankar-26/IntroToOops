public class Employee extends Person {

    public int employeeId;
    public int salary;

    public Employee() {
    }

    public Employee(int employeeId, int salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Using Super keyword to inherit Person attributes name in the Employee child class
    public Employee(String name, int employeeId, int salary) {
        super(name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Using Super keyword to inherit Person attributes name & age in the Employee child class
    public Employee(String name, int age, int employeeId, int salary) {
        super(name, age);
        if (age > 17) {
            this.employeeId = employeeId;
            this.salary = salary;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println(e1);

        Employee e2 = new Employee(102, 20000);
        System.out.println(e2);

        Employee e3 = new Employee("Peter", 105, 10000);
        System.out.println(e3);

        Employee e4 = new Employee("Shankar", 34, 406, 50000);
        if (e4.getAge() < 18) {

        } else {
            System.out.println(e4);

        }


    }
}
