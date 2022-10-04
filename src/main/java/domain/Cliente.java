package domain;

import java.util.Objects;
import domain.Mensalidade;
public class Cliente {

    public Integer id;
    public String nome;
    public String cpf;
    public String telefone;
    public Mensalidade mensalidade;

    public Cliente(Integer id, String nome, String cpf, String telefone, Mensalidade mensalidade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.mensalidade = mensalidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return getId().equals(cliente.getId()) && getNome().equals(cliente.getNome()) && getCpf().equals(cliente.getCpf()) && getTelefone().equals(cliente.getTelefone()) && getMensalidade().equals(cliente.getMensalidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getCpf(), getTelefone(), getMensalidade());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", mensalidade=" + mensalidade +
                '}';
    }
}
