// class Contact2 {
//     String contactPerson, email, mobile;

//     Contact2(String contactPerson, String email, String mobile) {
//         this.contactPerson = contactPerson;
//         this.email = email;
//         this.mobile = mobile;
//     }

//     void printContact() {
//         System.out.println("\n\nContact Person: " + this.contactPerson);
//         System.out.println("Email: " + this.email);
//         System.out.println("Mobile: " + this.mobile);
//     }
// }

// class CompanyContact extends Contact2 {
//     String CompanyName, department, city, country, address;
//     int pin;
//     final String website;

// CompanyContact(String contactPerson, String email, String mobile,
// String CompanyName, String department,
// String city, String country, String address, String website, int pin) {
// super(contactPerson, email, mobile);
// this.CompanyName = CompanyName;
// this.department = department;
// this.city = city;
// this.country = country;
// this.address = address; this.website = website; this.pin = pin; }

//     void printContact() {
//         System.out.println("\n\nContact Person: " + this.contactPerson);
//         System.out.println("Email: " + this.email);
//         System.out.println("Mobile: " + this.mobile);
//         System.out.println("Company Name: " + this.CompanyName);
//         System.out.println("Department: " + this.department);
//         System.out.println("City: " + this.city);
//         System.out.println("Country: " + this.country);
//         System.out.println("Address: " + this.address);
//         System.out.println("Website: " + this.website);
//         System.out.println("Pin: " + this.pin);
//     }
// }

// class EmployeeContact extends Contact2 {
//     String city, country, designation, dateOfBirth;
//     int pin;

//     EmployeeContact(String contactPerson, String email, String mobile, String city, String country, int pin,
//             String designation, String dateOfBirth) {
//         super(contactPerson, email, mobile);
//         this.city = city;
//         this.country = country;
//         this.pin = pin;
//         this.designation = designation;
//         this.dateOfBirth = dateOfBirth;
//     }

//     void printContact() { System.out.println("\n\nContact Person: " + this.contactPerson); System.out.println("Email: " + this.email);
// System.out.println("Mobile: " + this.mobile); System.out.println("City: " + this.city); System.out.println("Country: " + this.country); System.out.println("Pin: " + this.pin); System.out.println("Designation: " + this.designation); System.out.println("Date of Birth: " + this.dateOfBirth); }
// }

// public class contactData {
//     public static void main(String[] args) {
//         CompanyContact c = new CompanyContact("Manager", "manager@mail.com", "789654123", "theCompany", "HR", "mumbai",
//                 "India", "abc 3,mumbai,india", "theCompany.com", 123456);
//         c.printContact();
//         EmployeeContact e = new EmployeeContact("dave", "dave@mail.com", "789456123", "mumbai", "india", 789456,
//                 "senior dev", "1/1/2001");
//         e.printContact();
//     }
// }