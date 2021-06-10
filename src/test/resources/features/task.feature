Feature: Insider UI Task

  @smoke
  Scenario: The user should be able to apply for a specific job
    Given Visit https://useinsider.com/ and check Insider home page is opened or not
    And Select “Career” menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not
    Then Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list
    And Check that all jobs’ Position contains “Quality Assurance”, Department contains “Quality Assurance”, Location contains “Istanbul, Turkey”
    When Select one of the positions, check that correct position page is opened, presence of job description, requirements and “Apply for this job” button
    Then Click “Apply for this job” button and check that this action redirects us to Application form page