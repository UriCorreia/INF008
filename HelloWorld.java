// O nome da class sempre que é iniciado uma palavra colocamos a primeira letra como maiúscula, é o que chamamos de "Camel case"
// O nome da class é sempre o nome do arquivo

public class HelloWorld { // <- Definindo uma classe
    
    public static void main (String[] args){ // <- Criação de um método, ou seja uma função em Java, em POO trata-se de ações que uma classe pode realizar
        System.out.println("Hello World!"); // Comando de saída
    }

    // public static -> Modificadores de acesso
    // void -> tipo de retorno
    // String[] args -> parâmetros
}


// Para compilar primeiro alteramos o diretório para onde está o arquivo que criamos utilizando o "cd 'nome_do_diretório'"
// Para verificar se estamos no diretório correto utilizamos o "ls"
// Se após digitar ls aparecer o nome do arquivo do qual queremos, está no diretório correto
// Após isso digitamos "javac nome_do_arquivo.java" para compilar -> Após compilar vai ser criado um arquivo ".class" com o mesmo nome do arquivo compilado
    // O arquivo .class é a tradução do código para a JVM (Java Virtual Machine - Máquina Virtual Java) e assim ser executado
// E finalizamos digitando "java nome_do arquivo" para executar
