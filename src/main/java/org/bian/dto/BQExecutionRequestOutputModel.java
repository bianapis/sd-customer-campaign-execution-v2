package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionRequestInputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionRequestOutputModel
 */
public class BQExecutionRequestOutputModel   {
  private BQExecutionRequestInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private String executionRequestActionTaskReference = null;

  private Object executionRequestActionTaskRecord = null;

  private String executionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionRequestInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionRequestInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance request service call 
   * @return executionRequestActionTaskReference
  **/

  public String getExecutionRequestActionTaskReference() {
    return executionRequestActionTaskReference;
  }

  public void setExecutionRequestActionTaskReference(String executionRequestActionTaskReference) {
    this.executionRequestActionTaskReference = executionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return executionRequestActionTaskRecord
  **/

  public Object getExecutionRequestActionTaskRecord() {
    return executionRequestActionTaskRecord;
  }

  public void setExecutionRequestActionTaskRecord(Object executionRequestActionTaskRecord) {
    this.executionRequestActionTaskRecord = executionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution service request record 
   * @return executionRequestRecordReference
  **/

  public String getExecutionRequestRecordReference() {
    return executionRequestRecordReference;
  }

  public void setExecutionRequestRecordReference(String executionRequestRecordReference) {
    this.executionRequestRecordReference = executionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

