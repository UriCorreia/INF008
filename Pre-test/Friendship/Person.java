import java.time.LocalDate;
import java.time.Period;

public abstract class Person{

    protected String userName;
    protected String email;
    protected LocalDate dateBirthday;

    public Person(String userName, String email, String dateBirthday){
        this.userName = userName;
        this.email = email;
        this.dateBirthday = LocalDate.parse(dateBirthday);
    }

    // Getters
    public String getUserName(){
        return this.userName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        LocalDate hoje = LocalDate.now();
        return Period.between(this.dateBirthday, hoje).getYears();
    }

    // Setters
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // Métodos
    public void checkBirthday() {
        LocalDate hoje = LocalDate.now();
        if (this.dateBirthday.getDayOfMonth() == hoje.getDayOfMonth() &&
            this.dateBirthday.getMonth() == hoje.getMonth()) {
            System.out.println("🎉 PARABÉNS " + this.userName + "! Feliz Aniversário!");
        } else {
            System.out.println(this.userName + " não faz aniversário hoje.");
        }
    }
}   