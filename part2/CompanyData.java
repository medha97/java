import java.util.*;

class Member{
    String name;
    int age;
    String phone_number;
    String address;
    int salary;

    Member(String name,int age,String phone_number, int salary, String address){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.salary = salary;
        this.address = address;
    }
    
}

class Employee extends Member{
    String specialiaztion;
    String department;
    Employee(String name,int age,String phone_number, int salary, String address, String specialiaztion, String department){
        super(name, age, phone_number, salary, address);
        this.specialiaztion = specialiaztion ;
        this.department = department;
    }
    protected void printDetail(){
        System.out.println(this.name+"\n"+this.age+"\n"+this.phone_number+"\n"+this.address+
        "\n"+this.salary+"\n"+this.specialiaztion+"\n"+this.department);
        System.out.println("****************************");
    }
}

class Manager extends Member{
    String specialiaztion;
    String department;
    Manager(String name,int age,String phone_number, int salary, String address, String specialiaztion, String department){
        super(name, age, phone_number, salary, address);
        this.specialiaztion = specialiaztion ;
        this.department = department;
    }
    protected void printDetail(){
        System.out.println(this.name+"\n"+this.age+"\n"+this.phone_number+"\n"+this.address+
        "\n"+this.salary+"\n"+this.specialiaztion+"\n"+this.department);
        System.out.println("****************************");
    }
}

public class CompanyData {
    public static void main(String[] args){
        Manager m = new Manager("manager1",23,"986237223", 2500, "sector 5", "abcs", "fghd");


        //Employee employee = new Employee("employee2", 56, 936833863, "sector34", 15000);
        Employee e = new Employee("manager1",23,"986237223", 2500, "sector 5","hfbue", "bsb");
        m.printDetail();
        e.printDetail();
    }
}
