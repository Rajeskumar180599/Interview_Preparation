Feature: Risk Assessment

  Scenario Outline: Assess the level of risk according to the responses provided by the user

    Given user is asked <question_1>
    And  user is asked <question_2>
    And  user is asked <question_3>
    And  user is asked <question_4>
    When  user responds "<response_1>" to question 1
    And  user responds "<response_2>" to question 2
    And  user responds "<response_3>" to question 3
    And  user responds "<response_4>" to question 4
    Then  user is categorized as "<risk_level>"

    Examples:
      | question_1                           | question_2                                     | question_3                              | question_4                                       | response_1 | response_2 | response_3 | response_4                | risk_level  |
      | Do you exercise regularly?           | Do you have a family history of heart disease? | Do you maintain a balanced diet?        | Have you ever been diagnosed with hypertension?  | Yes        | No         | Yes        | No                        | Low Risk    |
      | Do you consume alcohol regularly?    | Do you have high cholesterol?                  | Do you have regular health check-ups?   | Have you ever been diagnosed with liver disease? | No         | Yes        | Yes        | No                        | Medium Risk |
      | Do you experience frequent stress?   | Do you smoke?                                  | Do you eat a lot of processed foods?    | Have you ever been diagnosed with lung disease?  | Yes        | No         | No         | Yes, in my lifetime       | Medium Risk |
      | Do you have a sedentary lifestyle?   | Do you have a family history of diabetes?      | Do you monitor your blood sugar levels? | Have you ever been diagnosed with diabetes?      | Yes        | Yes        | Yes        | No                        | High Risk   |
      | Do you have a history of drug abuse? | Do you have a history of mental illness?       | Do you attend regular therapy sessions? | Have you ever attempted suicide?                 | Yes        | Yes        | Yes        | Yes, in the past 3 months | High Risk   |
