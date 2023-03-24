package br.edu.infnet.locadorademotos.model.domain;


import br.edu.infnet.locadorademotos.model.exceptions.CampoInvalidoException;
import br.edu.infnet.locadorademotos.model.exceptions.CilindradasInvalidaException;

public class Street extends Motocicleta {

    private boolean paraTrabalho;
    private int cilindradas;
    private boolean seguro;
    private Integer id;


    public Street(){

    }
    public Street(String tipo, int ano, float valorVenal, float precoDiaria) throws CampoInvalidoException {
        super(tipo, ano, valorVenal, precoDiaria);
    }

    @Override
    public float calcularDiaria() throws CilindradasInvalidaException {
        if (cilindradas <= 0) {
            throw new CilindradasInvalidaException("As Cilindradas devem ser informadas.");
        }
        Float adicional = 0f;
        if (paraTrabalho == true) {
            adicional += 10;
        }
        if (seguro == true) {
            adicional += 20;
        }
        Float valor = this.getValorVenal() / 250;
        Float valor_total = valor + adicional + (cilindradas / 15);
        return setPrecoDiaria(valor_total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(paraTrabalho ? "Sim" : "Não");
        sb.append(";");
        sb.append(cilindradas);
        sb.append(";");
        sb.append(seguro ? "Sim" : "Não");
        return sb.toString();
    }

    public boolean isParaTrabalho() {
        return paraTrabalho;
    }

    public void setParaTrabalho(boolean paraTrabalho) {
        this.paraTrabalho = paraTrabalho;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
