package ex03;

//  class 위에 붙이고 runtime 때

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Controller {
}
