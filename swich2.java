import java.util.Scanner;

public class swich2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        do {
            System.out.println("Escribe una opcion: " +
                    "\n1. de pesos colombianos a dolar" +
                    "\n2. de pesos colombianos a euros");
            String  opcion = scanner.next();
            float valor = 0f;
            switch (opcion){
                case "1":
                    System.out.println("Escriba el valor de la moneda");
                    valor = scanner.nextInt();
                    System.out.println(valor / 4743);
                    break;
                case "2":
                    System.out.println("Escriba el valor de la moneda");
                    valor = scanner.nextInt();
                    System.out.println(valor / 5062);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
            System.out.println("1. para salir" +
                    "\n otra tecla continuara");
            int continuar = scanner.nextInt();
            if (continuar == 1){
                bandera = false;
            }
        }while (bandera);

    }
}
