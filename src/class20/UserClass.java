package class20;

public class UserClass {
    String name;
    String mobileNo;
    UserClass(String name, String mobileNo){
        this.name=name;
        this.mobileNo=mobileNo;
    }
    }
     class UserInfo extends UserClass{
    String userAdd;
    UserInfo(String name, String mobileNo, String userAdd){
        super(name, mobileNo);
        this.userAdd=userAdd;

    }
    void userDetails(){
        System.out.println("User name "+name+" mobile no "+mobileNo+" address "+ userAdd);
    }
}

