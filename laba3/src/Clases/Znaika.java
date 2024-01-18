package Clases;


import Enums.Feellings;
import Enums.Statuses;
import Enums.StrenhthCharacteristic;
public class Znaika extends Person {

    public Znaika(String name, int force, int health) {
        super(name,force,health);
    }

    public void Desire_to_Pull(Person who,Person.Heir what, Feellings wich) {
        if (wich == Feellings.WELL_BIING) {
            System.out.println(getName() + " дёрнул " + " за " + what.getName() + " " + who.getName() + StrenhthCharacteristic.FAST);
            who.setHealth(90);
        }

        else {
            System.out.println(getName() + " перестал тянуть " + who.getName() + " " + what.getName());
            who.setStatus(Statuses.FREE);
        }
    }



    //статический класс
    public void Wants_to_kik(Person who) {
        System.out.println(getName() + " пытается лягнуть " + who.getName());
        try {
            Kik.Kiking();
        }
        catch (KIkingExeption e){
            System.out.println(getName() + e.getMessage());
        }

    }
        private static class Kik{
            public static void Kiking() throws KIkingExeption{
                int luck = (int)(Math.random()*10 + 1);
                if (Math.random() < 0.01) {
                    throw new KIkingExeption("Невозможный день. Удар не получится. Math.random() выдал неудобное значение");
                }
                for (int i = 0; i < luck; i++){
                    Do_kik();
                    if (i == 0){
                        break;
                    }
                }
            }
    }
            public static void Do_kik(){
                System.out.println("Везучий день. Удар получился.");
            }
}
