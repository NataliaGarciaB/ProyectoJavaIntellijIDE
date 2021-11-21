import java.util.Scanner;

public class EjercicioIn {
    
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.print("Igrese su nombre: ");
        String nombre = newScan.next();
        System.out.print("Igrese número de celular: ");
        String celular = newScan.next();
        System.out.print("Igrese la edad: ");
        String edad = newScan.next();
        System.out.println("Bienvenido señor "+nombre+", es un placer para nosotros contar con una persona de "+edad+" años.");
        System.out.println("Próximamente nos comunicaremos con usted al numero "+celular+".");
        System.out.println("Feliz día");
    }
}
