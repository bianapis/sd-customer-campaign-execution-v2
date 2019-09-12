package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureUpdateOutputModel
 */
public class CRCustomerCampaignProcedureUpdateOutputModel   {
  private String customerCampaignProcedureUpdateActionTaskReference = null;

  private Object customerCampaignProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCampaignProcedureUpdateActionTaskReference
  **/

  public String getCustomerCampaignProcedureUpdateActionTaskReference() {
    return customerCampaignProcedureUpdateActionTaskReference;
  }

  public void setCustomerCampaignProcedureUpdateActionTaskReference(String customerCampaignProcedureUpdateActionTaskReference) {
    this.customerCampaignProcedureUpdateActionTaskReference = customerCampaignProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCampaignProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureUpdateActionTaskRecord() {
    return customerCampaignProcedureUpdateActionTaskRecord;
  }

  public void setCustomerCampaignProcedureUpdateActionTaskRecord(Object customerCampaignProcedureUpdateActionTaskRecord) {
    this.customerCampaignProcedureUpdateActionTaskRecord = customerCampaignProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

