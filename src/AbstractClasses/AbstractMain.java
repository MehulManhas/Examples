package AbstractClasses;

public class AbstractMain {

    public void run(){
        Human human = new Human();
        System.out.println(human.numberOfLegs());
        System.out.println(human.walks());
        System.out.println(human.canSpeakALanguage());
        System.out.println(human.kindOfWork());

        Dog dog = new Dog();
        System.out.println(dog.numberOfLegs());
        System.out.println(dog.walks());
        System.out.println(dog.canSpeakALanguage());
        System.out.println(dog.kindOfWork());
    }
}
