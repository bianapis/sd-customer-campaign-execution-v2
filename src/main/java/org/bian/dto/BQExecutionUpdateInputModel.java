package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionUpdateInputModelCustomerCampaignProcedureInstanceRecord;
import org.bian.dto.BQExecutionUpdateInputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionUpdateInputModel
 */
public class BQExecutionUpdateInputModel   {
  private BQExecutionUpdateInputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  private String customerCampaignProcedureInstanceReference = null;

  private String executionInstanceReference = null;

  private BQExecutionUpdateInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private Object executionUpdateActionTaskRecord = null;

  private String executionUpdateActionRequest = null;


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public BQExecutionUpdateInputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionUpdateInputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/

  public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/

  public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionUpdateInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionUpdateInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return executionUpdateActionTaskRecord
  **/

  public Object getExecutionUpdateActionTaskRecord() {
    return executionUpdateActionTaskRecord;
  }

  public void setExecutionUpdateActionTaskRecord(Object executionUpdateActionTaskRecord) {
    this.executionUpdateActionTaskRecord = executionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return executionUpdateActionRequest
  **/

  public String getExecutionUpdateActionRequest() {
    return executionUpdateActionRequest;
  }

  public void setExecutionUpdateActionRequest(String executionUpdateActionRequest) {
    this.executionUpdateActionRequest = executionUpdateActionRequest;
  }


}

