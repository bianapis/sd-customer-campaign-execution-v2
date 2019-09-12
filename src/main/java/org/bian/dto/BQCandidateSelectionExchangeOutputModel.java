package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionExchangeOutputModel
 */
public class BQCandidateSelectionExchangeOutputModel   {
  private String candidateSelectionExchangeActionTaskReference = null;

  private Object candidateSelectionExchangeActionTaskRecord = null;

  private String candidateSelectionExchangeActionResponse = null;

  private String candidateSelectionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance exchange service call 
   * @return candidateSelectionExchangeActionTaskReference
  **/

  public String getCandidateSelectionExchangeActionTaskReference() {
    return candidateSelectionExchangeActionTaskReference;
  }

  public void setCandidateSelectionExchangeActionTaskReference(String candidateSelectionExchangeActionTaskReference) {
    this.candidateSelectionExchangeActionTaskReference = candidateSelectionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return candidateSelectionExchangeActionResponse
  **/

  public String getCandidateSelectionExchangeActionResponse() {
    return candidateSelectionExchangeActionResponse;
  }

  public void setCandidateSelectionExchangeActionResponse(String candidateSelectionExchangeActionResponse) {
    this.candidateSelectionExchangeActionResponse = candidateSelectionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Candidate Selection instance (e.g. accepted, rejected, verified) 
   * @return candidateSelectionInstanceStatus
  **/

  public String getCandidateSelectionInstanceStatus() {
    return candidateSelectionInstanceStatus;
  }

  public void setCandidateSelectionInstanceStatus(String candidateSelectionInstanceStatus) {
    this.candidateSelectionInstanceStatus = candidateSelectionInstanceStatus;
  }


}

