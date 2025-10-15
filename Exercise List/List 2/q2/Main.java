package q2;

public class Main{
    public static void main(String[] args){
        Post post = new Post("Uriel", "Teste", true);

        System.out.printf("Autor: %s%n", post.getAutor());
        System.out.printf("Conteúdo: %s%n", post.getConteudo());
        System.out.printf("Curtidas: %d%n", post.getCurtidas());
        System.out.printf("Publico: %b%n", post.istPublico());

        post.curtir();
        System.out.printf("Curtidas: %d%n", post.getCurtidas());

    }
}