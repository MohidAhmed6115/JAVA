public class Varargs {
    public static void main(String[] args) {
        int result = add(1, 4, 2);
        System.out.println("Result: " + result);
    }
    // ... are called ellipses
    static int add(int... numbers)
    {
        int result = 0;
        for(int i = 0; i < numbers.length; i++)
            result += numbers[i];
        return result;
    }
}