package shouty;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    Person lucy = new Person();
    Person sean = new Person();
    private String seanMessage;

    @Given("^Lucy is (\\d+) meters from Sean$")
    public void lucy_is_meters_from_Sean(int distance) {
        lucy.setLocation(distance);
        sean.setLocation(0);
    }

    @When("^Sean shouts \"([^\"]*)\"$")
    public void sean_shouts_Free_bagels(String message) {
        lucy.hearMessage(sean.shout(message));
        seanMessage = message;
    }

    @Then("^Lucy hears Sean’s message$")
    public void lucy_hears_Sean_s_message() {
        assertEquals(asList(seanMessage), lucy.getMessageHeard());
    }

    @Given("^Lucy shouts back to (\\w+)$")
    public void lucy_shouts_back_to_X(String name) {
    }

    @Given("^Sarah has (\\d+) cucumbers in her bag$")
    public void sarah_has_n_cucumbers_in_her_bag(int number) {
    }

    @Given("Sarah buys (no|\\d+) cucumbers")
    public void sarah_buys_n_cucumbers(Object val) {
    }

}
