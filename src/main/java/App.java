import annotations.CustomAnnotationForAttribute;
import annotations.CustomAnnotationForClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    //Annotations examples:
    @SuppressWarnings("unused")
    List<String> list = new ArrayList<>();

    //Custom annotations:
    Cat cat = new Cat("Stella");
    boolean isWithAnnotation = cat.getClass().isAnnotationPresent(CustomAnnotationForClass.class);
    System.out.println("This class contains annotation? " + isWithAnnotation);

    cat.meow();
    for (Method method : cat.getClass().getDeclaredMethods()) {
      System.out.println(method);
    }
    for(Field field : cat.getClass().getDeclaredFields()) {
      if(field.isAnnotationPresent(CustomAnnotationForAttribute.class)) {
        Annotation annotation = field.getAnnotation(CustomAnnotationForAttribute.class);
        System.out.println(annotation);
      }
    }
  }
}
