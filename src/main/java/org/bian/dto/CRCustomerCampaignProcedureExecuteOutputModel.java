package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureExecuteOutputModel
 */
public class CRCustomerCampaignProcedureExecuteOutputModel   {
  private String customerCampaignProcedureExecuteActionTaskReference = null;

  private Object customerCampaignProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance execute service call 
   * @return customerCampaignProcedureExecuteActionTaskReference
  **/

  public String getCustomerCampaignProcedureExecuteActionTaskReference() {
    return customerCampaignProcedureExecuteActionTaskReference;
  }

  public void setCustomerCampaignProcedureExecuteActionTaskReference(String customerCampaignProcedureExecuteActionTaskReference) {
    this.customerCampaignProcedureExecuteActionTaskReference = customerCampaignProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCampaignProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureExecuteActionTaskRecord() {
    return customerCampaignProcedureExecuteActionTaskRecord;
  }

  public void setCustomerCampaignProcedureExecuteActionTaskRecord(Object customerCampaignProcedureExecuteActionTaskRecord) {
    this.customerCampaignProcedureExecuteActionTaskRecord = customerCampaignProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

