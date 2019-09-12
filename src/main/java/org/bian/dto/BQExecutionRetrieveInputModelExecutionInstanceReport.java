package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionRetrieveInputModelExecutionInstanceReport
 */
public class BQExecutionRetrieveInputModelExecutionInstanceReport   {
  private String executionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return executionInstanceReportReference
  **/

  public String getExecutionInstanceReportReference() {
    return executionInstanceReportReference;
  }

  public void setExecutionInstanceReportReference(String executionInstanceReportReference) {
    this.executionInstanceReportReference = executionInstanceReportReference;
  }


}

