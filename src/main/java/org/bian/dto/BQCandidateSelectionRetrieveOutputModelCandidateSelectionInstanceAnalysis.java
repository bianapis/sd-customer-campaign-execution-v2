package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis
 */
public class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis   {
  private Object candidateSelectionInstanceAnalysisRecord = null;

  private String candidateSelectionInstanceAnalysisReportType = null;

  private String candidateSelectionInstanceAnalysisParameters = null;

  private Object candidateSelectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return candidateSelectionInstanceAnalysisRecord
  **/

  public Object getCandidateSelectionInstanceAnalysisRecord() {
    return candidateSelectionInstanceAnalysisRecord;
  }

  public void setCandidateSelectionInstanceAnalysisRecord(Object candidateSelectionInstanceAnalysisRecord) {
    this.candidateSelectionInstanceAnalysisRecord = candidateSelectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return candidateSelectionInstanceAnalysisReportType
  **/

  public String getCandidateSelectionInstanceAnalysisReportType() {
    return candidateSelectionInstanceAnalysisReportType;
  }

  public void setCandidateSelectionInstanceAnalysisReportType(String candidateSelectionInstanceAnalysisReportType) {
    this.candidateSelectionInstanceAnalysisReportType = candidateSelectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return candidateSelectionInstanceAnalysisParameters
  **/

  public String getCandidateSelectionInstanceAnalysisParameters() {
    return candidateSelectionInstanceAnalysisParameters;
  }

  public void setCandidateSelectionInstanceAnalysisParameters(String candidateSelectionInstanceAnalysisParameters) {
    this.candidateSelectionInstanceAnalysisParameters = candidateSelectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return candidateSelectionInstanceAnalysisReport
  **/

  public Object getCandidateSelectionInstanceAnalysisReport() {
    return candidateSelectionInstanceAnalysisReport;
  }

  public void setCandidateSelectionInstanceAnalysisReport(Object candidateSelectionInstanceAnalysisReport) {
    this.candidateSelectionInstanceAnalysisReport = candidateSelectionInstanceAnalysisReport;
  }


}

