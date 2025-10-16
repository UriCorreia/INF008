package q3;

public class Aluno {
    
    private String matricula;
    private String nome;
    private int idade;
    private String curso;
    
    // Construtores sobrecarregados
    public Aluno(String matricula, String nome){
        this(matricula, nome, 0);
    }

    public Aluno(String matricula, String nome, int idade){
        this(matricula, nome, idade, "Indefinido");
    }

    public Aluno(String matricula, String nome, int idade, String curso){
        validarMatricula(matricula);
        validarNome(nome);
        validarIdade(idade);

        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    // Getters
    public String getMatricula() { 
        return this.matricula; 
    }

    public String getNome() { 
        return this.nome; 
    }

    public int getIdade() { 
        return this.idade; 
    }

    public String getCurso() { 
        return this.curso; 
    }

    // Métodos de validação
    private void validarMatricula(String matricula) {
        if(matricula == null || matricula.trim().isEmpty()){
            throw new IllegalArgumentException("Matrícula Inválida!");
        }
    }
    private void validarNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome Inválido!");
        }
    }
    private void validarIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Idade Inválida!");
        }
    }

    // Método de exibição
    public String exibirDados() {
        StringBuilder report = new StringBuilder();

        report.append("Matrícula: ").append(this.matricula).append("\n");
        report.append("Nome: ").append(this.nome).append("\n");
        report.append("Idade: ").append(this.idade).append("\n");
        report.append("Curso: ").append(this.curso).append("\n");

        return report.toString();
    }
}

// Pergunta: Implemente os construtores encadeados e determine quais getters devem ser públicos.
// Justifique a escolha de visibilidade baseado no princípio de menor privilégio.