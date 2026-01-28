package dir_OOP;

public  abstract  class People {
    private String name ="";
    private  Integer age = 1;
   protected  People(String name , Integer age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
    public  void Show(){
        System.out.println("Name "+this.name+"\n"+"Age "+this.age);
    }

    public abstract boolean checkNomal_salary(Integer salary) ;
}
