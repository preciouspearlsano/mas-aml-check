package mas.amlcheck.dto;


import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 * 
 * CustomerFormCommand version : 1.0
 * 
 */
@Data
public class CustomerFormCommand {
	
	//Person
	private String individualTag;
	
	private String firstNameEn;
	private String middleNameEn;
	private String lastNameEn;
	private String dateOfBirth; //yyyy-MM-dd
	private String placeOfBirth;
	private String nationality;
	private String contactNo;
	private String gender;
	private String identificationType;
	private String identificationNo;
	
	private String resAddrRoom;
	private String resAddrFloor;
	private String resAddrBlock;
	private String resAddrLot;
	private String resAddrBuildingName;
	private String resAddrStreet;
	private String resAddrVillage;
	private String resAddrHousingProject;
	private String resAddrDistrict;
	private String resAddrCity;
	private String resAddrCountryCode;
	
	//Company
	private String companyNameEn;
	private String companyType;
	private String companyTelNo;
	private String companyPrimaryContactNo;
	private String companyDateOfIncorporation;
	private String companyCertificationType;
	private String companyCertificationNo;
	private String companyRegistrationType;
	private String companyRegistrationNo;
	
	private String comAddrRoom;
	private String comAddrFloor;
	private String comAddrBlock;
	private String comAddrLot;
	private String comAddrBuildingName;
	private String comAddrStreet;
	private String comAddrVillage;
	private String comAddrHousingProject;
	private String comAddrDistrict;
	private String comAddrCity;
	private String comAddrCountryCode;
	
	private String countryCodeIncorporation;
	private String countryCodeOperation;
	private String authorizedSigners;
	private String legal;
	private String management;
	private String owner;
	private String regulatory;
	
	private String companySourceIncome;
	private String natureOfCompany;
	private String individualSourceIncome;
	private String natureOfIndividualSourceIncome;
	private String role;
	
	private String clientId;
	private String clientAcctId;
	private String clientType; //legalentity or person
	
}
