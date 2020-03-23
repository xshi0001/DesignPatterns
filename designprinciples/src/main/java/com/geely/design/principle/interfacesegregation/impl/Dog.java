package com.geely.design.principle.interfacesegregation.impl;

import com.geely.design.principle.interfacesegregation.IEatAnimalAction;
import com.geely.design.principle.interfacesegregation.ISwimAnimalAction;

/**
 * Created by geely
 */
public class Dog implements ISwimAnimalAction, IEatAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
