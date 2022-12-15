package stringClass;

public class MainStringBuilder {
    public static void main(String[] args) {
        String firstName = "Addyani";
        System.out.println("First Name " + firstName);
        String lastName = "Fajar";
        System.out.println("Last Name " + lastName);

        String namaLengkap = firstName + " " + lastName;
        System.out.println("Nama Lebgkap: " + namaLengkap);

        StringBuilder builder = new StringBuilder(firstName)
                .append(" ").append(lastName);
        System.out.println("Builder " + builder);


    }
}
