public class LoopsFor {

    public static void main(String[] args) {

        // System.out.println("Contando até 10 com For");

        // for(int i = 0; i <= 10; i++){
        //     System.out.println("Valor de i: " + i);
        // }

        // for(int i = 0, j = 10; i < j; i++, j--){
        //     System.out.println("i = " + i + "; j = " + j);
        // }

        int soma = 0;
        for(int i = 0; i < 5; soma += i++);
        System.out.println("Soma = " + soma);
    }
    
}
