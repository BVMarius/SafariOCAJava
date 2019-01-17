package casting;

class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}
class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

class Other extends Base {}

public class Ex1 {
  public static void doStuff(Base b) {
    b.doBaseStuff();
    ((Sub)b).doOtherStuff();
  }

  public static void main(String[] args) {
    Base b = new Sub();
    doStuff(b);
//    b.doBaseStuff();
//    ((Sub)b).doOtherStuff();

    Sub s = null/*new Other()*/;
    Other other = (Other)s;
  }
}
