package work;

import java.lang.reflect.Array;

public class Callck {
    private  Double toalt_count_amonut_tovar  = 2.00;
    public  Double toalt_sum(Product[] productArray){
        for (int i = 0; i < productArray.length ; i++) {
            if (checkCount(productArray[i].getCount())  && checkAmount(productArray[i].getAmount()))
            {
                this.toalt_count_amonut_tovar = productArray[i].getCount() *productArray[i].getAmount();
            }else{
                this.toalt_count_amonut_tovar = 0.0;
            }

        }
        return  this.toalt_count_amonut_tovar;

    }
    private boolean checkCount(Double count){
        return  count > 0.0;
    }
    private boolean checkAmount(Double amount){
        return  amount > 0.0;
    }
}
