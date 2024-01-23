package ex02;

import javax.sound.midi.Soundbank;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        String path = "/updatepassword";

        UserController con = new UserController();

        Method[] methods = con.getClass().getDeclaredMethods();
        System.out.println(methods.length);

        for (Method method : methods){
//            System.out.println(method.getName());
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if (rm == null) continue;       // RequestMapping 이 null일 때 continue

            if(rm.uri().equals(path)){
                try {
                    method.invoke(con);    //  == con.login();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
