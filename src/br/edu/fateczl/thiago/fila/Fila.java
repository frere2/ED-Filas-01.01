package br.edu.fateczl.thiago.fila;

public class Fila<T> {

    No<T> inicio;
    No<T> fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean isEmpty() {
        return inicio == fim && inicio == null;
    }

    public void insert(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = null;
        if (inicio == null) {
            inicio = elemento;
        } else {
            fim.proximo = elemento;
        }
        fim = elemento;
    }

    public void list() throws Exception {
        if (isEmpty())
            throw new Exception("Fila Vazia");

        No<T> auxiliar = inicio;

        while (auxiliar != null) {
            System.out.println(auxiliar.dado);
            auxiliar = auxiliar.proximo;
        }
    }

    public T remove() throws Exception {
        if (isEmpty())
            throw new Exception("Fila Vazia");

        No<T> auxiliar = inicio;
        if (inicio == fim && inicio != null) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
        }

        return auxiliar.dado;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int cont = 0;
            No<T> auxiliar = inicio;
            while (auxiliar != null) {
                cont++;
                auxiliar = auxiliar.proximo;
            }
            return cont;
        }
    }
}
