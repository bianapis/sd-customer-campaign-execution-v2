package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionRetrieveInputModelExecutionInstanceAnalysis;
import org.bian.dto.BQExecutionRetrieveInputModelExecutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExecutionRetrieveInputModel
 */
public class BQExecutionRetrieveInputModel   {
  private Object executionRetrieveActionTaskRecord = null;

  private String executionRetrieveActionRequest = null;

  private BQExecutionRetrieveInputModelExecutionInstanceReport executionInstanceReport = null;

  private BQExecutionRetrieveInputModelExecutionInstanceAnalysis executionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return executionRetrieveActionTaskRecord
  **/

  public Object getExecutionRetrieveActionTaskRecord() {
    return executionRetrieveActionTaskRecord;
  }

  public void setExecutionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return executionRetrieveActionRequest
  **/

  public String getExecutionRetrieveActionRequest() {
    return executionRetrieveActionRequest;
  }

  public void setExecutionRetrieveActionRequest(String executionRetrieveActionRequest) {
    this.executionRetrieveActionRequest = executionRetrieveActionRequest;
  }


  /**
   * Get executionInstanceReport
   * @return executionInstanceReport
  **/

  public BQExecutionRetrieveInputModelExecutionInstanceReport getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(BQExecutionRetrieveInputModelExecutionInstanceReport executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }


  /**
   * Get executionInstanceAnalysis
   * @return executionInstanceAnalysis
  **/

  public BQExecutionRetrieveInputModelExecutionInstanceAnalysis getExecutionInstanceAnalysis() {
    return executionInstanceAnalysis;
  }

  public void setExecutionInstanceAnalysis(BQExecutionRetrieveInputModelExecutionInstanceAnalysis executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
  }


}

