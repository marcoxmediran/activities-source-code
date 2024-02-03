
public class Student {
    
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    private String program;
    private String permanentAddress;
    private String emailAddress;
    
    public Student(){}
    
    public Student(String fn, String ln, String age, String gender, String program, String add, String email) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
        this.gender = gender;
        this.program = program;
        this.permanentAddress = add;
        this.emailAddress = email;
    }
    
    public boolean isValid() {
        if (this.firstName.isEmpty()) {
            return false;
        } else if (this.lastName.isEmpty()) {
            return false;
        } else if (this.age.isEmpty()) {
            return false;
        } else if (this.gender.isEmpty()) {
            return false;
        } else if (this.program.isEmpty()) {
            return false;
        } else if (this.permanentAddress.isEmpty()) {
            return false;
        } else if (this.emailAddress.isEmpty()) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')", this.firstName, this.lastName, this.age, this.gender, this.program, this.permanentAddress, this.emailAddress);
    }
    
}
