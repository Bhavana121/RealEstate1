Feature: Login

  Background: Verify login with valid credentials
    Given Initialize the browser with chrome
    And Navigate to  "http://realty-real-estatem1.upskills.in/my-profile/" site
    And Click on Login link in home page to land on Secure sign in Page
    When I entered valid mohankrishna176@gmail.com and valid Secret@123&& logs in
    Then Click on signin button
    And click on profilesection

  @admincolor
  Scenario: Functionality of Admin color scheme
    Given User is in Profile section
    When click on Default color options
    And click on blue color scheme
    And click on Ectoplasm color option
    Then check the color is changed
    And click on the check boxes

  @namedetails
  Scenario: Updating the Name details
    Given User is in Name details
    Then Enter name details
    And Using dropdown to display name

  @addressdetails
  Scenario: Customer billing address & customer shipping address
    Given User is in billing address details
    When Enter all address related details
    Then Use Autosuggesion to enter country name
    And use Autosuggesion to enter state name
    And use copy button to copy billing address as shipping
    Then billing and shipping address is entered

  @updateprofile
  Scenario: Updating the profile
    Given user details are filled
    When click on update profile button
    Then profile will be updated

  @logout
  Scenario: Logout from the section
    Given User get logout from the section
    When move the cursor on profile section
    Then click on logout option
