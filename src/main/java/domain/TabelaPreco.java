package domain;

import java.util.Objects;

public class TabelaPreco {

    private String periodo;
    private Double valor;
    private String campo;

    public TabelaPreco(String periodo, Double valor, String campo) {
        this.periodo = periodo;
        this.valor = valor;
        this.campo = campo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabelaPreco that)) return false;
        return getPeriodo().equals(that.getPeriodo()) && getValor().equals(that.getValor()) && getCampo().equals(that.getCampo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeriodo(), getValor(), getCampo());
    }

    @Override
    public String toString() {
        return "TabelaPreco{" +
                "periodo='" + periodo + '\'' +
                ", valor=" + valor +
                ", campo='" + campo + '\'' +
                '}';
    }
}
