/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCampaignExecutionApiServiceImpl implements CustomerCampaignExecutionApiService {

	public SDCustomerCampaignExecutionActivateOutputModel activate(SDCustomerCampaignExecutionActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCampaignExecutionActivateOutputModel.json",new TypeReference<SDCustomerCampaignExecutionActivateOutputModel>(){});
	}
	
	public SDCustomerCampaignExecutionConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignExecutionConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCampaignExecutionConfigureOutputModel.json",new TypeReference<SDCustomerCampaignExecutionConfigureOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerCampaignProcedureControlOutputModel.json",new TypeReference<CRCustomerCampaignProcedureControlOutputModel>(){});
	}
	
	public BQCandidateSelectionExchangeOutputModel exchangeCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionExchangeInputModel request){
		return JsonReader.read("exchange-BQCandidateSelectionExchangeOutputModel.json",new TypeReference<BQCandidateSelectionExchangeOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerCampaignProcedureExchangeOutputModel.json",new TypeReference<CRCustomerCampaignProcedureExchangeOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerCampaignProcedureExecuteOutputModel.json",new TypeReference<CRCustomerCampaignProcedureExecuteOutputModel>(){});
	}
	
	public SDCustomerCampaignExecutionFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignExecutionFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCampaignExecutionFeedbackOutputModel.json",new TypeReference<SDCustomerCampaignExecutionFeedbackOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerCampaignProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerCampaignProcedureInitiateOutputModel.json",new TypeReference<CRCustomerCampaignProcedureInitiateOutputModel>(){});
	}
	
	public BQAnalysisInitiateOutputModel initiateAnalysis(String sdReferenceId, String crReferenceId, BQAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-BQAnalysisInitiateOutputModel.json",new TypeReference<BQAnalysisInitiateOutputModel>(){});
	}
	
	public BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request){
		return JsonReader.read("initiate-BQExecutionInitiateOutputModel.json",new TypeReference<BQExecutionInitiateOutputModel>(){});
	}
	
	public BQAnalysisRequestOutputModel requestAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisRequestInputModel request){
		return JsonReader.read("request-BQAnalysisRequestOutputModel.json",new TypeReference<BQAnalysisRequestOutputModel>(){});
	}
	
	public BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request){
		return JsonReader.read("request-BQExecutionRequestOutputModel.json",new TypeReference<BQExecutionRequestOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerCampaignProcedureRequestOutputModel.json",new TypeReference<CRCustomerCampaignProcedureRequestOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCampaignProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerCampaignProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalysisRetrieveOutputModel.json",new TypeReference<BQAnalysisRetrieveOutputModel>(){});
	}
	
	public BQCandidateSelectionRetrieveOutputModel retrieveCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCandidateSelectionRetrieveOutputModel.json",new TypeReference<BQCandidateSelectionRetrieveOutputModel>(){});
	}
	
	public BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExecutionRetrieveOutputModel.json",new TypeReference<BQExecutionRetrieveOutputModel>(){});
	}
	
	public SDCustomerCampaignExecutionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCampaignExecutionRetrieveOutputModel.json",new TypeReference<SDCustomerCampaignExecutionRetrieveOutputModel>(){});
	}
	
	public CRCustomerCampaignProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCampaignProcedureUpdateOutputModel.json",new TypeReference<CRCustomerCampaignProcedureUpdateOutputModel>(){});
	}
	
	public BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQAnalysisUpdateOutputModel.json",new TypeReference<BQAnalysisUpdateOutputModel>(){});
	}
	
	public BQCandidateSelectionUpdateOutputModel updateCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionUpdateInputModel request){
		return JsonReader.read("update-BQCandidateSelectionUpdateOutputModel.json",new TypeReference<BQCandidateSelectionUpdateOutputModel>(){});
	}
	
	public BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request){
		return JsonReader.read("update-BQExecutionUpdateOutputModel.json",new TypeReference<BQExecutionUpdateOutputModel>(){});
	}
	
}
