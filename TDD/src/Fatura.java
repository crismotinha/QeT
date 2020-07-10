import java.util.Date;

public class Fatura {
    private Date data;
    private double valorTotal;
    private String nomeDoCliente;
    private Boleto[] boletos;
    private boolean paga;
    private Pagamento[] pagamentos;

    public Fatura(Date data, double valorTotal, String nomeDoCliente, Boleto[] boletos, boolean paga, Pagamento[] pagamentos) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeDoCliente = nomeDoCliente;
        this.boletos = boletos;
        this.paga = paga;
        this.pagamentos = pagamentos;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public Date getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public Boleto[] getBoletos() {
        return boletos;
    }

    public boolean isPaga() {
        return paga;
    }

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }
}
