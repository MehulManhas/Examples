package AbstractClasses;

import AbstractClasses.Features;

public class Dog extends Features implements Job{
    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean canSpeakALanguage() {
        return false;
    }

    @Override
    public String kindOfWork() {
        return "Does nothing but eats and poops";
    }
}
