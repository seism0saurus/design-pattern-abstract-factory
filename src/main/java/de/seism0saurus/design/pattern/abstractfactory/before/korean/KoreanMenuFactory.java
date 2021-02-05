package de.seism0saurus.design.pattern.abstractfactory.before.korean;

public class KoreanMenuFactory {

    public KoreanSpringRoll getKoreanSpringRoll() {
        return new KoreanSpringRoll();
    }

    public TofuWithVegetables getTofuWithVegetables() {
        return new TofuWithVegetables();
    }

    public HoneyCakeFromRice getHoneyCakeFromRice() {
        return new HoneyCakeFromRice();
    }
}
