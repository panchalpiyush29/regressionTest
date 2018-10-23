package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {
    @Given("^I am on the google homepage$")
    public void iAmOnTheGoogleHomepage() {
        open("http://www.google.com");

    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchText) {
        $(By.name("q")).setValue(searchText).pressEnter();
    }

    @Then("^I get my \"([^\"]*)\"$")
    public void iGetMy(String expectedTitle) {
        title().compareToIgnoreCase(expectedTitle);
    }
}
