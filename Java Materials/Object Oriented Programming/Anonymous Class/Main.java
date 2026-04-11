public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        
        // TalkingDog talkingDog = new TalkingDog();
        // talkingDog.speak();
        // // nstead of creating a whole new class for one thing, we can do the following
        
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");            
            }
        };

        dog1.speak();
        dog2.speak();
    }
}