package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.handler.FeatureApprovalHandler;
import behavioral.chainOfResponsibility.request.FeatureRequest;

public class MeetingSchedulerService {
    private FeatureApprovalHandler handler;

    public MeetingSchedulerService(FeatureApprovalHandler handler) {
        this.handler = handler;
    }

    public void requestFeature(FeatureRequest featureRequest) {
        System.out.println("===== Requesting feature: " + featureRequest.getName() + " =====");
        if (handler.process(featureRequest)) {
            System.out.println("Feature approved, scheduling brainstorm meeting...");
        }
    }
}
