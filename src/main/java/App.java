import annotations.CustomAnnotationForClass;

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
  }
}
