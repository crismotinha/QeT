public class ProcessadorDeBoletos {
    public void PagarFatura(Fatura fatura){
        double somaBoletos = 0;

        Boleto[] boletos = fatura.getBoletos();

        for (Boleto boleto : boletos) {
            somaBoletos += boleto.getValorPago();;
        }

        if (somaBoletos > fatura.getValorTotal()) {
            fatura.setPaga(true);
        }
    };
}
