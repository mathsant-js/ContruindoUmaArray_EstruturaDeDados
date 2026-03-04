public class Main {
    public static void main(String[] args) {
        ListaSequencial ls = new ListaSequencial();

        // Mostrando que a lista está vazia
        ls.listaVazia();

        // Adicionando um elemento
        ls.adiciona(1);

        // Removendo um elemento
        ls.remove();

        // Adicionando um elemento novamente
        ls.adiciona(2);
        ls.adiciona(3);
        ls.adiciona(4);
        ls.adiciona(5);

        // Removendo um elemento da posição que o usuário quiser
        ls.selecionarOndeRemover(4); // Irá retornar que não é possível remover um número dessa posição
        ls.selecionarOndeRemover(3);

        // Mostrar se a lista está cheia
        ls.listaCheia(); // Irá retornar false

        ls.adiciona(5);
        ls.listaCheia();

        ls.listaVazia();  // Irá retornar false

        // Procurar um elemento que o usuário deseja
        ls.contem(5);
    }
}