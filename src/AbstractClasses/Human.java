package AbstractClasses;

public class Human extends Features implements Job{
    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public boolean canSpeakALanguage() {
        return true;
    }

    @Override
    public String kindOfWork() {
        return "Goes to office and hates his manager :)";
    }
}
