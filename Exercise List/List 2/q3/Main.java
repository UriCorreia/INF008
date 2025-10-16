package q3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("2023001", "Ana Silva");
        Aluno aluno2 = new Aluno("2023002", "Bruno Souza", 21);
        Aluno aluno3 = new Aluno("2023003", "Carla Mendes", 22, "Engenharia");

        System.out.println(aluno1.exibirDados());
        System.out.println(aluno2.exibirDados());
        System.out.println(aluno3.exibirDados());
    }
}