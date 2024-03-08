package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IngresarCaddiePage;

public class IngresarCaddieSteps {
    IngresarCaddiePage ingreso = new IngresarCaddiePage();
    @Given("^I am in the vigilante dashboard$")
    public void vigilanteDashboard(){
        ingreso.getTextIngresoCaddies();

    }
    @When("I write the caddy {word}")
    public void writeCaddyDocument(String document){
        ingreso.ingresarCaddie(document);
    }
    @Then("^They have access to the club$")
    public void validateAccess(){
        
        Assert.assertEquals(ingreso.getTextCaddieIngresado(), "Caddie ingresado correctamente");
    }
    
}
