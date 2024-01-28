package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    nakresliPrasatko(); /*začátek prasátko*/
    zofka.turnRight(90);
    zofka.move(180);
    zofka.turnLeft(90);
    zofka.move(60);
    nakresliDomecek(); /*začátek domeček vpravo*/
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(90);
    for (int i = 0; i < 5; i++) { /*cyklus domečky nahoře*/
      nakresliDomecek();
      zofka.move(50);
      zofka.turnRight(90);
    }
    zofka.turnRight(30); /*začátek sluníčko*/
    zofka.move(130);
    nakresliSlunicko();
    zofka.turnRight(147);
    zofka.move(250);
    zofka.turnRight(180);
    nakresliDomecek();
  }

  public void nakresliDomecek() {
    zofka.penDown();
    zofka.turnRight(180);
    for (int i = 0; i < 2; i++) {
      zofka.move(60);
      zofka.turnRight(90);
      zofka.move(50);
      zofka.turnRight(90);
    }
    zofka.turnLeft(215);
    zofka.move(50);
    zofka.turnLeft(117);
    zofka.move(50);
    zofka.turnRight(62);
    zofka.penUp();
  }

  public void nakresliPrasatko() {
    zofka.turnLeft(90);
    nakresliDomecek();
    zofka.turnRight(45);
    nakresliNozicky();
    zofka.turnRight(135);
    zofka.move(50);
    zofka.turnRight(135);
    nakresliNozicky();
    zofka.turnRight(45);
    zofka.penUp();
  }

  public void nakresliNozicky() {
    zofka.penDown();
    zofka.move(15);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(15);
    zofka.turnRight(90);
    zofka.penDown();
    zofka.move(15);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(15);
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
    for (int i = 0; i < 144; i++) {
      zofka.turnRight(2.5);
      zofka.move(1);
    }
    zofka.penUp();
  }
  public void nakresliSlunicko() {
    nakresliKolecko();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(22.91899);
    zofka.turnLeft(90);
    for (int i = 0; i < 12; i++) {
    zofka.move(22.91899);
    zofka.penDown();
    zofka.move(10);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(32.91899);
    zofka.turnRight(30);
    zofka.penUp();
    }
  }
}