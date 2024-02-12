package behavioral.chainOfResponsibility.handler;

import behavioral.chainOfResponsibility.request.FeatureRequest;

public class ProjectManagerApproval extends FeatureApprovalHandler {
    @Override
    public boolean process(FeatureRequest featureRequest) {

        if (featureRequest.getDaysToComplete() > 20) {
            System.out.println("[Project Manager Declined] Feature takes too long to develop.");
            return false;
        }

        return handleNext(featureRequest);
    }
}
