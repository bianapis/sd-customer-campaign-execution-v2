package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord;
import org.bian.dto.BQExecutionInitiateOutputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiateOutputModel
 */
public class BQExecutionInitiateOutputModel   {
  private BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  private String executionInstanceReference = null;

  private String executionInitiateActionReference = null;

  private Object executionInitiateActionRecord = null;

  private String executionInstanceStatus = null;

  private BQExecutionInitiateOutputModelExecutionInstanceRecord executionInstanceRecord = null;


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return executionInitiateActionReference
  **/

  public String getExecutionInitiateActionReference() {
    return executionInitiateActionReference;
  }

  public void setExecutionInitiateActionReference(String executionInitiateActionReference) {
    this.executionInitiateActionReference = executionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return executionInitiateActionRecord
  **/

  public Object getExecutionInitiateActionRecord() {
    return executionInitiateActionRecord;
  }

  public void setExecutionInitiateActionRecord(Object executionInitiateActionRecord) {
    this.executionInitiateActionRecord = executionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Execution instance (e.g. initialised, pending, active) 
   * @return executionInstanceStatus
  **/

  public String getExecutionInstanceStatus() {
    return executionInstanceStatus;
  }

  public void setExecutionInstanceStatus(String executionInstanceStatus) {
    this.executionInstanceStatus = executionInstanceStatus;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionInitiateOutputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionInitiateOutputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


}

