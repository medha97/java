

class Member{
    String name;
    short age;
    String phone_number;
    String address;
    int salary;

    String specialiaztion;
    String department;
    protected void printDetail(){
        System.out.println(this.name+"\n"+this.age+"\n"+this.phone_number+"\n"+this.address+
        "\n"+this.salary+"\n"+this.specialiaztion+"\n"+this.department);
        System.out.println("****************************");
    }
}

class Employee extends Member{
    Employee(){
        super.specialiaztion = "Human Resources";
        super.department = "HR Departent";
    }
}

class Manager extends Member{
    Manager(){
        super.specialiaztion = "Human Resources";
        super.department = "HR Departent";
    }
}

public class CompanyData {
    public static void main(String[] args){
        Manager m = new Manager();
        m.name = "manager1";
        m.age = 23;
        m.phone_number = "986237223";
        m.salary = 2500;
        m.address = "sector 5";
        m.printDetail();

        //Employee employee = new Employee("employee2", 56, 936833863, "sector34", 15000);
        Employee e = new Employee();
        e.name = "employee1";
        e.age = 45;
        e.phone_number = "8368732353";
        e.salary = 45000;
        e.address = "sector37";
        e.printDetail();
    }
}
