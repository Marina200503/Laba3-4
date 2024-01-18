package Clases;

import Enums.*;
import Interfaces.*;

import java.util.ArrayList;

public abstract class AbstractClass implements WorkWithStatuses {
    private final String name;
    private Enum status;
    //конструктор для класса Obj
    public AbstractClass(String name, Enum status){
        this.name = name;
        this.status = status;
    }
    //конструктор для класса Person
    public AbstractClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void setStatus(Enum status) {
        System.out.println("   Установлено состояние объекта " + this.name + ": " + status);
        this.status = status;
    }
    @Override
    public Enum getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}