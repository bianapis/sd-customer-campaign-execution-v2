package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionRetrieveOutputModelExecutionInstanceReport
 */
public class BQExecutionRetrieveOutputModelExecutionInstanceReport   {
  private Object executionInstanceReportRecord = null;

  private String executionInstanceReportType = null;

  private String executionInstanceReportParameters = null;

  private Object executionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return executionInstanceReportRecord
  **/

  public Object getExecutionInstanceReportRecord() {
    return executionInstanceReportRecord;
  }

  public void setExecutionInstanceReportRecord(Object executionInstanceReportRecord) {
    this.executionInstanceReportRecord = executionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return executionInstanceReportType
  **/

  public String getExecutionInstanceReportType() {
    return executionInstanceReportType;
  }

  public void setExecutionInstanceReportType(String executionInstanceReportType) {
    this.executionInstanceReportType = executionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return executionInstanceReportParameters
  **/

  public String getExecutionInstanceReportParameters() {
    return executionInstanceReportParameters;
  }

  public void setExecutionInstanceReportParameters(String executionInstanceReportParameters) {
    this.executionInstanceReportParameters = executionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return executionInstanceReport
  **/

  public Object getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(Object executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }


}

