public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You have started a " + this.type + " engine!");
    }
    
}
