package de.seism0saurus.design.pattern.abstractfactory.before;

import de.seism0saurus.design.pattern.abstractfactory.before.korean.HoneyCakeFromRice;
import de.seism0saurus.design.pattern.abstractfactory.before.korean.KoreanMenuFactory;
import de.seism0saurus.design.pattern.abstractfactory.before.korean.KoreanSpringRoll;
import de.seism0saurus.design.pattern.abstractfactory.before.korean.TofuWithVegetables;
import de.seism0saurus.design.pattern.abstractfactory.before.mexican.Enchiladas;
import de.seism0saurus.design.pattern.abstractfactory.before.mexican.MexicanMenuFactory;
import de.seism0saurus.design.pattern.abstractfactory.before.mexican.NopalitosSalad;
import de.seism0saurus.design.pattern.abstractfactory.before.mexican.OrangeBiscuits;
import de.seism0saurus.design.pattern.abstractfactory.before.vegetarian.CeleryCutlet;
import de.seism0saurus.design.pattern.abstractfactory.before.vegetarian.ChocolateLavaCake;
import de.seism0saurus.design.pattern.abstractfactory.before.vegetarian.TomatoMozzarellaPesto;
import de.seism0saurus.design.pattern.abstractfactory.before.vegetarian.VegetarianMenuFactory;

public class Example {

    public static void main(String[] args) {
        String flavour = "korean";

        switch (flavour) {
            case "vegetarian" -> {
                VegetarianMenuFactory vegetarianMenuFactory = new VegetarianMenuFactory();
                TomatoMozzarellaPesto tomatoMozarellaPesto = vegetarianMenuFactory.getTomatoMozarellaPesto();
                CeleryCutlet celeryCutlet = vegetarianMenuFactory.getCeleryCutlet();
                ChocolateLavaCake chocolateLavaCake = vegetarianMenuFactory.getChocolateLavaCake();
                System.out.println("First course: " + tomatoMozarellaPesto);
                System.out.println("Main course: " + celeryCutlet);
                System.out.println("Desert: " + chocolateLavaCake);
            }
            case "mexican" -> {
                MexicanMenuFactory mexicanMenuFactory = new MexicanMenuFactory();
                NopalitosSalad nopalitosSalad = mexicanMenuFactory.getNopalitosSalad();
                Enchiladas enchiladas = mexicanMenuFactory.getEnchiladas();
                OrangeBiscuits orangeBiscuits = mexicanMenuFactory.getOrangeBiscuits();
                System.out.println("First course: " + nopalitosSalad);
                System.out.println("Main course: " + enchiladas);
                System.out.println("Desert: " + orangeBiscuits);
            }
            case "korean" -> {
                KoreanMenuFactory koreanMenuFactory = new KoreanMenuFactory();
                KoreanSpringRoll koreanSpringRoll = koreanMenuFactory.getKoreanSpringRoll();
                TofuWithVegetables tofuWithVegetables = koreanMenuFactory.getTofuWithVegetables();
                HoneyCakeFromRice honeyCakeFromRice = koreanMenuFactory.getHoneyCakeFromRice();
                System.out.println("First course: " + koreanSpringRoll);
                System.out.println("Main course: " + tofuWithVegetables);
                System.out.println("Desert: " + honeyCakeFromRice);
            }
        }
    }
}
