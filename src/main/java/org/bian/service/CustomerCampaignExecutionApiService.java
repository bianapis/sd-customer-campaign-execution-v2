/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCampaignExecutionApiService {

	SDCustomerCampaignExecutionActivateOutputModel activate(SDCustomerCampaignExecutionActivateInputModel request);
	
	SDCustomerCampaignExecutionConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignExecutionConfigureInputModel request);
	
	CRCustomerCampaignProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureControlInputModel request);
	
	BQCandidateSelectionExchangeOutputModel exchangeCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionExchangeInputModel request);
	
	CRCustomerCampaignProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureExchangeInputModel request);
	
	CRCustomerCampaignProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureExecuteInputModel request);
	
	SDCustomerCampaignExecutionFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignExecutionFeedbackInputModel request);
	
	CRCustomerCampaignProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerCampaignProcedureInitiateInputModel request);
	
	BQAnalysisInitiateOutputModel initiateAnalysis(String sdReferenceId, String crReferenceId, BQAnalysisInitiateInputModel request);
	
	BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request);
	
	BQAnalysisRequestOutputModel requestAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisRequestInputModel request);
	
	BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request);
	
	CRCustomerCampaignProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureRequestInputModel request);
	
	CRCustomerCampaignProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCandidateSelectionRetrieveOutputModel retrieveCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerCampaignExecutionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerCampaignProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignProcedureUpdateInputModel request);
	
	BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request);
	
	BQCandidateSelectionUpdateOutputModel updateCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionUpdateInputModel request);
	
	BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request);
	
}
