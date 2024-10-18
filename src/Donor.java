public class Donor
{
    private int registrationId;
    private static int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String bloodGroup;
    private int age;
    private  String city;

    public Donor(String firstName, String lastName, String mobileNo, String bloodGroup, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.city = city;
        id++;
        registrationId = id;
    }

    //Getter Setter for registrationId
    public int getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    //Getter Setter for firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter Setter for lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter Setter for mobileNo
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    //Getter Setter for bloodGroup
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    //Getter Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Getter Setter for city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
