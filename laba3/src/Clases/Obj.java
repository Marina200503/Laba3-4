package Clases;

import Enums.*;

import java.util.ArrayList;
import Interfaces.*;
//методы для предметов (рубашки, шиворот, прибор)
public class Obj extends AbstractClass{
    public Obj(String name, Enum status) {
        super(name, status);
    }
    public void fall(Places where){
        System.out.println(getName() + " упал на "+ where);

    }
}
