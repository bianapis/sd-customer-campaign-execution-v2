package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRequestOutputModel
 */
public class CRCustomerCampaignProcedureRequestOutputModel   {
  private String customerCampaignProcedureRequestActionTaskReference = null;

  private Object customerCampaignProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance request service call 
   * @return customerCampaignProcedureRequestActionTaskReference
  **/

  public String getCustomerCampaignProcedureRequestActionTaskReference() {
    return customerCampaignProcedureRequestActionTaskReference;
  }

  public void setCustomerCampaignProcedureRequestActionTaskReference(String customerCampaignProcedureRequestActionTaskReference) {
    this.customerCampaignProcedureRequestActionTaskReference = customerCampaignProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignProcedureRequestActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureRequestActionTaskRecord() {
    return customerCampaignProcedureRequestActionTaskRecord;
  }

  public void setCustomerCampaignProcedureRequestActionTaskRecord(Object customerCampaignProcedureRequestActionTaskRecord) {
    this.customerCampaignProcedureRequestActionTaskRecord = customerCampaignProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
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

