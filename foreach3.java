public class foreach3 {
    public static void main(String[] args) {
        int[] numero = {1,2,3,4,5,6,7};

        for (int num: numero) {
            System.out.println("numero = " + num);
        }

        String[] nombres = {"Alejandra", "Jose", "Marcela", "Francisco"};
        for (String name:nombres){
            System.out.println("name = " + name);
        }
    }
}
