package ex01;

public class App {
    public static void main(String[] args) {
        String path = "/login";

        UserController con = new UserController();

        // login이냐 join이냐
        if(path.equals("/login")){
            con.login();
        }else if(path.equals("/join")){
            con.join();
        }
    }
}
