import java.util.Date;
import java.util.UUID;

public class Boleto {
    private UUID codigo;
    private Date data;
    private double valorPago;

    public Boleto(UUID codigo, Date data, double valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public double getValorPago() {
        return valorPago;
    }
}
