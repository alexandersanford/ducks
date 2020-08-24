public abstract class Duck {

  public abstract void display();

  public abstract void quack();
  
  public void fly() {
	  System.out.println("Duck has learned to fly!");
  }

  public void swim() {
    System.out.println("Duck swam (all ducks float)");
  }
}
