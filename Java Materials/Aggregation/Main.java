public class Main {
    public static void main(String[] args) {
        // It is has-a relationship
        Book book1 = new Book("The Silent Patient", 453);
        Book book2 = new Book("One of us is Lying", 537);
        Book book3 = new Book("As Good As Dead", 253);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}