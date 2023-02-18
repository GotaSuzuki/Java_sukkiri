public class Main {
  public static void main(String[] args) {
    Book b1 = new Book("C言語", 2000, "red", "0478");
    System.out.println(b1.getName());
    System.out.println(b1.getIsbn());
    b1.setWeight(15.8);
    System.out.println(b1.getWeight());
  }
}