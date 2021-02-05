package de.seism0saurus.design.pattern.abstractfactory.after;

public class Example {

    public static void main(String[] args) {
        MenuFactory menuFactory = AbstractMenuFactory.getFactory(Flavour.KOREAN);

        FirstCourse firstCourse = menuFactory.getFirstCourse();
        MainCourse mainCourse = menuFactory.getMainCourse();
        Dessert dessert = menuFactory.getDesert();

        System.out.println(firstCourse);
        System.out.println(mainCourse);
        System.out.println(dessert);
    }
}
