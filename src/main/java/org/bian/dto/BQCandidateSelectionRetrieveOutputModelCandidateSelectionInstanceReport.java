package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport
 */
public class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport   {
  private Object candidateSelectionInstanceReportRecord = null;

  private String candidateSelectionInstanceReportType = null;

  private String candidateSelectionInstanceReportParameters = null;

  private Object candidateSelectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return candidateSelectionInstanceReportRecord
  **/

  public Object getCandidateSelectionInstanceReportRecord() {
    return candidateSelectionInstanceReportRecord;
  }

  public void setCandidateSelectionInstanceReportRecord(Object candidateSelectionInstanceReportRecord) {
    this.candidateSelectionInstanceReportRecord = candidateSelectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return candidateSelectionInstanceReportType
  **/

  public String getCandidateSelectionInstanceReportType() {
    return candidateSelectionInstanceReportType;
  }

  public void setCandidateSelectionInstanceReportType(String candidateSelectionInstanceReportType) {
    this.candidateSelectionInstanceReportType = candidateSelectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return candidateSelectionInstanceReportParameters
  **/

  public String getCandidateSelectionInstanceReportParameters() {
    return candidateSelectionInstanceReportParameters;
  }

  public void setCandidateSelectionInstanceReportParameters(String candidateSelectionInstanceReportParameters) {
    this.candidateSelectionInstanceReportParameters = candidateSelectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return candidateSelectionInstanceReport
  **/

  public Object getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(Object candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }


}

