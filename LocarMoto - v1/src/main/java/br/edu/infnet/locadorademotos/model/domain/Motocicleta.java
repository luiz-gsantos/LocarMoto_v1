package br.edu.infnet.locadorademotos.model.domain;


import br.edu.infnet.locadorademotos.model.exceptions.CampoInvalidoException;
import br.edu.infnet.locadorademotos.model.exceptions.CilindradasInvalidaException;
import br.edu.infnet.locadorademotos.model.exceptions.MarcaInvalidaException;
import br.edu.infnet.locadorademotos.model.exceptions.ModeloInvalidoException;

public abstract class Motocicleta {

    private String tipo;
    private int ano;
    private float valorVenal;
    private float precoDiaria;

    public Motocicleta(){

    }
    public Motocicleta(String tipo, int ano, float valorVenal, float precoDiaria) throws CampoInvalidoException {
        if (valorVenal <= 0) {
            throw new CampoInvalidoException("O valor do produto está zerado!");
        }
        if (precoDiaria <= 0) {
            throw new CampoInvalidoException("O valor do produto está negativo!");
        }
        this.tipo = tipo;
        this.ano = ano;
        this.valorVenal = valorVenal;
        this.precoDiaria = precoDiaria;
    }

    public abstract float calcularDiaria() throws CilindradasInvalidaException, ModeloInvalidoException, MarcaInvalidaException, CampoInvalidoException;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipo);
        sb.append(";");
        sb.append(ano);
        sb.append(";");
        sb.append(precoDiaria);
        return sb.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public int getAno() {
        return ano;
    }

    public float getValorVenal() {
        return valorVenal;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public float setPrecoDiaria(float precoDiaria) {
        return this.precoDiaria = precoDiaria;
    }
}
