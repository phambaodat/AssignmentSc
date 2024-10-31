
package scannerbaitapsao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class ScannerbaitapSao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ten: ");
        String name = scanner.nextLine();

        System.out.print("Tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Date birthDate = null;
        while (birthDate == null) {
            System.out.print("Nam sinh (dd/MM/yyyy): ");
            String birthDateString = scanner.nextLine();
            try {
                birthDate = dateFormat.parse(birthDateString);
            } catch (ParseException e) {
                System.out.println("Dinh dang sai. Hay nhap lai theo đinh dang dd/MM/yyyy.");
            }
        }

        System.out.print("Gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Chuyen nganh: ");
        String major = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Que quan: ");
        String hometown = scanner.nextLine();

        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Nam sinh: " + dateFormat.format(birthDate));
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + hometown);

        scanner.close();
    }
}
