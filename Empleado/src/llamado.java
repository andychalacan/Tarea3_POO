
import java.util.Scanner;
public class llamado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombreUsuario= scanner.nextLine();
        System.out.println("Ingrese la edad del empleado");
        int edadempleado= scanner.nextInt();
        System.out.println("Ingrese el salario del empleado");
        double sueldoUsuario= scanner.nextDouble();
        Empleado cargo1=new Empleado();
        Empleado cargo2=new Empleado(nombreUsuario, edadempleado, sueldoUsuario);
        System.out.println("Informacion del empleado 1");
        cargo1.mensaje();
        cargo2.mensaje();
        scanner.close();
    }
}