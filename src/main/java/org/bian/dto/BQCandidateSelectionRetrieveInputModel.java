package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis;
import org.bian.dto.BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionRetrieveInputModel
 */
public class BQCandidateSelectionRetrieveInputModel   {
  private Object candidateSelectionRetrieveActionTaskRecord = null;

  private String candidateSelectionRetrieveActionRequest = null;

  private BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport candidateSelectionInstanceReport = null;

  private BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis candidateSelectionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return candidateSelectionRetrieveActionRequest
  **/

  public String getCandidateSelectionRetrieveActionRequest() {
    return candidateSelectionRetrieveActionRequest;
  }

  public void setCandidateSelectionRetrieveActionRequest(String candidateSelectionRetrieveActionRequest) {
    this.candidateSelectionRetrieveActionRequest = candidateSelectionRetrieveActionRequest;
  }


  /**
   * Get candidateSelectionInstanceReport
   * @return candidateSelectionInstanceReport
  **/

  public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }


  /**
   * Get candidateSelectionInstanceAnalysis
   * @return candidateSelectionInstanceAnalysis
  **/

  public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis getCandidateSelectionInstanceAnalysis() {
    return candidateSelectionInstanceAnalysis;
  }

  public void setCandidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis candidateSelectionInstanceAnalysis) {
    this.candidateSelectionInstanceAnalysis = candidateSelectionInstanceAnalysis;
  }


}

