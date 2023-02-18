public class EtiquetaBuscar4 {
    public static void main(String[] args) {
        String frase = "Cuando cuentes cuentos, cuenta cuántos cuentos cuentas, porque si no cuentas cuántos cuentos cuentas, nunca sabrás cuántos cuentos cuentas tú.";
        int max = frase.length();
        short cantidad = 0;
        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != 'c'){
                continue;
            }
            cantidad++;
        }
        System.out.println("cantidad = " + cantidad);
    }
}
