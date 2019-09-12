package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord;
import org.bian.dto.BQExecutionRetrieveOutputModelExecutionInstanceAnalysis;
import org.bian.dto.BQExecutionRetrieveOutputModelExecutionInstanceRecord;
import org.bian.dto.BQExecutionRetrieveOutputModelExecutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExecutionRetrieveOutputModel
 */
public class BQExecutionRetrieveOutputModel   {
  private BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  private BQExecutionRetrieveOutputModelExecutionInstanceRecord executionInstanceRecord = null;

  private String executionRetrieveActionTaskReference = null;

  private Object executionRetrieveActionTaskRecord = null;

  private String executionRetrieveActionResponse = null;

  private BQExecutionRetrieveOutputModelExecutionInstanceReport executionInstanceReport = null;

  private BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysis = null;


  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/

  public BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionRetrieveOutputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionRetrieveOutputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance retrieve service call 
   * @return executionRetrieveActionTaskReference
  **/

  public String getExecutionRetrieveActionTaskReference() {
    return executionRetrieveActionTaskReference;
  }

  public void setExecutionRetrieveActionTaskReference(String executionRetrieveActionTaskReference) {
    this.executionRetrieveActionTaskReference = executionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return executionRetrieveActionTaskRecord
  **/

  public Object getExecutionRetrieveActionTaskRecord() {
    return executionRetrieveActionTaskRecord;
  }

  public void setExecutionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return executionRetrieveActionResponse
  **/

  public String getExecutionRetrieveActionResponse() {
    return executionRetrieveActionResponse;
  }

  public void setExecutionRetrieveActionResponse(String executionRetrieveActionResponse) {
    this.executionRetrieveActionResponse = executionRetrieveActionResponse;
  }


  /**
   * Get executionInstanceReport
   * @return executionInstanceReport
  **/

  public BQExecutionRetrieveOutputModelExecutionInstanceReport getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(BQExecutionRetrieveOutputModelExecutionInstanceReport executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }


  /**
   * Get executionInstanceAnalysis
   * @return executionInstanceAnalysis
  **/

  public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis getExecutionInstanceAnalysis() {
    return executionInstanceAnalysis;
  }

  public void setExecutionInstanceAnalysis(BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
  }


}

