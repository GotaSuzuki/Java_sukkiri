public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Matango m1 = new Matango('A');
    PoisonMatango pm1 = new PoisonMatango('A');

    System.out.println(h1.name);
    System.out.println(h1.getHp());

    m1.attack(h1);
    System.out.println(h1.getHp());

    pm1.attack(h1);
    System.out.println(h1.getHp());
  }
}