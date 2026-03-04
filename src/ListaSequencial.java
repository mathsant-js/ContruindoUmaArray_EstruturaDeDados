public class ListaSequencial {
    private Object[] vetor = new Object[4];
    public int totalDeObjetos = 0;
    int fim = 0;
    int inicio = 0;

    public boolean listaVazia() {
        return (inicio == fim) && (fim == 0);
    }

    public boolean listaCheia() {
        return totalDeObjetos == vetor.length;
    }

    private boolean posicaoValida(int posicao) {
        return (posicao >= 0) && (posicao < totalDeObjetos);
    }

    public void adiciona(Object elemento) {
        if (listaCheia()) {
            garantaEspaco();
            vetor[fim] = elemento;
            fim++;
            totalDeObjetos++;
        } else {
            vetor[fim] = elemento;
            fim++;
            totalDeObjetos++;
        }
    }

    public void adiciona(Object elemento, int posicao) {
        if (listaCheia()) {
            garantaEspaco();
            for (int i = fim; fim < vetor.length; i++) {
                vetor[i + 1] = vetor[i];
            }
            vetor[fim] = elemento;
        } else {
            for (int i = fim; fim < vetor.length; i++) {
                vetor[i + 1] = vetor[i];
            }
            vetor[fim] = elemento;
        }
    }

    public void remove() {
        if (listaVazia()) {
            System.out.println("Não há como remover itens - Lista está vazia!");
        } else {
            vetor[fim - 1] = 0;
            fim--;
            totalDeObjetos--;
        }
    }

    public void selecionarOndeRemover(int posicao) {
        if (listaVazia()) {
            System.out.println("Não há como remover algum item - Lista vazia!");
        } else if (posicao == vetor.length) {
            System.out.println("A posição escolhida é maior que o limite da lista! - Selecione um número menor que " + vetor.length);
        } else {
            vetor[posicao] = 0;
        }
    }

    public boolean contem(Object elemento) {
        boolean valorRetorno = false;
        for (Object v: vetor) {
            if (elemento.equals(v)) {
                valorRetorno = true;
                v = totalDeObjetos;
            }
        }
        return valorRetorno;
    } // Complexidade linear O(n)

    // Usado para quando acaba o espaço do vetor
    private void garantaEspaco() {
        if (totalDeObjetos == vetor.length) {
            Object[] novoVetor = new Object[vetor.length * 2];

            // Transferir os elementos do vetor `vetor` para novoVetor
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
    }

    public Object getObject(int posicao) {
        if (posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
        return vetor[posicao];
    }

    public int tamanho() {
        return totalDeObjetos;
    }
}
