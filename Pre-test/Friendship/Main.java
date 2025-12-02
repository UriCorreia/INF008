public class Main {
    public static void main(String[] args) {
        
        User u1 = new User("Uriel", "uriel@test.com", "2000-12-02");
        User u2 = new User("Alice", "alice@test.com", "1995-05-20");
        User u3 = new User("Bob", "bob@test.com", "1998-08-15");

        System.out.println("Idade do Uriel: " + u1.getAge());
        
        u1.checkBirthday();
        u2.checkBirthday();

        u1.addFriend(u2);
        u1.addFriend(u3);

        u1.showFriends();
    }
}
```