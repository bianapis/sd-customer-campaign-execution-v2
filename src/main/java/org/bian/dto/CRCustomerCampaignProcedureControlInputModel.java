package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureControlInputModelCustomerCampaignProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureControlInputModel
 */
public class CRCustomerCampaignProcedureControlInputModel   {
  private String customerCampaignExecutionServicingSessionReference = null;

  private String customerCampaignProcedureInstanceReference = null;

  private Object customerCampaignProcedureControlActionTaskRecord = null;

  private CRCustomerCampaignProcedureControlInputModelCustomerCampaignProcedureControlActionRequest customerCampaignProcedureControlActionRequest = null;


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
   * Get customerCampaignProcedureControlActionRequest
   * @return customerCampaignProcedureControlActionRequest
  **/

  public CRCustomerCampaignProcedureControlInputModelCustomerCampaignProcedureControlActionRequest getCustomerCampaignProcedureControlActionRequest() {
    return customerCampaignProcedureControlActionRequest;
  }

  public void setCustomerCampaignProcedureControlActionRequest(CRCustomerCampaignProcedureControlInputModelCustomerCampaignProcedureControlActionRequest customerCampaignProcedureControlActionRequest) {
    this.customerCampaignProcedureControlActionRequest = customerCampaignProcedureControlActionRequest;
  }


}

