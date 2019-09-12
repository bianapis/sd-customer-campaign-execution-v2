package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis;
import org.bian.dto.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord;
import org.bian.dto.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport;
import org.bian.dto.BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionRetrieveOutputModel
 */
public class BQCandidateSelectionRetrieveOutputModel   {
  private BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord candidateSelectionInstanceRecord = null;

  private String candidateSelectionRetrieveActionTaskReference = null;

  private Object candidateSelectionRetrieveActionTaskRecord = null;

  private String candidateSelectionRetrieveActionResponse = null;

  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport candidateSelectionInstanceReport = null;

  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis candidateSelectionInstanceAnalysis = null;


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  /**
   * Get candidateSelectionInstanceRecord
   * @return candidateSelectionInstanceRecord
  **/

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord getCandidateSelectionInstanceRecord() {
    return candidateSelectionInstanceRecord;
  }

  public void setCandidateSelectionInstanceRecord(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance retrieve service call 
   * @return candidateSelectionRetrieveActionTaskReference
  **/

  public String getCandidateSelectionRetrieveActionTaskReference() {
    return candidateSelectionRetrieveActionTaskReference;
  }

  public void setCandidateSelectionRetrieveActionTaskReference(String candidateSelectionRetrieveActionTaskReference) {
    this.candidateSelectionRetrieveActionTaskReference = candidateSelectionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return candidateSelectionRetrieveActionTaskRecord
  **/

  public Object getCandidateSelectionRetrieveActionTaskRecord() {
    return candidateSelectionRetrieveActionTaskRecord;
  }

  public void setCandidateSelectionRetrieveActionTaskRecord(Object candidateSelectionRetrieveActionTaskRecord) {
    this.candidateSelectionRetrieveActionTaskRecord = candidateSelectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return candidateSelectionRetrieveActionResponse
  **/

  public String getCandidateSelectionRetrieveActionResponse() {
    return candidateSelectionRetrieveActionResponse;
  }

  public void setCandidateSelectionRetrieveActionResponse(String candidateSelectionRetrieveActionResponse) {
    this.candidateSelectionRetrieveActionResponse = candidateSelectionRetrieveActionResponse;
  }


  /**
   * Get candidateSelectionInstanceReport
   * @return candidateSelectionInstanceReport
  **/

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }


  /**
   * Get candidateSelectionInstanceAnalysis
   * @return candidateSelectionInstanceAnalysis
  **/

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis getCandidateSelectionInstanceAnalysis() {
    return candidateSelectionInstanceAnalysis;
  }

  public void setCandidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis candidateSelectionInstanceAnalysis) {
    this.candidateSelectionInstanceAnalysis = candidateSelectionInstanceAnalysis;
  }


}

