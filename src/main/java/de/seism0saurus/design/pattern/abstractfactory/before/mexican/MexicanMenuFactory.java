package de.seism0saurus.design.pattern.abstractfactory.before.mexican;

public class MexicanMenuFactory {

    public NopalitosSalad getNopalitosSalad() {
        return new NopalitosSalad();
    }

    public Enchiladas getEnchiladas() {
        return new Enchiladas();
    }

    public OrangeBiscuits getOrangeBiscuits() {
        return new OrangeBiscuits();
    }
}
