class animalssound {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class dog extends animalssound {
    void sound() {
        System.out.println("Barks");
    }
}
class cat extends animalssound {
    void sound() {
        System.out.println("Meows");
    }
}
public class animalsound {
    public static void main(String[] args) {
        animalssound animal = new animalssound();
        animal.sound();
        dog chimtu = new dog();
        chimtu.sound();        
        cat kitty = new cat();
        kitty.sound();
    }
}