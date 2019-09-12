package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionExchangeInputModel
 */
public class BQCandidateSelectionExchangeInputModel   {
  private String customerCampaignProcedureInstanceReference = null;

  private String candidateSelectionInstanceReference = null;

  private Object candidateSelectionExchangeActionTaskRecord = null;

  private CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/

  public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance 
   * @return candidateSelectionInstanceReference
  **/

  public String getCandidateSelectionInstanceReference() {
    return candidateSelectionInstanceReference;
  }

  public void setCandidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return candidateSelectionExchangeActionTaskRecord
  **/

  public Object getCandidateSelectionExchangeActionTaskRecord() {
    return candidateSelectionExchangeActionTaskRecord;
  }

  public void setCandidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
  }


  /**
   * Get candidateSelectionExchangeActionRequest
   * @return candidateSelectionExchangeActionRequest
  **/

  public CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest getCandidateSelectionExchangeActionRequest() {
    return candidateSelectionExchangeActionRequest;
  }

  public void setCandidateSelectionExchangeActionRequest(CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest) {
    this.candidateSelectionExchangeActionRequest = candidateSelectionExchangeActionRequest;
  }


}

