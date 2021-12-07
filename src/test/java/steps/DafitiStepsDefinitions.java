package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;
import excel.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class DafitiStepsDefinitions {
    DafitiSteps dafiti = new DafitiSteps();




    @Given("^Navego en Dafiti$")
    public void abrirPagina(){
        dafiti.abrirPagina();

    }
    @When("^Busco los en Dafiti '(.*)'$")
    public void escriboEnElBuscador  (String producto) throws IOException {

        ArrayList<Map<String, String>> listaProductos;
        listaProductos = Excel.leerDatosDeHojaDeExcel(producto,"Hoja1");
        for (Map<String, String> datos: listaProductos){
            System.out.println();
            dafiti.buscarElementoEnDafiti(datos.get("Producto"));
            dafiti.validarProductoDafiti(datos.get("Producto"));
        }



    }

    @Then("^Obtengo y Valido los Resultados$")
    public void validoResultados(){

        GoogleChromeDriver.driver.quit();

    }


}
