#Author: mmackre
# 
#
#
Feature: Maintain Standards list 
As a system
I want to be able to maintain lists of codes
So they can be used in iTrust

Scenario: BlackBoxNoExistingCPTs
Given Admin user MID: 9000000001 PW: pw exists
And the tables are empty of cpt codes
When I login as 9000000001 using pw
And I go to view the cpt codes
Then There are 0 cpt codes present

Scenario: EnterNewVaccineCPTCode
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Go to the Add CPT/Vaccine code functionality, enter 90466 as the Code, enter Nasopharyngitis Immunization as the name then add the code
Then After the user sees a message - Success: 90466 - Nasopharyngitis Immunization and its in the system

Scenario: UpdateNameExistingVaccineCPTCode
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Go to the Update CPT/Vaccine code functionality, update 90467, enter Hepatitis E Immunization as the Name and update the code.
Then After the user sees a message - Success: 90467 - Hepatitis E Immunization and its in the system



Scenario: EnterNewICDCode
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When Go to the Add ICD Code functionality, input U20 as the code, input Wagagai Virus as the description field, select Chronic?, and add code.
Then After adding the information the user sees a message - Success: U20 - Wagagai Virus added. it is also Chronic

Scenario: UpdateICDCode_ChronicUncheck
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Select Edit ICD Codes from the sidebar, select Makena Syndrome from the list, select Chronic?, and update Code
Then After the update, message displays - Success 1 row updated and UC21 has Chronic selected


Scenario: EnterNewNDC
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Go to the Add NDC functionality, enter 12345-6789 as the code, enter Eggplant Extract as the Name, and Add Code
When After adding the code the user sees a message - Success: 12345-6789: Eggplant Extract added and is in the system

Scenario: UpdateIDNDC
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Go to the Update NDC functionality, Select NDC 081096, name to acetylsalicylic acid, Update Code
When After the update, the user sees a message - Success! Code 608109688: acetylsalicylic acid updated and is in the system



Scenario: AddLOINC
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Enter 66554-3 as the code, Kryptonite as the Component, PrThr as the property, Pt as the timing aspect, Hair as the system, Ord as the scale type, Screen as the method type, and Add LOINC
Then After adding the code the user sees a message - Success: 66554-3 added and in the system, after adding the code LOINC 66554-3 has Component Kryptonite, property PrThr, timing aspect Pt, system Hair, scale Ord, type Screen

Scenario: UpdateMethodLOINC
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And Go to the Update LOINC functionality, Select LOINC 66554-4, update the method type to Confirm, and Update LOINC
Then After the update, the user sees a message - Success! Code 66554-4 updated and in the system, after adding the code LOINC 66554-3 has Component Kryptonite, property PrThr, timing aspect Pt, system Hair, scale Ord, type Screen


Scenario: BlackBoxInvalidICDCode
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And I enter 1234567891011121314 as an icd code
Then I get an error because the code is too long and the code is not added

Scenario: BlackBoxCodeAlreadyExists
Given I load uc15.sql
Given Admin user MID: 9000000001 PW: pw exists
When I login as 9000000001 using pw
And I add NDC code 081096 with name Aspirin
Then The code already exists and is not added
And I clean up all of my data






