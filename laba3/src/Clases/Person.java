package Clases;

import Enums.*;

//Методы держать идти(рвануться) говорить видеть
public class Person extends AbstractClass {
    String[] inventar = new String[2];
    private int force;
    private int health;
    public Person(String name, int force, int health) {
        super(name);
        this.force = force;
        this.health = health;
        }

    public void Speak(State how, Phrase phrase) {
        if (how == State.LOUD) {
            System.out.println(getName() + " кричит " + Phrase.SHOUT);
        } else {
            System.out.println(getName() + " говорит " + Phrase.NONE);
        }
    }

    public void See(Obj what) {
        System.out.println(getName() + " увидели " + what.getName());
    }

    public void Go(StrenhthCharacteristic how) {
        if (how == StrenhthCharacteristic.FAST) {
            System.out.println(getName() + " рванулся " + how);
        } else {
            System.out.println(getName() + "идёт");
        }
    }

    public void setHealth(int health) {
        this.health = health;
        System.out.println("   Здоровье " + getName() + " изменилось на " + health);

    }
    public void setForce(int force) {
        this.force = force;
        System.out.println("   Сущность " + getName() + " наращивает силу " + force);
    }
    public int getForce() {
        return force;
    }
    public class Heir {
        private String name;
        private State_Heir stat;

        public Heir(String name, State_Heir stat) {
            this.name = name;
            this.stat = stat;
        }

        public void setStat(State_Heir stat) {
            System.out.println("   Установленно состояние объекта: " + name + " " + stat);
            this.stat = stat;
        }

        public State_Heir getStat(State_Heir stat) {
            return stat;
        }

        public String getName() {
            return name;
        }

    }


    public class Tears {
        public String name;
        public Feellings feell;

        public Tears(String name, Feellings feell) {
            this.name = name;
            this.feell = feell;
        }

        public void Flowed() {
            if (this.feell == Feellings.PAIN) {
                System.out.println("от боли у " + Person.this.getName() + " на щеках появились " + this.name);
            } else {
                System.out.println(Person.this.getName() + " так обрадовался, что заплакал");
            }

        }
    }
    public void setInventar(Obj o) throws InventarExeption {
       for (int i = 0; inventar.length > i; i++){
           if (inventar[i] == null){
               inventar[i] = o.getName();
               System.out.println("В инвентарь персонажа " + getName() + " добавлен предмет " + o.getName());
               break;
           }
           if (inventar[i] != null & inventar.length != i + 1){
               continue;
           }
            else {
                    throw new InventarExeption("весь инвентарь персонажа " + getName() + " заполнен");

                }

        }
    }
        public void deliteInventar (Obj o){
            for (int i = 0; i < inventar.length; i++) {
                if (inventar[i] == o.getName()) {
                    inventar[i] = null;
                    System.out.println("   Из инвентаря персонажа " + getName() + " удалён предмет: " + o.getName());
                }
            }
        }
    }