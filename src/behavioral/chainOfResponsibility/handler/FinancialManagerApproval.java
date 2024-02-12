package behavioral.chainOfResponsibility.handler;

import behavioral.chainOfResponsibility.request.FeatureRequest;

public class FinancialManagerApproval extends FeatureApprovalHandler{
    @Override
    public boolean process(FeatureRequest featureRequest) {

        if (featureRequest.getPrice() > 2000) {
            System.out.println("[Financial Manager Declined] Cannot spend that much money.");
            return false;
        }

        return handleNext(featureRequest);
    }
}
