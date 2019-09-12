package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis
 */
public class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis   {
  private String customerCampaignProcedureInstanceAnalysisReference = null;

  private String customerCampaignProcedureInstanceAnalysisReportType = null;

  private String customerCampaignProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCampaignProcedureInstanceAnalysisReference
  **/

  public String getCustomerCampaignProcedureInstanceAnalysisReference() {
    return customerCampaignProcedureInstanceAnalysisReference;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReference(String customerCampaignProcedureInstanceAnalysisReference) {
    this.customerCampaignProcedureInstanceAnalysisReference = customerCampaignProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCampaignProcedureInstanceAnalysisReportType
  **/

  public String getCustomerCampaignProcedureInstanceAnalysisReportType() {
    return customerCampaignProcedureInstanceAnalysisReportType;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReportType(String customerCampaignProcedureInstanceAnalysisReportType) {
    this.customerCampaignProcedureInstanceAnalysisReportType = customerCampaignProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCampaignProcedureInstanceAnalysisParameters
  **/

  public String getCustomerCampaignProcedureInstanceAnalysisParameters() {
    return customerCampaignProcedureInstanceAnalysisParameters;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisParameters(String customerCampaignProcedureInstanceAnalysisParameters) {
    this.customerCampaignProcedureInstanceAnalysisParameters = customerCampaignProcedureInstanceAnalysisParameters;
  }


}

