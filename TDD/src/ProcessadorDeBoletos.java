public class ProcessadorDeBoletos {
    public void PagarFatura(Fatura fatura) throws Exception {
        double somaBoletos = 0;

        Boleto[] boletos = fatura.getBoletos();

        if (boletos.length == 0 ) throw new Exception("Não existem boletos para pagar essa fatura");

        for (Boleto boleto : boletos) {
            somaBoletos += boleto.getValorPago();;
        }

        if (somaBoletos >= fatura.getValorTotal()) {
            fatura.setPaga(true);
        }
    };
}
