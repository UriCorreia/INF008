package q2;

public class Post {

    private String conteudo;
    private String autor;
    private int curtidas;
    private boolean publico;
    
    // Construtores sobrecarregados
    public Post(String conteudo, String autor) {
        this(conteudo, autor, true);
    }

    public Post(String conteudo, String autor, boolean publico) {
        validarConteudo(conteudo);
        validarAutor(autor);

        this.conteudo = conteudo;
        this.autor = autor;
        this. publico = publico;

        this.curtidas = 0; // Todo post novo começa com 0 curtidas
    }

    // Métodos curtir sobrecarregados
    public void curtir(){
        this.curtir(1);
    }

    public void curtir(int quantidade){
        if(validarQuantidade(quantidade)){
            this.curtidas += quantidade;
        }
    }

    // métodos de validação
    private void validarConteudo(String conteudo) {
        if (conteudo == null || conteudo.trim().isEmpty()) {
            throw new IllegalArgumentException("Conteúdo não pode ser vazio!");
        }
    }

    private boolean validarQuantidade(int quantidadde) {
        return quantidadde > 0;
    }

    private void validarAutor(String autor){
        // Verifica se a variável está referenciando algum objeto ou se soboru alguma coisa, depois de retirar os espaços, do inicio e do fim 
        if(autor == null || autor.trim().isEmpty()){
            throw new IllegalArgumentException("Autor não pode ser vazio!"); // Funciona como um return, interropendo imediatamente a execução do código, a diferença é que pode-se adicionar um comentário
        }
    }

    // Getters
    public String getConteudo(){
        return this.conteudo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public boolean istPublico(){
        return this.publico;
    }
}


// Pergunta: Complete a classe implementando: (1) Construtores que evitem duplicação usando this,
// (2) Métodos curtir sobrecarregados que compartilhem lógica de validação através de método
// privado, (3) Validações adequadas nos construtores.