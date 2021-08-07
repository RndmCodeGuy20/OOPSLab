public class Contact {
    String contactPerson, email;
    long mobile;

    public static void main(String[] args) {

        CompanyContact CompCont = new CompanyContact("Senior Developer", "shantanu@gmail.com", 9849875,"Google", "Engineering and Technology", "Pune", "India", "Regenta Heights, 46th Lane, Pashan, Pune", 2002, "maneSeniorDev.com");
        CompCont.printContact();

        EmployeeContact EmpCont = new EmployeeContact("Mane", "mane@gmail.com", 9487938, "Nagpur", "India", "Legal Advisor", "20/03/2002", 2002);
        EmpCont.printContact();

        Contact Con = new Contact("Senior Developer", "shantanu@gmail.com", 9849875);
        Con.printContact();

    }

    Contact(String personContact, String Email, long mobile) {
        contactPerson = personContact;
        email = Email;
        this.mobile = mobile;
    }

    public void printContact() {
        System.out.println("\n\nContact Person : " + contactPerson);
        System.out.println("E-mail ID : " + email);
        System.out.println("Mobile Number : " + mobile);

    }
}

class CompanyContact extends Contact {
    String companyName, department, city, country, address;
    final String Website;
    int PIN;

    CompanyContact(String contactPerson, String email, long mobile, String CompanyName, String Dept, String City,
            String Country, String Address, int PIN, String Website) {
        super(contactPerson, email, mobile);
        companyName = CompanyName;
        department = Dept;
        city = City;
        country = Country;
        address = Address;
        this.Website = Website;
        this.PIN = PIN;
    }

    public void printContact() {
        System.out.println("\n\nContact Person : " + contactPerson);
        System.out.println("Company Name : " + companyName);
        System.out.println("Department : " + department);
        System.out.println("E-mail ID : " + email);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("City : " + city);
        System.out.println("Country : " + country);
        System.out.println("Website : " + Website);
        System.out.println("PIN ID : " + this.PIN);
    }
}

class EmployeeContact extends Contact {
    String City, Country, Designation, DateOfBirth;
    int PIN;

    EmployeeContact(String contactPerson, String email, long mobile, String city, String country, String designation, String dateOfBirth, int PIN){
        super(contactPerson, email, mobile);
        City = city;
        Country = country;
        Designation = designation;
        DateOfBirth = dateOfBirth;
        this.PIN = PIN;
    }

    public void printContact() {
        System.out.println("\n\nContact Person : " + contactPerson);
        System.out.println("Designation : " + Designation);
        System.out.println("Email : " + email);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("City : " + City);
        System.out.println("Country : " + Country);
        System.out.println("Date of Birth : " + Designation)
        ;
        System.out.println("PIN ID : " + this.PIN);
    }
}