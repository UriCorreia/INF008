package q1;

public class ContaBancaria {

    private String numero;
    private String tipo; // "CORRENTE" ou "POUPANCA"
    private double saldo;


    public ContaBancaria(String numero, String tipo) {
        this(numero, tipo, 0.0);
    }

    public ContaBancaria(String numero, String tipo, double saldoInicial) {
        this.numero = numero;
        this.tipo = tipo;
        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
            System.out.println("Aviso: Saldo inicial inválido. A conta foi criado com um saldo de R$: " + this.saldo);
        }
    }

    // TODO: Criar métodos sobrecarregados para depositar
    // depositar(double valor) e depositar(double valor, String descricao)
    public void depositar(double valor){
        this.depositar(valor, "Depósito padrão.");
    }

    public void depositar(double valor, String descricao){
        if(validarValor(valor)){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!\n");
            System.out.printf("Descrição: %s%n", descricao);
        } else {
            System.out.println("Valor inválido! Depósito não foi realizado!");
        }
    }

    // Validação de valor
    private boolean validarValor(double valor) {
        return valor > 0;
    }

    // TODO: Criar getters APENAS para os atributos necessários
    public String getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTipo(){
        return this.tipo;
    }

}

// Pergunta: Implemente os construtores e métodos seguindo rigorosamente: 
// (1) Um construtor deve chamar o outro usando this, (2) Sobrecarregue o método depositar mantendo a validação
// centralizada, (3) Use private para o método de validação, (4) Exponha apenas getters necessários.
