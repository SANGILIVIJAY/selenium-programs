Feature:Test skillrary
Scenario:To Test login functionality
Given I should go to the login page
When Enter the username "admin"
And Enter the password "admin"
And Click on the login button
And I should see the username as "SkillRary Ecommerce"
And Click on the username
And Click on the signout
Then I should go skillrary homepage as "SkillRary Courses"