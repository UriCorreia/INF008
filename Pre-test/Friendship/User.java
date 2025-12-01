import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Sociable{

    protected String dateBirthday;
    List<User> friends;

    public User(String userName, String email, int countFriends, String dateBirthday){
        super(userName, email, countFriends);
        this.dateBirthday = dateBirthday;
        this.friends = new ArrayList<>();
    }

    @Override
    public void addFriend(User newFriend){
        Friends.add(newFriend);
    }

    @Override
    public void showFriends(){
        for(User a : Friends){
            System.out.println("Name: " + a.userName + "\n");
        }
    }


}