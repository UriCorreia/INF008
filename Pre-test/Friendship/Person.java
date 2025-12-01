public abstract class Person{

    protected String userName;
    protected String email;
    protected int countFriends;

    public Person(String userName, String email, int countFriends){
        this.userName = userName;
        this.email = email;
        this.countFriends = countFriends;
    }

    // Getters
    public String getUserName(){
        return this.userName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getCountFriends(){
        return this.countFriends;
    }

    // Setters
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCountFriends(int countFriends){
        if(countFriends < 0){
            System.out.println("Valor invélido!");
            return;
        } else{
            this.countFriends = countFriends;
        }
    }
}