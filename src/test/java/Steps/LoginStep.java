package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("I navigate to the login page \n");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheUsernameAndPassword(DataTable table) throws Throwable {

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("I enter the username as '" + user.userName + "' and password as '" + user.password + "' \n");
        }

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

        System.out.println("I click login button \n");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        System.out.println("I should see the userform page \n");
    }

    @And("^I enter the ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUsernameAndPassword(String username,  String password) throws Throwable  {
        System.out.println("I enter the username as '" + username + "' and password as '" + password + "' \n");
    }

    static class User {

        public String userName;
        public String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }
}
