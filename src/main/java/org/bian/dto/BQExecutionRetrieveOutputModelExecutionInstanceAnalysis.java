package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionRetrieveOutputModelExecutionInstanceAnalysis
 */
public class BQExecutionRetrieveOutputModelExecutionInstanceAnalysis   {
  private Object executionInstanceAnalysisRecord = null;

  private String executionInstanceAnalysisReportType = null;

  private String executionInstanceAnalysisParameters = null;

  private Object executionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return executionInstanceAnalysisRecord
  **/

  public Object getExecutionInstanceAnalysisRecord() {
    return executionInstanceAnalysisRecord;
  }

  public void setExecutionInstanceAnalysisRecord(Object executionInstanceAnalysisRecord) {
    this.executionInstanceAnalysisRecord = executionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return executionInstanceAnalysisReportType
  **/

  public String getExecutionInstanceAnalysisReportType() {
    return executionInstanceAnalysisReportType;
  }

  public void setExecutionInstanceAnalysisReportType(String executionInstanceAnalysisReportType) {
    this.executionInstanceAnalysisReportType = executionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return executionInstanceAnalysisParameters
  **/

  public String getExecutionInstanceAnalysisParameters() {
    return executionInstanceAnalysisParameters;
  }

  public void setExecutionInstanceAnalysisParameters(String executionInstanceAnalysisParameters) {
    this.executionInstanceAnalysisParameters = executionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return executionInstanceAnalysisReport
  **/

  public Object getExecutionInstanceAnalysisReport() {
    return executionInstanceAnalysisReport;
  }

  public void setExecutionInstanceAnalysisReport(Object executionInstanceAnalysisReport) {
    this.executionInstanceAnalysisReport = executionInstanceAnalysisReport;
  }


}

