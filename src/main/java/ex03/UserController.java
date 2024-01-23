package ex03;

public class UserController {

    @RequestMapping(uri="/login")   // 어노테이션 표시
    public void login(){
        System.out.println("🔓Login");
    }

    @RequestMapping(uri="/join")
    public void join(){
        System.out.println("🙋‍♂️Sign up");
    }

    @RequestMapping(uri="/userinfo")
    public void userinfo (){
        System.out.println("🧙‍♂️User Info");
    }

    @RequestMapping(uri="/updatepassword")
    public void updatePassword (){
        System.out.println("🔒Password Updated");
    }

}
