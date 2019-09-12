package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureInitiateOutputModel
 */
public class CRCustomerCampaignProcedureInitiateOutputModel   {
  private String customerCampaignProcedureInstanceReference = null;

  private String customerCampaignProcedureInitiateActionReference = null;

  private Object customerCampaignProcedureInitiateActionRecord = null;

  private String customerCampaignProcedureInstanceStatus = null;

  private CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerCampaignProcedureInitiateActionReference
  **/

  public String getCustomerCampaignProcedureInitiateActionReference() {
    return customerCampaignProcedureInitiateActionReference;
  }

  public void setCustomerCampaignProcedureInitiateActionReference(String customerCampaignProcedureInitiateActionReference) {
    this.customerCampaignProcedureInitiateActionReference = customerCampaignProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCampaignProcedureInitiateActionRecord
  **/

  public Object getCustomerCampaignProcedureInitiateActionRecord() {
    return customerCampaignProcedureInitiateActionRecord;
  }

  public void setCustomerCampaignProcedureInitiateActionRecord(Object customerCampaignProcedureInitiateActionRecord) {
    this.customerCampaignProcedureInitiateActionRecord = customerCampaignProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Procedure instance (e.g. initialised, pending, active) 
   * @return customerCampaignProcedureInstanceStatus
  **/

  public String getCustomerCampaignProcedureInstanceStatus() {
    return customerCampaignProcedureInstanceStatus;
  }

  public void setCustomerCampaignProcedureInstanceStatus(String customerCampaignProcedureInstanceStatus) {
    this.customerCampaignProcedureInstanceStatus = customerCampaignProcedureInstanceStatus;
  }


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


}

