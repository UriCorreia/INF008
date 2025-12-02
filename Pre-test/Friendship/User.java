import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Sociable{

    public List<User> friends;

    public User(String userName, String email, String dateBirthday){
        super(userName, email, dateBirthday);
        this.friends = new ArrayList<>();
    }

    @Override
    public void addFriend(User newFriend){
        this.friends.add(newFriend);
    }

    @Override
    public void showFriends(){
        for(User a : friends){
            System.out.println("Name: " + a.userName + "\n");
        }
    }
}