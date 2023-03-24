package br.edu.infnet.locadorademotos.model.domain;



import br.edu.infnet.locadorademotos.model.exceptions.CampoInvalidoException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Locadora {

    private Cadastro cadastro;
    private List<Motocicleta> locados;
    private Motocicleta motocicleta;

    public Locadora(Cadastro cadastro, List<Motocicleta> locados) throws CampoInvalidoException {
        if (cadastro == null) {
            throw new CampoInvalidoException("Não é possível fazer a requisição.");
        }
        if (locados == null) {
            throw new CampoInvalidoException("Não é possível completar a requisição.");
        }
        this.locados = locados;
        this.cadastro = cadastro;
        data = LocalDateTime.now();
    }

    LocalDateTime data = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE.ofPattern("dd MM yyyy");
    String datatext = data.format(formatter);

    public String imprimir() {
        String itensSelecionados = "";
        for (Motocicleta locado : locados) {
            itensSelecionados += locado;
        }
        return this + itensSelecionados;
    }

    public String obterLinha() {
        return this.getData().format(formatter) + ";" + this.getCadastro().getNome() + ";" + this.getLocados().size() + ";";
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s", cadastro, locados, data.format(formatter));
    }

    public List<Motocicleta> getLocados() {
        return locados;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setLocados(List<Motocicleta> locados) {
        this.locados = locados;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }
}
