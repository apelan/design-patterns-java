package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.handler.FeatureApprovalHandler;
import behavioral.chainOfResponsibility.handler.FinancialManagerApproval;
import behavioral.chainOfResponsibility.handler.ProjectManagerApproval;
import behavioral.chainOfResponsibility.handler.TeamLeadApproval;
import behavioral.chainOfResponsibility.request.FeatureRequest;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        FeatureApprovalHandler featureApprovalHandler = new TeamLeadApproval()
                .setNext(new FinancialManagerApproval()
                        .setNext(new ProjectManagerApproval()));

        MeetingSchedulerService meetingSchedulerService = new MeetingSchedulerService(featureApprovalHandler);

//        meetingSchedulerService.requestFeature(new FeatureRequest("Feature1", 6, 1000, 5));
//        meetingSchedulerService.requestFeature(new FeatureRequest("Feature2", 2, 5000, 5));
//        meetingSchedulerService.requestFeature(new FeatureRequest("Feature3", 2, 1000, 30));
        meetingSchedulerService.requestFeature(new FeatureRequest("Feature4", 2, 2000, 4));

    }

}
