import annotations.CustomAnnotationForAttribute;
import annotations.CustomAnnotationForClass;
import annotations.CustomAnnotationForConstructor;
import annotations.CustomAnnotationForMethod;

@CustomAnnotationForClass
public class Cat {

  private final String name;

  @CustomAnnotationForAttribute(age = 1)
  int age;

  @CustomAnnotationForConstructor
  public Cat(String name) {
    this.name = name;
  }

  @CustomAnnotationForMethod
  public void meow() {
    System.out.println("Meow!");
  }

  public void eat() {
    System.out.println("Munch");
  }
}
