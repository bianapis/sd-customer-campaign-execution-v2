package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord
 */
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord   {
  private String customerCampaignProcedureInstanceReportData = null;

  private String customerCampaignProcedureInstanceReportType = null;

  private Object customerCampaignProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCampaignProcedureInstanceReportData
  **/

  public String getCustomerCampaignProcedureInstanceReportData() {
    return customerCampaignProcedureInstanceReportData;
  }

  public void setCustomerCampaignProcedureInstanceReportData(String customerCampaignProcedureInstanceReportData) {
    this.customerCampaignProcedureInstanceReportData = customerCampaignProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCampaignProcedureInstanceReport
  **/

  public Object getCustomerCampaignProcedureInstanceReport() {
    return customerCampaignProcedureInstanceReport;
  }

  public void setCustomerCampaignProcedureInstanceReport(Object customerCampaignProcedureInstanceReport) {
    this.customerCampaignProcedureInstanceReport = customerCampaignProcedureInstanceReport;
  }


}

