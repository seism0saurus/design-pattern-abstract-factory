package de.seism0saurus.design.pattern.abstractfactory.before.vegetarian;

public class VegetarianMenuFactory {

    public TomatoMozzarellaPesto getTomatoMozarellaPesto() {
        return new TomatoMozzarellaPesto();
    }

    public CeleryCutlet getCeleryCutlet() {
        return new CeleryCutlet();
    }

    public ChocolateLavaCake getChocolateLavaCake() {
        return new ChocolateLavaCake();
    }
}
