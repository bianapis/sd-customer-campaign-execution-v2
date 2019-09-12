package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord;
import org.bian.dto.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignProcedureRetrieveOutputModel
 */
public class CRCustomerCampaignProcedureRetrieveOutputModel   {
  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  private String customerCampaignProcedureRetrieveActionTaskReference = null;

  private Object customerCampaignProcedureRetrieveActionTaskRecord = null;

  private String customerCampaignProcedureRetrieveActionResponse = null;

  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportRecord = null;

  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysis = null;


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance retrieve service call 
   * @return customerCampaignProcedureRetrieveActionTaskReference
  **/

  public String getCustomerCampaignProcedureRetrieveActionTaskReference() {
    return customerCampaignProcedureRetrieveActionTaskReference;
  }

  public void setCustomerCampaignProcedureRetrieveActionTaskReference(String customerCampaignProcedureRetrieveActionTaskReference) {
    this.customerCampaignProcedureRetrieveActionTaskReference = customerCampaignProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCampaignProcedureRetrieveActionResponse
  **/

  public String getCustomerCampaignProcedureRetrieveActionResponse() {
    return customerCampaignProcedureRetrieveActionResponse;
  }

  public void setCustomerCampaignProcedureRetrieveActionResponse(String customerCampaignProcedureRetrieveActionResponse) {
    this.customerCampaignProcedureRetrieveActionResponse = customerCampaignProcedureRetrieveActionResponse;
  }


  /**
   * Get customerCampaignProcedureInstanceReportRecord
   * @return customerCampaignProcedureInstanceReportRecord
  **/

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord getCustomerCampaignProcedureInstanceReportRecord() {
    return customerCampaignProcedureInstanceReportRecord;
  }

  public void setCustomerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
  }


  /**
   * Get customerCampaignProcedureInstanceAnalysis
   * @return customerCampaignProcedureInstanceAnalysis
  **/

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis getCustomerCampaignProcedureInstanceAnalysis() {
    return customerCampaignProcedureInstanceAnalysis;
  }

  public void setCustomerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysis) {
    this.customerCampaignProcedureInstanceAnalysis = customerCampaignProcedureInstanceAnalysis;
  }


}

