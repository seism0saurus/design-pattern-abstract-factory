package de.seism0saurus.design.pattern.abstractfactory.after;

import de.seism0saurus.design.pattern.abstractfactory.after.korean.KoreanMenuFactory;
import de.seism0saurus.design.pattern.abstractfactory.after.mexican.MexicanMenuFactory;
import de.seism0saurus.design.pattern.abstractfactory.after.vegetarian.VegetarianMenuFactory;

public abstract class AbstractMenuFactory {

    public static MenuFactory getFactory(Flavour flavour) {
        return switch (flavour) {
            case VEGETARIAN -> new VegetarianMenuFactory();
            case MEXICAN -> new MexicanMenuFactory();
            case KOREAN -> new KoreanMenuFactory();
        };
    }
}
