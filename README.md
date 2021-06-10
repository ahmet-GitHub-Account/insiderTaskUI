Insider UI Automation Testing & Instructions Prepared by:
Ahmet VURDEM

QA Test Automation Engineer

vurdemahmet@gmail.com

https://www.linkedin.com/in/ahmet-vurdem

- Build Tool: Maven

- Test Framework: JUnit

UI Automation Testing:
https://useinsider.com/

QA:
Generating automation framework for the given task.

System Requirements:

√ Java 8 + SDK

√ Selenium Webdriver

√ Maven

√ JUnit

√ Cucumber Reports

****************************************************************

1) Clone the project

2) Reload maven dependencies from POM

3) Go **src -> test > java > com > insider > runners > CukesRunner

4) To generate "Cucumber Report" ;

* Input following maven command to verify and generate report :
    - mvn clean verify

* Finally, to open the report directly in default browser please run:
    - open target/cucumber-html-reports/overview-features.html

The HTML report of the execution is under :  InsiderTaskUI > target/cucumber-html-reports/overview-features.html

****************************************************************

- Test Otomasyonu - UI

1. Visit https://useinsider.com/ and check Insider home page is opened or not
2. Select “Career” menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not
3. Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list
4. Check that all jobs’ Position contains “Quality Assurance”, Department contains “Quality Assurance”, Location contains “Istanbul, Turkey”
5. Select one of the positions, check that correct position page is opened, presence of job description, requirements and “Apply for this job” button
6. Click “Apply for this job” button and check that this action redirects us to Application form page

Result : 
Every stage of the testing have executed and created Cucumber report.

2021 June®
