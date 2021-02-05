package de.seism0saurus.design.pattern.abstractfactory.after.vegetarian;

import de.seism0saurus.design.pattern.abstractfactory.after.Dessert;
import de.seism0saurus.design.pattern.abstractfactory.after.FirstCourse;
import de.seism0saurus.design.pattern.abstractfactory.after.MainCourse;
import de.seism0saurus.design.pattern.abstractfactory.after.MenuFactory;

public class VegetarianMenuFactory implements MenuFactory {

    @Override
    public FirstCourse getFirstCourse() {
        return new TomatoMozzarellaPesto();
    }

    @Override
    public MainCourse getMainCourse() {
        return new CeleryCutlet();
    }

    @Override
    public Dessert getDesert() {
        return new ChocolateLavaCake();
    }
}
