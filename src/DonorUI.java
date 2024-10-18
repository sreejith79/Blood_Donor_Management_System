import java.util.Scanner;

public class DonorUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DonorCollection dc = new DonorCollection();
        while(true) {
            try {
                System.out.println("---------------Online Donor Registration---------------");
                System.out.println("1. Adding a Donor");
                System.out.println("2. Display all Donor");
                System.out.println("3. Exit the Application");
                System.out.print("Enter a choice you want now: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter Your first Name : ");
                        String fname = sc.next();
                        if(DonorValidation.validateFirstName(fname)) {
                            System.out.print("Enter Your last Name : ");
                            String lname = sc.next();
                            if(DonorValidation.validateLastName(lname)) {
                                System.out.print("Enter Your contact No : ");
                                String phone = sc.next();
                                if(DonorValidation.validateMobileNo(phone)) {
                                    System.out.print("Enter Your blood Group : ");
                                    String group = sc.next();
                                    if(DonorValidation.validateBloodGroup(group)) {
                                        System.out.print("Enter Your age : ");
                                        int age = sc.nextInt();
                                        if(DonorValidation.validateAge(age)) {
                                            System.out.print("Enter Your city : ");
                                            String city = sc.next();
                                            dc.addDonor(fname, lname, phone, group, age, city);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        dc.displayDonor();
                        break;
                    case 3:
                        System.exit(1);
                        break;
                    default:
                        System.err.println("Invalid selection...!");
                }
            } catch (Exception err) {
                System.err.println(err);
            }
        }
    }
}
