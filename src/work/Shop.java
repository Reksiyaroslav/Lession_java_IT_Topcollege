package work;

import java.util.Arrays;

public class Shop {
    public  static  void  Show_product(Product[] products){
        for (int i = 0; i < products.length; i++) {
            products[i].Show();
        }
    }
    public  static  void total_sum_sovar(Product[] products){
        Callck callck = new Callck();
        System.out.println("Така сумма товаро вышла "+callck.toalt_sum(products));
    }
}
