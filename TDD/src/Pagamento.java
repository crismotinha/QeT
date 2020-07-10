import javax.xml.crypto.Data;
import java.util.Date;

public class Pagamento {
    private double valorPago;
    private Date data;
    private String tipoDePagamento;

    public Pagamento(double valorPago, Date data, String tipoDePagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoDePagamento = tipoDePagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public Date getData() {
        return data;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }
}