package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis
 */
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis   {
  private String customerCampaignProcedureInstanceAnalysisData = null;

  private String customerCampaignProcedureInstanceAnalysisReportType = null;

  private Object customerCampaignProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCampaignProcedureInstanceAnalysisData
  **/

  public String getCustomerCampaignProcedureInstanceAnalysisData() {
    return customerCampaignProcedureInstanceAnalysisData;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisData(String customerCampaignProcedureInstanceAnalysisData) {
    this.customerCampaignProcedureInstanceAnalysisData = customerCampaignProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCampaignProcedureInstanceAnalysisReport
  **/

  public Object getCustomerCampaignProcedureInstanceAnalysisReport() {
    return customerCampaignProcedureInstanceAnalysisReport;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReport(Object customerCampaignProcedureInstanceAnalysisReport) {
    this.customerCampaignProcedureInstanceAnalysisReport = customerCampaignProcedureInstanceAnalysisReport;
  }


}

