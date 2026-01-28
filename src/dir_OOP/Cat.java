package dir_OOP;

public  class Cat extends  Animal {
    private  String clik = "Meon";
    public Cat(String name , Integer age, String clik){
        super(name,age);
        this.clik = clik;
    }
    public Cat(String name , Integer age){
        super(name,age);

    }
    @Override
    public  void soung(){
        super.Show_Info();
        System.out.println(" Meon\n soung cat name "+this.clik);
    }

}
