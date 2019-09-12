package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult
 */
public class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult   {
  private String customerCampaignProcedureLeadOpportunityDescription = null;

  private String leadOpportunityProcedureInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of leads and opportunities generated by the customer campaign 
   * @return customerCampaignProcedureLeadOpportunityDescription
  **/

  public String getCustomerCampaignProcedureLeadOpportunityDescription() {
    return customerCampaignProcedureLeadOpportunityDescription;
  }

  public void setCustomerCampaignProcedureLeadOpportunityDescription(String customerCampaignProcedureLeadOpportunityDescription) {
    this.customerCampaignProcedureLeadOpportunityDescription = customerCampaignProcedureLeadOpportunityDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the lead/opportunity as handled by the Lead/Opportunity Management Service Domain 
   * @return leadOpportunityProcedureInstanceReference
  **/

  public String getLeadOpportunityProcedureInstanceReference() {
    return leadOpportunityProcedureInstanceReference;
  }

  public void setLeadOpportunityProcedureInstanceReference(String leadOpportunityProcedureInstanceReference) {
    this.leadOpportunityProcedureInstanceReference = leadOpportunityProcedureInstanceReference;
  }


}

