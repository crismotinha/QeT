import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class ProcessadorDeBoletosTest {

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMaiorQueOValorTotal_DeveMarcarComoPaga() throws Exception {
        //Arrange
        double valorFatura = 1500;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), 500);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), 400);
        Boleto boleto3 = new Boleto(UUID.randomUUID(), new Date(), 600);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2, boleto3}, false, new ArrayList<Pagamento>());

        boolean esperado = true;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForIgualQueOValorTotal_DeveMarcarComoPaga() throws Exception {
        //Arrange
        double valorFatura = 100;
        double valorBoleto = 50;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2}, false, new ArrayList<Pagamento>());

        boolean esperado = true;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMenorQueOValorTotal_DeveMarcarComoNaoPaga() throws Exception {
        //Arrange
        double valorFatura = 2000;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), 500);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), 400);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2}, false, new ArrayList<Pagamento>());

        boolean esperado = false;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

    @Test(expected = Exception.class)
    public void PagarFatura_QuandoNaoExistiremBoletos_DeveRetornarErroDeBoletosInexistentes() throws Exception {
        //Arrange
        Fatura fatura = new Fatura(new Date(), 10, "Teste", new Boleto[]{}, false, new ArrayList<Pagamento>());

        //Act e Assert
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMaiorQueOValorTotal_DeveGerarUmPagamentoPorBoleto() throws Exception {
        //Arrange
        double valorFatura = 1500;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), 500);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), 400);
        Boleto boleto3 = new Boleto(UUID.randomUUID(), new Date(), 600);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2, boleto3}, false, new ArrayList<Pagamento>());

        int numeroDePagamentosEsperado = 3;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(numeroDePagamentosEsperado, fatura.getPagamentos().size());

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMenorQueOValorTotal_DeveGerarUmPagamentoPorBoleto() throws Exception {
        //Arrange
        double valorFatura = 2000;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), 500);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), 400);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2}, false, new ArrayList<Pagamento>());

        int numeroDePagamentosEsperado = 2;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(numeroDePagamentosEsperado, fatura.getPagamentos().size());

    }

}