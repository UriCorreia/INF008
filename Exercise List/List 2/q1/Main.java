package q1;

public class Main{
    
    static public void main(String[] args){

        ContaBancaria conta = new ContaBancaria("218", "CORRENTE", 218.14);

        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Tipo: " + conta.getTipo());
        System.out.println("Saldo: " + conta.getSaldo());
    }
} 