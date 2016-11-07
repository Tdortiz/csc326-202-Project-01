package edu.ncsu.csc.itrust.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import edu.ncsu.csc.itrust.controller.officeVisit.OfficeVisitController;
import edu.ncsu.csc.itrust.model.ConverterDAO;
import edu.ncsu.csc.itrust.model.labProcedure.LabProcedureMySQL;
import edu.ncsu.csc.itrust.model.officeVisit.OfficeVisit;
import edu.ncsu.csc.itrust.model.officeVisit.OfficeVisitMySQL;
import edu.ncsu.csc.itrust.model.officeVisit.OfficeVisitValidator;
import edu.ncsu.csc.itrust.model.old.dao.mysql.AuthDAO;
import edu.ncsu.csc.itrust.model.old.dao.mysql.HospitalsDAO;
import edu.ncsu.csc.itrust.model.old.dao.mysql.PatientDAO;
import edu.ncsu.csc.itrust.model.old.dao.mysql.PersonnelDAO;
import edu.ncsu.csc.itrust.unit.datagenerators.TestDataGenerator;
import edu.ncsu.csc.itrust.unit.testutils.TestDAOFactory;
import cucumber.api.java.en.Then;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MaintainStandardsListStepDefs {

	
	private AuthDAO authController;
	private PatientDAO patientController;
	private PatientDataShared sharedPatient;
	private OfficeVisitValidator ovValidator;
	private DataSource ds;
	private OfficeVisitController ovController;
	private OfficeVisit sharedVisit;
	private UserDataShared sharedUser;
	private TestDataGenerator gen;
	private HospitalsDAO hospDAO;
	private PersonnelDAO persDAO;
	private OfficeVisitMySQL oVisSQL;
	private LabProcedureMySQL labPSQL;
	
	public MaintainStandardsListStepDefs(){
		
		
		this.ds = ConverterDAO.getDataSource();
		this.ovController = new OfficeVisitController(ds);
		this.ovValidator = new OfficeVisitValidator(ds);
		this.authController = new AuthDAO(TestDAOFactory.getTestInstance());
		this.patientController = new PatientDAO(TestDAOFactory.getTestInstance());
		this.gen = new TestDataGenerator();
		this.hospDAO = new HospitalsDAO(TestDAOFactory.getTestInstance());
		this.persDAO = new PersonnelDAO(TestDAOFactory.getTestInstance());
		this.oVisSQL = new OfficeVisitMySQL(ds);
		this.labPSQL = new LabProcedureMySQL(ds);
	}
	
	
	@Given("^I load uc15.sql$")
	public void loadSql(){
		try {
			gen.clearAllTables();
			gen.uc15();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("^Admin user MID: (.*) PW: (.*) exists$")
	public void userExists(String id, String pw){
		fail();
	}
	
	@Given("^the tables are empty of cpt codes$")
	public void clearSql(){
		fail();
	}
	
	@When("^I go to view the cpt codes$")
	public void viewCPTCodes(){
		fail();
	}
	
	@When("^Go to the Add CPT/Vaccine code functionality, enter (.*) as the Code, enter (.*) as the name then add the code$")
	public void addCPT(String code, String name){
		fail();
	}
	
	
	@When("^Go to the Update CPT/Vaccine code functionality, update (.*), enter (.*) as the Name and update the code.$")
	public void updateCPT(String code, String name){
		fail();
	}
	
	@When("^Go to the Add ICD Code functionality, input (.*) as the code, input (.*) as the description field, select (.*), and add code.$")
	public void addICD(String code, String description, String chronic){
		fail();
	}
	
	@When("^Select Edit ICD Codes from the sidebar, select (.*) from the list, select (.*), and update Code$")
	public void updateICD(String description, String chronic){
		fail();
	}
	
	@When("^Go to the Add NDC functionality, enter (.*) as the code, enter (.*) as the Name, and Add Code$")
	public void addNDC(String code, String name){
		fail();
	}
	
	@When("^Go to the Update NDC functionality, Select NDC (.*), name to (.*), Update Code$")
	public void updateNDC(String code, String name){
		fail();
	}
	
	@When("^Enter (.*) as the code, (.*) as the Component, (.*) as the property, (.*) as the timing aspect, (.*) as the system, (.*) as the scale type, (.*) as the method type, and Add LOINC$")
	public void addLOINC(String code, String component, String property, String timing, String system, String scale, String method){
		fail();
	}
	
	@When("^Go to the Update LOINC functionality, Select LOINC (.*), update the method type to (.*), and Update LOINC$")
	public void updateLOINC(String code, String method){
		fail();
	}
	
	@When("^I enter (.*) as an icd code$")
	public void failureICDCode(String code){
		fail();
	}
	
	@When("^I add NDC code (.*) with name (.*)$")
	public void addNDCCode(String code, String name){
		fail();
	}
	
	@Then("^There are 0 cpt codes present$")
	public void noCPTCodes(){
		fail();
	}
	
	@Then("^After the user sees a message - Success: (.*) - (.*) and its in the system$")
	public void messageAndInSystem(String code, String name){
		fail();
	}
	
	@Then("^After adding the information the user sees a message - Success: (.*) - (.*) added. it is also (.*)$")
	public void chronic(String code, String name, String chronicYesNo){
		fail();
	}
	
	@Then("^After the update, message displays - Success 1 row updated and (.*) has (.*) selected$")
	public void rowsAndChronic(String code, String chronicYesNo){
		fail();
	}
	
	@Then("^After adding the code the user sees a message - Success: (.*): (.*) added and is in the system$")
	public void addEggplantExtract(String code, String name){
		fail();
	}
	
	@Then("^After the update, the user sees a message - Success! Code (.*): (.*) updated and is in the system$")
	public void updateAcid(String code, String name){
		fail();
	}
	
	@Then("^After adding the code the user sees a message - Success: 66554-3 added and in the system, after adding the code LOINC (.*) has Component (.*), property (.*), timing aspect (.*), system (.*), scale (.*), type (.*)$")
	public void checkLOINCUpdate(String code, String component, String property, String timing, String system, String scale, String type){
		fail();
	}
	
	@Then("^After the update, the user sees a message - Success! Code 66554-4 updated and in the system, after adding the code LOINC (.*) has Component (.*), property (.*), timing aspect (.*), system (.*), scale (.*), type (.*)$")
	public void checkLOINCOtherUpdate(String code, String component, String property, String timing, String system, String scale, String type){
		fail();
	}
	
	@Then("^I get an error because the code is too long and the code is not added$")
	public void errorCodeTooLong(){
		fail();
	}
	
	@Then("^The code already exists and is not added$")
	public void alreadyExistsNotAdded(){
		fail();
	}
	
	@Then("^I clean up all of my data$")
	public void cleanTables(){
		try {
			gen.clearAllTables();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}