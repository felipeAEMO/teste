package domain;

import java.util.Objects;

public class Mensalidade {

    private Integer id;
    private Double valor;

    public Mensalidade(Integer id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mensalidade that)) return false;
        return getId().equals(that.getId()) && getValor().equals(that.getValor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValor());
    }

    @Override
    public String toString() {
        return "Mensalidade{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }
}
