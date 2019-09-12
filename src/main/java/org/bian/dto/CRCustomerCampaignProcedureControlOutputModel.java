package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureControlOutputModel
 */
public class CRCustomerCampaignProcedureControlOutputModel   {
  private String customerCampaignProcedureControlActionTaskReference = null;

  private Object customerCampaignProcedureControlActionTaskRecord = null;

  private String customerCampaignProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance control processing service call 
   * @return customerCampaignProcedureControlActionTaskReference
  **/

  public String getCustomerCampaignProcedureControlActionTaskReference() {
    return customerCampaignProcedureControlActionTaskReference;
  }

  public void setCustomerCampaignProcedureControlActionTaskReference(String customerCampaignProcedureControlActionTaskReference) {
    this.customerCampaignProcedureControlActionTaskReference = customerCampaignProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCampaignProcedureControlActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureControlActionTaskRecord() {
    return customerCampaignProcedureControlActionTaskRecord;
  }

  public void setCustomerCampaignProcedureControlActionTaskRecord(Object customerCampaignProcedureControlActionTaskRecord) {
    this.customerCampaignProcedureControlActionTaskRecord = customerCampaignProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerCampaignProcedureControlActionResponse
  **/

  public String getCustomerCampaignProcedureControlActionResponse() {
    return customerCampaignProcedureControlActionResponse;
  }

  public void setCustomerCampaignProcedureControlActionResponse(String customerCampaignProcedureControlActionResponse) {
    this.customerCampaignProcedureControlActionResponse = customerCampaignProcedureControlActionResponse;
  }


}

