package dir_OOP;

public class Employee extends  People {
    private  String company= "Apple";
    private  Integer salary = 20000;
    public  Employee(String name,Integer age,String company,Integer salary){
        super(name, age);
        this.company = company;
        this.salary = salary;
    }
    public  Employee(String name,Integer age,Integer salary){
        super(name, age);
        this.salary = salary;
    }
    @Override
    public  void Show(){
        super.Show();
        System.out.println("Company " + this.company+" "+this.salary);
    }


    public boolean checkNomal_salary(Integer salary) {
        return salary >=salary?true:false;
    }
}
