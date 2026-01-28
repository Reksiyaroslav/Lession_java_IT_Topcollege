package dir_OOP;

import java.util.Arrays;
import java.util.Map;

public abstract class Service {
    private String model_filed;
    private  String session = "";
    private String[] data_type_model;
    protected Service(String model_filed, String session, String[]  data){
        this.model_filed = model_filed;
        this.session = session;
        this.data_type_model  = data;
    }
    public void print(){
        System.out.println("name model "+model_filed+" "+session);
        for(String item : data_type_model)
        {

            System.out.println(item);
        }
    }

    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским
}
