package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureExchangeInputModel
 */
public class CRCustomerCampaignProcedureExchangeInputModel   {
  private String customerCampaignExecutionServicingSessionReference = null;

  private String customerCampaignProcedureInstanceReference = null;

  private Object customerCampaignProcedureExchangeActionTaskRecord = null;

  private CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest customerCampaignProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/

  public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/

  public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
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
   * Get customerCampaignProcedureExchangeActionRequest
   * @return customerCampaignProcedureExchangeActionRequest
  **/

  public CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest getCustomerCampaignProcedureExchangeActionRequest() {
    return customerCampaignProcedureExchangeActionRequest;
  }

  public void setCustomerCampaignProcedureExchangeActionRequest(CRCustomerCampaignProcedureExchangeInputModelCustomerCampaignProcedureExchangeActionRequest customerCampaignProcedureExchangeActionRequest) {
    this.customerCampaignProcedureExchangeActionRequest = customerCampaignProcedureExchangeActionRequest;
  }


}

