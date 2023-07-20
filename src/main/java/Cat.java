import annotations.CustomAnnotationForAtribute;
import annotations.CustomAnnotationForClass;
import annotations.CustomAnnotationForConstructor;
import annotations.CustomAnnotationForMethod;

@CustomAnnotationForClass
public class Cat {

  @CustomAnnotationForAtribute
  private final String name;

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
