package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveInputModel
 */
public class CRCustomerCampaignProcedureRetrieveInputModel   {
  private Object customerCampaignProcedureRetrieveActionTaskRecord = null;

  private String customerCampaignProcedureRetrieveActionRequest = null;

  private CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportRecord = null;

  private CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCampaignProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerCampaignProcedureRetrieveActionTaskRecord() {
    return customerCampaignProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerCampaignProcedureRetrieveActionTaskRecord(Object customerCampaignProcedureRetrieveActionTaskRecord) {
    this.customerCampaignProcedureRetrieveActionTaskRecord = customerCampaignProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCampaignProcedureRetrieveActionRequest
  **/

  public String getCustomerCampaignProcedureRetrieveActionRequest() {
    return customerCampaignProcedureRetrieveActionRequest;
  }

  public void setCustomerCampaignProcedureRetrieveActionRequest(String customerCampaignProcedureRetrieveActionRequest) {
    this.customerCampaignProcedureRetrieveActionRequest = customerCampaignProcedureRetrieveActionRequest;
  }


  /**
   * Get customerCampaignProcedureInstanceReportRecord
   * @return customerCampaignProcedureInstanceReportRecord
  **/

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord getCustomerCampaignProcedureInstanceReportRecord() {
    return customerCampaignProcedureInstanceReportRecord;
  }

  public void setCustomerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
  }


  /**
   * Get customerCampaignProcedureInstanceAnalysis
   * @return customerCampaignProcedureInstanceAnalysis
  **/

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis getCustomerCampaignProcedureInstanceAnalysis() {
    return customerCampaignProcedureInstanceAnalysis;
  }

  public void setCustomerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysis) {
    this.customerCampaignProcedureInstanceAnalysis = customerCampaignProcedureInstanceAnalysis;
  }


}

