package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    nakresliOsmiuhelnik();
    zofka.move(130);
    nakresliKolecko();
    zofka.move(150);
    nakresliSlunicko();
  }

  public void nakresliDomecek() {
    zofka.penDown();
    zofka.turnRight(180);
    for (int i = 0; i < 2; i++) {
      zofka.move(150);
      zofka.turnRight(90);
      zofka.move(100);
      zofka.turnRight(90);
    }
    zofka.turnLeft(215);
    zofka.move(100);
    zofka.turnLeft(117);
    zofka.move(100);
    zofka.turnRight(62);
  }

  public void nakresliPrasatko() {
    zofka.turnLeft(90);
    nakresliDomecek();
    zofka.turnRight(45);
    nakresliNozicky();
    zofka.turnRight(135);
    zofka.move(145);
    zofka.turnRight(135);
    nakresliNozicky();
    zofka.turnRight(45);
  }

  public void nakresliNozicky() {
    zofka.penDown();
    zofka.move(30);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(30);
    zofka.turnRight(90);
    zofka.penDown();
    zofka.move(30);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(30);
    zofka.penUp();
  }

  public void nakresliOsmiuhelnik() {
    for (int i = 0; i < 8; i++) {
      zofka.turnRight(45);
      zofka.move(30);
    }
    zofka.penUp();
  }

  public void nakresliKolecko() {
    zofka.penDown();
    for (int i = 0; i < 72; i++) {
      zofka.turnRight(5);
      zofka.move(5);
    }
    zofka.penUp();
  }

  public void nakresliSlunicko() {
    nakresliKolecko();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(57.297);
    zofka.turnLeft(90);
    for (int i = 0; i < 12; i++) {
    zofka.move(57.297);
    zofka.penDown();
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(77.297);
    zofka.turnRight(30);
    }
  }
}