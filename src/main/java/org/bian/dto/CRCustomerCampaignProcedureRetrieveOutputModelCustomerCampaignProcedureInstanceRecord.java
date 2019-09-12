package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory;
import org.bian.dto.CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord
 */
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord   {
  private String customerCampaignType = null;

  private String customerCampaignDescription = null;

  private String employeeBusinessUnitReference = null;

  private String customerCampaignProcedureSetup = null;

  private String customerCampaignProcedureVersionNumber = null;

  private String customerCampaignSchedule = null;

  private CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory = null;

  private CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType dateType = null;

  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult customerCampaignProcedureResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer campaign (e.g. cross-sell, up-sell, retention) 
   * @return customerCampaignType
  **/

  public String getCustomerCampaignType() {
    return customerCampaignType;
  }

  public void setCustomerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return customerCampaignDescription
  **/

  public String getCustomerCampaignDescription() {
    return customerCampaignDescription;
  }

  public void setCustomerCampaignDescription(String customerCampaignDescription) {
    this.customerCampaignDescription = customerCampaignDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference 
   * @return customerCampaignProcedureSetup
  **/

  public String getCustomerCampaignProcedureSetup() {
    return customerCampaignProcedureSetup;
  }

  public void setCustomerCampaignProcedureSetup(String customerCampaignProcedureSetup) {
    this.customerCampaignProcedureSetup = customerCampaignProcedureSetup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer campaign version number used in the event 
   * @return customerCampaignProcedureVersionNumber
  **/

  public String getCustomerCampaignProcedureVersionNumber() {
    return customerCampaignProcedureVersionNumber;
  }

  public void setCustomerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
    this.customerCampaignProcedureVersionNumber = customerCampaignProcedureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The campaign processing schedule, covering candidate selection, execution, flow-up and analysis activities. Note this can be an ongoing campaign where worksteps continue in parallel 
   * @return customerCampaignSchedule
  **/

  public String getCustomerCampaignSchedule() {
    return customerCampaignSchedule;
  }

  public void setCustomerCampaignSchedule(String customerCampaignSchedule) {
    this.customerCampaignSchedule = customerCampaignSchedule;
  }


  /**
   * Get customerCampaignConsumablesInventory
   * @return customerCampaignConsumablesInventory
  **/

  public CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory getCustomerCampaignConsumablesInventory() {
    return customerCampaignConsumablesInventory;
  }

  public void setCustomerCampaignConsumablesInventory(CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory) {
    this.customerCampaignConsumablesInventory = customerCampaignConsumablesInventory;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCustomerCampaignProcedureInitiateInputModelCustomerCampaignProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * Get customerCampaignProcedureResult
   * @return customerCampaignProcedureResult
  **/

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult getCustomerCampaignProcedureResult() {
    return customerCampaignProcedureResult;
  }

  public void setCustomerCampaignProcedureResult(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult customerCampaignProcedureResult) {
    this.customerCampaignProcedureResult = customerCampaignProcedureResult;
  }


}

