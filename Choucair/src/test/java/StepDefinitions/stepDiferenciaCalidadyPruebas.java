package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class stepDiferenciaCalidadyPruebas {

    WebDriver driver = null;

    @Given("que Alejandra se encuentra en la pagina de empleos de Choucair testing")
    public void que_alejandra_se_encuentra_en_la_pagina_de_empleos_de_choucair_testing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\webdrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @When("seleccione Diferencia entre calidad de software y pruebas")
    public void seleccione_diferencia_entre_calidad_de_software_y_pruebas() {

        WebElement elementoDiferencia = driver.findElement(By.linkText("Calidad de software"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions a = new Actions(driver); //Scroll para tener visibilidad del link haciendo uso de la clase Actions
        a.moveToElement(elementoDiferencia);
        a.perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Diferencia entre calidad de software y pruebas")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("debe ser dirigida a la pagina correcta")
    public void debe_ser_dirigida_a_la_pagina_correcta() throws InterruptedException{

        driver.getPageSource().contains("Software Engineering Resources");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}
