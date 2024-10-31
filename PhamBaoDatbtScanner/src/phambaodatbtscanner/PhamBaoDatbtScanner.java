// BT 1: Input: ten, tuoi, gioi tinh, chuyen nganh, GPA,
package phambaodatbtscanner;
import java.util.Scanner;
public class PhamBaoDatbtScanner {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a float number: ");
       // float number = scanner.nextFloat();
        // System.out.println("number = " + number);
        // System.out.println("float data type? " + scanner.hasNextFloat());
        String Ten, GioiTinh, ChuyenNganh, QueQuan;
        int Tuoi;
        float GPA;
        
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a name: ");
        Ten = scanner.nextLine();
        System.out.println("Name: " + Ten);
        
        System.out.print("Enter an age: ");
        Tuoi = scanner.nextInt();
        System.out.println("Tuoi: " + Tuoi);
        
        System.out.print("Enter your GPA: ");
        GPA = scanner.nextFloat();
        System.out.println("GPA: " + GPA);
        scanner.nextLine();
        
        System.out.print("Enter your sex: ");
        GioiTinh = scanner.nextLine();
        System.out.println("Sex: " + GioiTinh);
        
        System.out.print("Enter your major: " );
        ChuyenNganh = scanner.nextLine();
        System.out.println("Major: " + ChuyenNganh);
        
        System.out.print("Enter your hometown: ");
        QueQuan = scanner.nextLine();
        System.out.println("Hometown: " + QueQuan);
        
        
        
        
    }
}
