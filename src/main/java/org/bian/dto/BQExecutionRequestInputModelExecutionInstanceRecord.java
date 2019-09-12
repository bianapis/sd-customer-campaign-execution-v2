package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionRequestInputModelExecutionInstanceRecord
 */
public class BQExecutionRequestInputModelExecutionInstanceRecord   {
  private String customerCampaignProcedureWorkTaskType = null;

  private String customerCampaignProcedureWorkTaskDescription = null;

  private String customerCampaignProcedureWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String customerCampaignProcedureWorkTaskResult = null;

  private String customerCampaignProcedureWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. execute campaign in contact center) 
   * @return customerCampaignProcedureWorkTaskType
  **/

  public String getCustomerCampaignProcedureWorkTaskType() {
    return customerCampaignProcedureWorkTaskType;
  }

  public void setCustomerCampaignProcedureWorkTaskType(String customerCampaignProcedureWorkTaskType) {
    this.customerCampaignProcedureWorkTaskType = customerCampaignProcedureWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed, includes summary of activities as necessary for reference 
   * @return customerCampaignProcedureWorkTaskDescription
  **/

  public String getCustomerCampaignProcedureWorkTaskDescription() {
    return customerCampaignProcedureWorkTaskDescription;
  }

  public void setCustomerCampaignProcedureWorkTaskDescription(String customerCampaignProcedureWorkTaskDescription) {
    this.customerCampaignProcedureWorkTaskDescription = customerCampaignProcedureWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return customerCampaignProcedureWorkTaskWorkProducts
  **/

  public String getCustomerCampaignProcedureWorkTaskWorkProducts() {
    return customerCampaignProcedureWorkTaskWorkProducts;
  }

  public void setCustomerCampaignProcedureWorkTaskWorkProducts(String customerCampaignProcedureWorkTaskWorkProducts) {
    this.customerCampaignProcedureWorkTaskWorkProducts = customerCampaignProcedureWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - can be the identification of a lead/opportunity 
   * @return customerCampaignProcedureWorkTaskResult
  **/

  public String getCustomerCampaignProcedureWorkTaskResult() {
    return customerCampaignProcedureWorkTaskResult;
  }

  public void setCustomerCampaignProcedureWorkTaskResult(String customerCampaignProcedureWorkTaskResult) {
    this.customerCampaignProcedureWorkTaskResult = customerCampaignProcedureWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the customer campaign execution task is processed 
   * @return customerCampaignProcedureWorkTaskDateTime
  **/

  public String getCustomerCampaignProcedureWorkTaskDateTime() {
    return customerCampaignProcedureWorkTaskDateTime;
  }

  public void setCustomerCampaignProcedureWorkTaskDateTime(String customerCampaignProcedureWorkTaskDateTime) {
    this.customerCampaignProcedureWorkTaskDateTime = customerCampaignProcedureWorkTaskDateTime;
  }


}

