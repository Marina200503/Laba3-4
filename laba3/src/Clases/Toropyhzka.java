package Clases;

import Enums.*;
import Enums.Places;


public class Toropyhzka extends Person {

    public Toropyhzka(String name, int force, int heaith){
        super(name, force, heaith);
    }

    public void Grabbed(Obj o, Person who){
        System.out.println(getName() + " схватил " + who.getName());
    }
}

