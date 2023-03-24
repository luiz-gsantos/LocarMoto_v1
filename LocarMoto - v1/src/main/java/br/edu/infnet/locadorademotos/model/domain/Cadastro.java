package br.edu.infnet.locadorademotos.model.domain;


import br.edu.infnet.locadorademotos.model.exceptions.CnhInvalidaException;
import br.edu.infnet.locadorademotos.model.exceptions.CpfInvalidoException;
import br.edu.infnet.locadorademotos.model.exceptions.IdadeInvalidaException;
import br.edu.infnet.locadorademotos.model.exceptions.NomeInvalidoException;

public class Cadastro {

    private String nome;
    private String cpf;
    private int idade;
    private int cnh;

    public Cadastro(String nome, int cnh, String cpf) throws NomeInvalidoException, IdadeInvalidaException, CnhInvalidaException, CpfInvalidoException {
        if (idade >= 18) {
            throw new IdadeInvalidaException("O cliente deve ser maior de idade(18).");
        }
        this.nome = nome;
        this.cnh = cnh;
        if (cnh <= 0) {
            throw new CnhInvalidaException("O cliente deve possuir uma CNH válida.");
        }
        this.cpf = cpf;
        if (cpf == null) {
            throw new CpfInvalidoException("O CPF deve ser preenchido!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(";");
        sb.append(cpf);
        sb.append(";");
        sb.append(cnh);
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCnh() {
        return cnh;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
