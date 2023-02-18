public class ifElseifElse1 {
    public static void main(String[] args) {

        float promedio = 5.1f;
        if (promedio < 0){
            System.out.println("Debe ser un numero positivo");
        }else if (promedio < 3){
            System.out.println("perdiste la materia");
        } else if (promedio < 4) {
            System.out.println("hay de mejorar mejorar");
        } else if (promedio < 4.5) {
            System.out.println("Eres muy bueno te falta un poco");
        }else if (promedio <= 5){
            System.out.println("Sigue asi y aprende nuevas cosas");
        } else {
            System.out.println("El numero debe ser menor a 5");
        }

    }
}