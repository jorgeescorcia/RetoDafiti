package pages;

import org.openqa.selenium.By;


public class DafitiPage {


    By inputBuscador = By.xpath("//input[@id='searchInput']");



    By btnElementoBusqueda = By.xpath(" //div [@class='itm-product-main-info']");
    By txtElementoBusqueda;



    public By getinputBuscador() {
        return inputBuscador;
    }


    public By getBtnElementoBusqueda() {
        return btnElementoBusqueda;
    }

    public By getTxtElementoBusqueda() {
        return txtElementoBusqueda;
    }


    public void setTxtElementoBusqueda(String producto) {
        this.txtElementoBusqueda = By.xpath("//h3[contains(text(),'"+producto+"')]");
    }
}
