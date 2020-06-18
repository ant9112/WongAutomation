#encoding: utf-8

Feature: Add product to shopping car from wong.pe page
  The user want to add products and verify if this product exist in the shopping car.


Scenario Outline:  Add product to shopping car from wong.pe page
    Given the user search the <product> in the home page
    When the user add the product <product> in shopping car
    Then the user should verify the <productExpected> and <amountExpected>
			
			Examples:
			|product        |amountExpected| productExpected |
      |Arroz Superior Valle Norte Primera Cosecha Bolsa 750 g | 1 | Arroz Superior Valle Norte Primera Cosecha Bolsa 750 g |
      |Arroz Superior Wong Bolsa 1 Kg| 1 | Arroz Superior Wong Bolsa 1 Kg |
      