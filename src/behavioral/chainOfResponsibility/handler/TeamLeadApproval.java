package behavioral.chainOfResponsibility.handler;

import behavioral.chainOfResponsibility.request.FeatureRequest;

public class TeamLeadApproval extends FeatureApprovalHandler {

    @Override
    public boolean process(FeatureRequest featureRequest) {

        if (featureRequest.getDevelopersToAssign() > 5) {
            System.out.println("[Team Lead Declined] Too many developers needed for feature.");
            return false;
        }

        return handleNext(featureRequest);
    }
}
