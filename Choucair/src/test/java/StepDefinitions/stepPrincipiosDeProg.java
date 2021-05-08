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
public class stepPrincipiosDeProg {

    WebDriver driver = null;

    @Given("que Vanessa se encuentra en la pagina de empleos de Choucair testing")
    public void que_vanessa_se_encuentra_en_la_pagina_de_empleos_de_choucair_testing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\webdrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @When("seleccione Principios de programacion")
    public void seleccione_principios_de_programacion() {
        WebElement elementoPrincipios = driver.findElement(By.xpath("//div[contains(text(),'Distrito Capital, Edificio Office Class, Cra 16a #')]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions a = new Actions(driver); //Scroll para tener visibilidad del link haciendo uso de la clase Actions
        a.moveToElement(elementoPrincipios);
        a.perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(.,'Principios de')]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("debe ser dirigida a la pagina adecuada")
    public void debe_ser_dirigida_a_la_pagina_adecuada() throws InterruptedException{
        driver.getPageSource().contains("desde cero");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}
