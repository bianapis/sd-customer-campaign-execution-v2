package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRequestOutputModel
 */
public class BQAnalysisRequestOutputModel   {
  private String analysisRequestActionTaskReference = null;

  private Object analysisRequestActionTaskRecord = null;

  private String analysisRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance request service call 
   * @return analysisRequestActionTaskReference
  **/

  public String getAnalysisRequestActionTaskReference() {
    return analysisRequestActionTaskReference;
  }

  public void setAnalysisRequestActionTaskReference(String analysisRequestActionTaskReference) {
    this.analysisRequestActionTaskReference = analysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return analysisRequestActionTaskRecord
  **/

  public Object getAnalysisRequestActionTaskRecord() {
    return analysisRequestActionTaskRecord;
  }

  public void setAnalysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis service request record 
   * @return analysisRequestRecordReference
  **/

  public String getAnalysisRequestRecordReference() {
    return analysisRequestRecordReference;
  }

  public void setAnalysisRequestRecordReference(String analysisRequestRecordReference) {
    this.analysisRequestRecordReference = analysisRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

