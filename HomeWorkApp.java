public class HomeWorkApp {

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Bob", "tester", "bob.tester@gmail.com", 50, 1234567, 1200.78);
        emplArray[1] = new Employee("Jef", "tester", "jef.tester@gmail.com", 38, 2234567, 1300.81);
        emplArray[2] = new Employee("Loren", "tester", "loren.tester@gmail.com", 25, 7434567, 1600.44);
        emplArray[3] = new Employee("Mudet", "tester", "mudet.tester@gmail.com", 43, 4528567, 1665.12);
        emplArray[4] = new Employee("Jon", "tester", "bob.tester@gmail.com", 31, 5304561, 1400.45);
        for (int i=0; i <5; i++){
            if(emplArray[i].getAge() >= 40) {
                System.out.println(emplArray[i]);
            }
        }
    }
}

class Employee{
    private String name;
    private String jobTitle;
    private String email;
    private int age;
    private int phone;
    private double salary;

    public Employee(String name, String jobTitle, String email, int age, int phone, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", salary=" + salary +
                '}';
    }
}

