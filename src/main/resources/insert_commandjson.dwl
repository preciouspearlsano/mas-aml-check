%dw 2.0
output application/dw
---
{
	id : vars.getCustomId.uuid,
	individualTag : payload.individualTag,
	
	firstNameEn : payload.firstNameEn,
	middleNameEn : payload.middleNameEn,
	lastNameEn : payload.lastNameEn,
	dateOfBirth : payload.dateOfBirth, 
	placeOfBirth : payload.placeOfBirth,
	nationality : payload.nationality,
	contactNo : payload.contactNo,
	gender : payload.gender,
	identificationType : payload.identificationType,
	identificationNo : payload.identificationNo,
	
	resAddrRoom : payload.resAddrRoom,
	resAddrFloor : payload.resAddrFloor,
	resAddrBlock : payload.resAddrBlock,
	resAddrLot : payload.resAddrLot,
	resAddrBuildingName : payload.resAddrBuildingName,
	resAddrStreet : payload.resAddrStreet,
	resAddrVillage : payload.resAddrVillage,
	resAddrHousingProject : payload.resAddrHousingProject,
	resAddrDistrict : payload.resAddrDistrict,
	resAddrCity : payload.resAddrCity,
	resAddrCountryCode : payload.resAddrCountryCode,
	

	companyNameEn : payload.companyNameEn,
	companyType : payload.companyType,
	companyTelNo : payload.companyTelNo,
	companyPrimaryContactNo : payload.companyPrimaryContactNo,
	companyDateOfIncorporation : payload.companyDateOfIncorporation,
	companyCertificationType : payload.companyCertificationType,
	companyCertificationNo : payload.companyCertificationNo,
	companyRegistrationType : payload.companyRegistrationType,
	companyRegistrationNo : payload.companyRegistrationNo,
	
	comAddrRoom : payload.comAddrRoom,
	comAddrFloor : payload.comAddrFloor,
	comAddrBlock : payload.comAddrBlock,
	comAddrLot : payload.comAddrLot,
	comAddrBuildingName : payload.comAddrBuildingName,
	comAddrStreet : payload.comAddrStreet,
	comAddrVillage : payload.comAddrVillage,
	comAddrHousingProject : payload.comAddrHousingProject,
	comAddrDistrict : payload.comAddrDistrict,
	comAddrCity : payload.comAddrCity,
	comAddrCountryCode : payload.comAddrCountryCode,
	
	countryCodeIncorporation : payload.countryCodeIncorporation,
	countryCodeOperation : payload.countryCodeOperation,
	authorizedSigners : payload.authorizedSigners,
	legal : payload.legal,
	management : payload.management,
	owner : payload.owner,
	regulatory : payload.regulatory,
	
	companySourceIncome : payload.companySourceIncome,
	natureOfCompany : payload.natureOfCompany,
	individualSourceIncome : payload.individualSourceIncome,
	natureOfIndividualSourceIncome : payload.natureOfIndividualSourceIncome,
	role : payload.role,
	
	clientId : payload.clientId,
	clientAcctId : payload.clientAcctId,
	clientType : payload.clientType, 
	creationDate : vars.getDate
	
}