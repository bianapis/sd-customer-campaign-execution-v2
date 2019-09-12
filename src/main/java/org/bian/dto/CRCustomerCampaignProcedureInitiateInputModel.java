package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureInitiateInputModel
 */
public class CRCustomerCampaignProcedureInitiateInputModel   {
  private String customerCampaignExecutionServicingSessionReference = null;

  private Object customerCampaignProcedureInitiateActionRecord = null;

  private String customerCampaignProcedureInstanceStatus = null;

  private CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;


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

  public CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


}

