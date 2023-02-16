package calcapp.main;

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a,b);
    int hiku = calcapp.logics.CalcLogic.hiku(a,b);
    System.out.println(total+" " +hiku);
  }
}
