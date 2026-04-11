public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Mohid");
        Friend friend2 = new Friend("Umair");
        Friend friend3 = new Friend("Ameer");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}