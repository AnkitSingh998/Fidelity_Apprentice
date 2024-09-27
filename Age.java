import java.time.LocalDate;
import java.time.Period;

public class Age {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Age(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getAdult(){
        return getAge(birthDate)>=18 ? "Adult":"Child";
    }
    public int getAge(LocalDate birthDate){
        return Period.between(birthDate,LocalDate.now()).getYears();
    }
    public void displaydetails()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Age: " + getAge(birthDate));
        System.out.println("Status" +getAdult());

    }
}
