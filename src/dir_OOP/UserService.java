package dir_OOP;

import java.util.Date;


public class UserService extends Service {
    private static String model_user = "User";
    private Date date_on = new Date(2015,5,8);
    public  UserService(String session, String[] data_user,Date date_new){
        super(model_user,session,data_user);
        this.date_on = date_new;
    }
    @Override
    public  void print(){
        super.print();

        System.out.println("User online to date "+this.date_on);
    }
}
