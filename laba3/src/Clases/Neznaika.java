package Clases;

import Enums.*;

public class Neznaika extends Person {
    public Neznaika(String name, int force, int heaith) {
        super(name, force, heaith);

    }

    public void Breakout(Person who) {
        System.out.println(getName() + " вырвается из " + Places.HANDS + " " + who.getName());
        setStatus(Statuses.FREE);
    }

    public void Sneak_Away(Obj o) {
        System.out.println(getName() + " выскользнул из " + o.getName());
        deliteInventar(o);
    }

    public void Fly(Person who) {
        System.out.println(getName() + " как петух налетел на " + who.getName());
        who.setHealth(90);
    }



    //локальный класс кулак
    public void Punch(Person whom, StrenhthCharacteristic how) {
        class Fist {
            private final String name;

            Fist(String name) {
                this.name = name;
            }

            public void Hit() {
                if (how == StrenhthCharacteristic.FAST) {
                    System.out.println(Neznaika.this.getName() + " " + name + " ударяет " + whom.getName());
                    whom.setStatus(Feellings.PAIN);

                    whom.setHealth(90);
                } else {
                    System.out.println(Neznaika.this.getName() + " " + name + " ударяет " + whom.getName());
                }


            }
        }
        Fist fist = new Fist("кулак");
        fist.Hit();

        //локальный класс лёгкие
        class Lungs {
            private final String name;

            Lungs(String name) {
                this.name = name;
            }

            public void Stopped_breathing() {
                if (whom.getStatus() == Feellings.PAIN) {
                    System.out.println(whom.getName() + " перехватило дыхание");
                } else {
                    System.out.println(whom.getName() + " дышит глубоко");
                }
            }
        }
        Lungs lungs = new Lungs("лёгкие");
        lungs.Stopped_breathing();
    }
}

