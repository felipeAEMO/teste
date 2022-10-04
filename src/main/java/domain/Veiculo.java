package domain;

import java.util.Objects;

public class Veiculo {

    private Integer id;
    private String placa;
    private String cor;

    public Veiculo(Integer id, String placa, String cor) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return getId().equals(veiculo.getId()) && getPlaca().equals(veiculo.getPlaca()) && getCor().equals(veiculo.getCor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlaca(), getCor());
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
