package domain;

import domain.Veiculo;

import java.util.Objects;

public class Ticket {

    private Integer id;
    private String entrada;
    private String saida;
    private Veiculo veiculo;
    private TabelaPreco tabelaPreco;

    public Ticket(Integer id, String entrada, String saida, Veiculo veiculo, TabelaPreco tabelaPreco) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.veiculo = veiculo;
        this.tabelaPreco = tabelaPreco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;
        return getId().equals(ticket.getId()) && getEntrada().equals(ticket.getEntrada()) && getSaida().equals(ticket.getSaida()) && getVeiculo().equals(ticket.getVeiculo()) && getTabelaPreco().equals(ticket.getTabelaPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntrada(), getSaida(), getVeiculo(), getTabelaPreco());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' +
                ", veiculo=" + veiculo +
                ", tabelaPreco=" + tabelaPreco +
                '}';
    }
}
