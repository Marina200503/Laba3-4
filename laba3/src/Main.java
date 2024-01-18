import Clases.*;
import Enums.*;
import Interfaces.Separating;


public class Main {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika("Незнайка", 0, 100);
        Znaika znaika = new Znaika("Знайка", 0, 100);
        Obj device = new Obj("прибор невесомcоти", Places.ARMPIT);
        Obj shirt = new Obj("рубашка", Places.ON_THE_PRRSON);
        Obj shivorot = new Obj("шиворот", Places.ON_THE_PRRSON);
        Person all = new Person("все",0, 100);
        Toropyhzka toropyhzka = new Toropyhzka("торопыжка", 0, 100);
        neznaika.setInventar(shirt);
        neznaika.setInventar(device);

        Person.Heir hair = neznaika.new Heir("волосы", State_Heir.IN_HAND);
        znaika.Desire_to_Pull(neznaika, hair, Feellings.WELL_BIING);

        Neznaika.Tears tears = neznaika.new Tears("слёзы", Feellings.PAIN);
        tears.Flowed();

        neznaika.Punch(znaika, StrenhthCharacteristic.FAST);

        znaika.Desire_to_Pull(neznaika, hair, Feellings.PAIN);
        hair.setStat(State_Heir.ON_THE_HEAD);



        neznaika.Fly(znaika);
        Separating korotyhzka = new Separating() {
            @Override
            public void Eunbeatabl(Person who, Person who2, int power) {
                if (who.getForce() <= power & who2.getForce() <= power) {
                    System.out.println("Коротыжки начинают разнимать " + who.getName()+ " и " + who2.getName());
                    who.setStatus(Statuses.HOLD);
                    who2.setStatus(Statuses.HOLD);
                    who.setForce(15);
                    who2.setForce(15);

                }
                else{
                    System.out.println(who.getName() + " вырывается из рук Коротыжек");
                    who.setStatus(Statuses.FREE);
                    who.Speak(State.LOUD, Phrase.SHOUT);
                    System.out.println(who2.getName() + " вырывается из рук Коротыжек");
                    who2.setStatus(Statuses.FREE);
                    who2.Speak(State.LOUD, Phrase.SHOUT);
                }
            }
        };
        korotyhzka.Eunbeatabl(neznaika, znaika,10);
        znaika.Wants_to_kik(neznaika);


        korotyhzka.Eunbeatabl(neznaika, znaika, 10);



        toropyhzka.Grabbed(shivorot, neznaika);

        neznaika.Go(StrenhthCharacteristic.FAST);
        neznaika.Sneak_Away(shirt);
        neznaika.deliteInventar(shirt);
        device.fall(Places.FALLEN_IN_THE_ERTH);
        neznaika.deliteInventar(device);


        device.setStatus(Places.FALLEN_IN_THE_ERTH);
        all.See(device);
    }
}