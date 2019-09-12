package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureExchangeOutputModel
 */
public class CRCustomerCampaignProcedureExchangeOutputModel   {
  private String customerCampaignProcedureExchangeActionTaskReference = null;

  private Object customerCampaignProcedureExchangeActionTaskRecord = null;

  private String customerCampaignProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance exchange service call 
   * @return customerCampaignProcedureExchangeActionTaskReference
  **/

  public String getCustomerCampaignProcedureExchangeActionTaskReference() {
    return customerCampaignProcedureExchangeActionTaskReference;
  }

  public void setCustomerCampaignProcedureExchangeActionTaskReference(String customerCampaignProcedureExchangeActionTaskReference) {
    this.customerCampaignProcedureExchangeActionTaskReference = customerCampaignProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCampaignProcedureExchangeActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureExchangeActionTaskRecord() {
    return customerCampaignProcedureExchangeActionTaskRecord;
  }

  public void setCustomerCampaignProcedureExchangeActionTaskRecord(Object customerCampaignProcedureExchangeActionTaskRecord) {
    this.customerCampaignProcedureExchangeActionTaskRecord = customerCampaignProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCampaignProcedureExchangeActionResponse
  **/

  public String getCustomerCampaignProcedureExchangeActionResponse() {
    return customerCampaignProcedureExchangeActionResponse;
  }

  public void setCustomerCampaignProcedureExchangeActionResponse(String customerCampaignProcedureExchangeActionResponse) {
    this.customerCampaignProcedureExchangeActionResponse = customerCampaignProcedureExchangeActionResponse;
  }


}

