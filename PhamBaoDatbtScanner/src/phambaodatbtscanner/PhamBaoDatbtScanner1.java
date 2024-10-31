package phambaodatbtscanner1;
import java.util.Scanner;
public class PhamBaoDatbtScanner1 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a float number: ");
       // float number = scanner.nextFloat();
        // System.out.println("number = " + number);
        // System.out.println("float data type? " + scanner.hasNextFloat());
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ten: ");
        String ten = scanner.nextLine();

        System.out.print("Tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Gioi tinh: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Que quan: ");
        String queQuan = scanner.nextLine();

        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + queQuan);

        scanner.close();   
    }
}
