class Employee{
    int salary;
    public static int CalculateSalary(int salary){

        return salary;
    }
}
class manager extends Employee{
    int incentives;
    public static int CalculateSalary(int salary,int incentives){

        return salary+incentives;
    }
}
class Labour extends Employee{
    int overTime;
    public static int CalculateSalary(int salary ,int overTime){

        return salary+overTime*200;
    }
}

public class Hierarchy {

    public static void main(String[] args) {
        manager e1=new manager();
        Labour e2=new Labour();
        System.out.println(e1.CalculateSalary(350000,10000));
        System.out.println(e2.CalculateSalary(25000,2));

    }


}
