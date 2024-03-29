package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord
 */
public class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord   {
  private String customerCampaignProcedureInstanceReportReference = null;

  private String customerCampaignProcedureInstanceReportType = null;

  private String customerCampaignProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCampaignProcedureInstanceReportReference
  **/

  public String getCustomerCampaignProcedureInstanceReportReference() {
    return customerCampaignProcedureInstanceReportReference;
  }

  public void setCustomerCampaignProcedureInstanceReportReference(String customerCampaignProcedureInstanceReportReference) {
    this.customerCampaignProcedureInstanceReportReference = customerCampaignProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCampaignProcedureInstanceReportType
  **/

  public String getCustomerCampaignProcedureInstanceReportType() {
    return customerCampaignProcedureInstanceReportType;
  }

  public void setCustomerCampaignProcedureInstanceReportType(String customerCampaignProcedureInstanceReportType) {
    this.customerCampaignProcedureInstanceReportType = customerCampaignProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCampaignProcedureInstanceReportParameters
  **/

  public String getCustomerCampaignProcedureInstanceReportParameters() {
    return customerCampaignProcedureInstanceReportParameters;
  }

  public void setCustomerCampaignProcedureInstanceReportParameters(String customerCampaignProcedureInstanceReportParameters) {
    this.customerCampaignProcedureInstanceReportParameters = customerCampaignProcedureInstanceReportParameters;
  }


}

