package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory
 */
public class CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory   {
  private String customerCampaignConsumableType = null;

  private String customerCampaignConsumableHolding = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of consumable item associated with the campaign (e.g. gift, brochure) 
   * @return customerCampaignConsumableType
  **/

  public String getCustomerCampaignConsumableType() {
    return customerCampaignConsumableType;
  }

  public void setCustomerCampaignConsumableType(String customerCampaignConsumableType) {
    this.customerCampaignConsumableType = customerCampaignConsumableType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked inventory of the consumable item 
   * @return customerCampaignConsumableHolding
  **/

  public String getCustomerCampaignConsumableHolding() {
    return customerCampaignConsumableHolding;
  }

  public void setCustomerCampaignConsumableHolding(String customerCampaignConsumableHolding) {
    this.customerCampaignConsumableHolding = customerCampaignConsumableHolding;
  }


}

