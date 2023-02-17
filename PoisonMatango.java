public class PoisonMatango extends Matango {
  private int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    //忘れそう
    super.attack(h);
    if(this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばら撒いた");
      int dmg = h.getHp() / 5;
      h.setHp(h.getHp() - dmg);
      System.out.println(dmg + "ポイントのダメージを与えた");
      this.poisonCount--;
    }
  }
}
