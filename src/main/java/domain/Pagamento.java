package domain;

import domain.Ticket;

import domain.Mensalidade;

import java.util.Objects;

public class Pagamento {

    public Ticket ticket;
    public Mensalidade mensalidade;
    public Boolean pago;

    public Pagamento(Ticket ticket, Mensalidade mensalidade, Boolean pago) {
        this.ticket = ticket;
        this.mensalidade = mensalidade;
        this.pago = pago;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento pagamento)) return false;
        return getTicket().equals(pagamento.getTicket()) && getMensalidade().equals(pagamento.getMensalidade()) && getPago().equals(pagamento.getPago());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTicket(), getMensalidade(), getPago());
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "ticket=" + ticket +
                ", mensalidade=" + mensalidade +
                ", pago=" + pago +
                '}';
    }
}

