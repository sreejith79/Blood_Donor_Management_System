import java.util.Locale;
import java.util.regex.Pattern;

public class DonorValidation {

    //Validate first name
    public static boolean validateFirstName(String fname) throws DonorException{
        String pattern = "^[A-Za-z]{3,8}$";
        if(Pattern.matches(pattern, fname)) {
            return true;
        } else {
            throw new DonorException("First name should be minimum 3 to maximum 8 characters...");
        }
    }

    //Validate last name
    public static boolean validateLastName(String lname) throws DonorException{
        String pattern = "^[A-Za-z]{3,8}$";
        if(Pattern.matches(pattern, lname)) {
            return true;
        } else {
            throw new DonorException("Last name should be minimum 3 to maximum 8 characters...");
        }
    }

    //Validate mobile number
    public static boolean validateMobileNo(String phone) throws DonorException{
        String pattern = "^\\d{10}$";
        if(Pattern.matches(pattern, phone)) {
            return true;
        } else {
            throw new DonorException("Contact number should be of 10 digits.");
        }
    }

    //Validate blood group
    public static boolean validateBloodGroup(String group) throws DonorException {
        String pattern = "^(A|B|AB|O)[+-]?$";
        if(Pattern.matches(pattern, group.toUpperCase(Locale.ROOT))) {
            return true;
        } else {
            throw new DonorException("Only A,B,AB or O blood group allowed...");
        }
    }

    //Validate age
    public static boolean validateAge(int age) throws DonorException {
        if(age < 21) {
            throw new DonorException("Age should be minimum 21 to donate blood...");
        } else {
            return true;
        }
    }
}
