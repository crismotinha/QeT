import javax.xml.crypto.Data;

public class Pagamento {
    private double valorPago;
    private Data data;
    private String tipoDePagamento;

    public Pagamento(double valorPago, Data data, String tipoDePagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoDePagamento = tipoDePagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public Data getData() {
        return data;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }
}