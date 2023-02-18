import java.lang.reflect.Method;

public class getClass5 {
    public static void main(String[] args) {
        String texto = "Hola como estan?";
        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass);
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.strClass = " + strClass);

        for (Method metodos: strClass.getMethods()){
            System.out.println("Metodos = " + metodos.getName());
        }

        Integer numero = 100;
        Class intClass = numero.getClass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSimpleName()..getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass.getSimpleName()..getSuperclass() = " + intClass.getSuperclass().getSuperclass().getSuperclass());
        System.out.println("\n");

        for (Method metodos: intClass.getMethods()){
            System.out.println("Metodos = " + metodos.getName());
        }

        System.out.println("\n");
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("objClass = " + objClass);
        for (Method metodos: objClass.getMethods()){
            System.out.println("Metodos = " + metodos.getName());
        }
    }
}
