package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord
 */
public class BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord   {
  private String customerCampaignSelectionCriteria = null;

  private String customerCampaignCandidateEmployeeBusinessUnitReference = null;

  private String customerCampaignCandidateReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the selection criteria used to identify candidate customers 
   * @return customerCampaignSelectionCriteria
  **/

  public String getCustomerCampaignSelectionCriteria() {
    return customerCampaignSelectionCriteria;
  }

  public void setCustomerCampaignSelectionCriteria(String customerCampaignSelectionCriteria) {
    this.customerCampaignSelectionCriteria = customerCampaignSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee or business unit that confirms eligibility of the candidate if appropriate (e.g. the relationship manager) 
   * @return customerCampaignCandidateEmployeeBusinessUnitReference
  **/

  public String getCustomerCampaignCandidateEmployeeBusinessUnitReference() {
    return customerCampaignCandidateEmployeeBusinessUnitReference;
  }

  public void setCustomerCampaignCandidateEmployeeBusinessUnitReference(String customerCampaignCandidateEmployeeBusinessUnitReference) {
    this.customerCampaignCandidateEmployeeBusinessUnitReference = customerCampaignCandidateEmployeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer selected as a candidate 
   * @return customerCampaignCandidateReference
  **/

  public String getCustomerCampaignCandidateReference() {
    return customerCampaignCandidateReference;
  }

  public void setCustomerCampaignCandidateReference(String customerCampaignCandidateReference) {
    this.customerCampaignCandidateReference = customerCampaignCandidateReference;
  }


}

