package br.edu.infnet.locadorademotos.model.exceptions;

public class IdadeInvalidaException extends Exception {

    private static final long serialVersionUID = 1L;

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
