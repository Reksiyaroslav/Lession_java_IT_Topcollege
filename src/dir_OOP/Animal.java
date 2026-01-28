package dir_OOP;

public   abstract class Animal {
    private  String name= "" ;
    private  Integer age = 1;
    protected Animal(String name ,Integer age){
        this.name = name;
        this.age = age;

    }
    public void soung(){
        System.out.println("hello Men or Women");
    }
    public  void Show_Info(){
        System.out.print("Name "+this.name+" Age "+this.age);
    }
}
