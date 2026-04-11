public class Main {
    public static void main(String[] args) {
        
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());
        
        Product<String, Double> product = new Product<>("banana", 19.9);
        System.out.println(product.getItem() + " & " + product.getPrice());
    }
}