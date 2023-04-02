package Homework12;

public class Author {
    String lastName;
    String firstName;
    public Author (String lastName,String firstName){
        this.lastName=lastName;
        this.firstName=firstName;
    }
    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}

    public void setLastName(String lastName){this.lastName=lastName;}
    public void setFirstName(String FirstName){this.firstName=firstName;}
}
