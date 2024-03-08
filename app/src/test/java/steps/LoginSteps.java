package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Data;
import pages.IngresarCaddiePage;
import pages.LoginPage;

public class LoginSteps {
    
    LoginPage login = new LoginPage();
    IngresarCaddiePage vigilante = new IngresarCaddiePage();
    @Given("^I go to Sicagolf$")
    public void goToSicagolf(){
        login.goToSicagolfLogin();
    }
    @When("^I enter my data and log in$")
    public void fillData(){
        login.fillData(Data.vigilanteUser, Data.vigilantePass);
    }
    @Then("^I can see the dashboard$")
    public void validateDashboard(){
        Assert.assertEquals(vigilante.getTextIngresoCaddies(),"Ingreso de caddies");
    }
}
