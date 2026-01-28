package work;

public class Product {
    private  String name_product = "Apple";
    private  String  type_product = "";
    private  Double count = 1.5;
    private  Double amount  = 2000.0;
    Product(){};
    public Product(String name_product,Double count, Double amout){
        this.name_product = name_product;
        this.count = count;
        this.amount = amout;
    }
    public Product(String name_product,String type_string ,Double count, Double amout){
        this.type_product = type_string;
        this.name_product = name_product;
        this.count = count;
        this.amount = amout;
    }

    public Double getCount() {
        return count;
    }

    public Double getAmount() {
        return amount;
    }

    public  void Show(){
        System.out.print("Name "+ this.name_product+"\nType_product "
                +this.type_product+"\nCount_product "+this.count
                +"\nAmount "+this.amount+"\n");
    }
}
