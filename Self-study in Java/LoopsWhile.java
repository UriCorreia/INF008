public class LoopsWhile {

    public static void main(String[] args) {
        
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max){
            System.out.println("Valor de i: " + i);
            i++;
        }
        // No while, ele primeiro confere a expressão se é verdadeira e depois executa o código 

        // Além do "while"(Enquanto) temos o "do-while"(Faça-enquanto)

        do {
            System.out.println("Valor de i: " + i++);
        } while(i < 15); 
        // No do-while ele executa o bloco antes de conferir se a expressão é verdadeira
    }
}
