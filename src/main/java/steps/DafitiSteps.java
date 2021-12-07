package steps;

import drivers.GoogleChromeDriver;
import org.junit.Assert;
import pages.DafitiPage;

public class DafitiSteps {
    DafitiPage dafitiPage = new DafitiPage();

    public void abrirPagina(){
        GoogleChromeDriver.chromeWebDriver("https://www.dafiti.com.co/");
    }

    public void buscarElementoEnDafiti(String producto){
        GoogleChromeDriver.driver.findElement(dafitiPage.getinputBuscador()).sendKeys(producto);
        GoogleChromeDriver.driver.findElement(dafitiPage.getinputBuscador()).submit();
        //div [@class="itm-product-main-info"]
        GoogleChromeDriver.driver.findElement(dafitiPage.getBtnElementoBusqueda()).click();


    }
    public  void validarProductoDafiti(String producto){
        dafitiPage.setTxtElementoBusqueda(producto);
        Assert.assertEquals(producto,GoogleChromeDriver.driver.findElement(dafitiPage.getTxtElementoBusqueda()).getText());
    }


}
