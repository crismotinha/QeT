import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;

public class ProcessadorDeBoletosTest {

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMaiorQueOValorTotal_DeveMarcarComoPaga(){
        //Arrange
        double valorFatura = 100;
        double valorBoleto = 60;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2},false);

        boolean esperado = true;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForIgualQueOValorTotal_DeveMarcarComoPaga(){
        //Arrange
        double valorFatura = 100;
        double valorBoleto = 50;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2},false);

        boolean esperado = true;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

    @Test
    public void PagarFatura_QuandoOValorDosBoletosForMenorQueOValorTotal_DeveMarcarComoNaoPaga(){
        //Arrange
        double valorFatura = 100;
        double valorBoleto = 20;

        Boleto boleto1 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);
        Boleto boleto2 = new Boleto(UUID.randomUUID(), new Date(), valorBoleto);

        Fatura fatura = new Fatura(new Date(), valorFatura, "Teste", new Boleto[]{boleto1, boleto2},false);

        boolean esperado = false;

        //Act
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.PagarFatura(fatura);

        //Assert
        Assert.assertEquals(esperado, fatura.isPaga());

    }

}