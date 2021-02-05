package de.seism0saurus.design.pattern.abstractfactory.after;

public interface MenuFactory {

    FirstCourse getFirstCourse();

    MainCourse getMainCourse();

    Dessert getDesert();
}
