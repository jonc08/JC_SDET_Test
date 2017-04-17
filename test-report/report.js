$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Placing-a-bet.feature");
formatter.feature({
  "line": 1,
  "name": "Placing a bet",
  "description": "",
  "id": "placing-a-bet",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "The one where I place a bet and I have a credit balance",
  "description": "",
  "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I login with username: \"\u003cusername\u003e\" and password: \"\u003cpassword\u003e\" and I have a credit balance on my account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select a sport: \"\u003csport\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a bet: \"\u003cbet\u003e\" for the first active bet",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get an indication of a return value",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should get an indication of the total bet: \"\u003cbet\u003e\" amount",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "my balance is reduced by the bet: \"\u003cbet\u003e\" amount",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "sport",
        "bet"
      ],
      "line": 13,
      "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;;1"
    },
    {
      "cells": [
        "WHATA_FOG2",
        "F0gUaTtest",
        "football",
        "0.05"
      ],
      "line": 14,
      "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;;2"
    },
    {
      "cells": [
        "WHATA_FOG2",
        "F0gUaTtest",
        "tennis",
        "0.05"
      ],
      "line": 15,
      "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6362796422,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "The one where I place a bet and I have a credit balance",
  "description": "",
  "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I login with username: \"WHATA_FOG2\" and password: \"F0gUaTtest\" and I have a credit balance on my account",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select a sport: \"football\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a bet: \"0.05\" for the first active bet",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get an indication of a return value",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should get an indication of the total bet: \"0.05\" amount",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "my balance is reduced by the bet: \"0.05\" amount",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "WHATA_FOG2",
      "offset": 24
    },
    {
      "val": "F0gUaTtest",
      "offset": 51
    }
  ],
  "location": "PlacingABetStepDefinitions.iLoginWithAndAndIHaveACreditBalanceOnMyAccount(String,String)"
});
formatter.result({
  "duration": 17732247102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "football",
      "offset": 19
    }
  ],
  "location": "PlacingABetStepDefinitions.iSelectA(String)"
});
formatter.result({
  "duration": 2171728621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 16
    }
  ],
  "location": "PlacingABetStepDefinitions.iEnterABetForTheFirstActiveBet(String)"
});
formatter.result({
  "duration": 19333446092,
  "status": "passed"
});
formatter.match({
  "location": "PlacingABetStepDefinitions.iShouldGetAnIndicationOfAReturnValue()"
});
formatter.result({
  "duration": 1091052776,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 46
    }
  ],
  "location": "PlacingABetStepDefinitions.iShouldGetAnIndicationOfTheTotalAmount(double)"
});
formatter.result({
  "duration": 21072843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 35
    }
  ],
  "location": "PlacingABetStepDefinitions.myBalanceIsReducedByTheAmount(double)"
});
formatter.result({
  "duration": 17777530,
  "error_message": "java.lang.AssertionError: ASSERTION FAILED: Balance is not reduced\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.steps.PlacingABetStepDefinitions.myBalanceIsReducedByTheAmount(PlacingABetStepDefinitions.java:162)\r\n\tat ✽.And my balance is reduced by the bet: \"0.05\" amount(Placing-a-bet.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1161474027,
  "status": "passed"
});
formatter.before({
  "duration": 5785392490,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "The one where I place a bet and I have a credit balance",
  "description": "",
  "id": "placing-a-bet;the-one-where-i-place-a-bet-and-i-have-a-credit-balance;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I login with username: \"WHATA_FOG2\" and password: \"F0gUaTtest\" and I have a credit balance on my account",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select a sport: \"tennis\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a bet: \"0.05\" for the first active bet",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get an indication of a return value",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should get an indication of the total bet: \"0.05\" amount",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "my balance is reduced by the bet: \"0.05\" amount",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "WHATA_FOG2",
      "offset": 24
    },
    {
      "val": "F0gUaTtest",
      "offset": 51
    }
  ],
  "location": "PlacingABetStepDefinitions.iLoginWithAndAndIHaveACreditBalanceOnMyAccount(String,String)"
});
formatter.result({
  "duration": 17560417492,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tennis",
      "offset": 19
    }
  ],
  "location": "PlacingABetStepDefinitions.iSelectA(String)"
});
formatter.result({
  "duration": 2158131504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 16
    }
  ],
  "location": "PlacingABetStepDefinitions.iEnterABetForTheFirstActiveBet(String)"
});
formatter.result({
  "duration": 19374188590,
  "status": "passed"
});
formatter.match({
  "location": "PlacingABetStepDefinitions.iShouldGetAnIndicationOfAReturnValue()"
});
formatter.result({
  "duration": 1113497605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 46
    }
  ],
  "location": "PlacingABetStepDefinitions.iShouldGetAnIndicationOfTheTotalAmount(double)"
});
formatter.result({
  "duration": 20340049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 35
    }
  ],
  "location": "PlacingABetStepDefinitions.myBalanceIsReducedByTheAmount(double)"
});
formatter.result({
  "duration": 17065262,
  "status": "passed"
});
formatter.after({
  "duration": 1191711099,
  "status": "passed"
});
});