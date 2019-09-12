package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory
 */
public class CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory   {
  private String customerCampaignConsumableHolding = null;


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

