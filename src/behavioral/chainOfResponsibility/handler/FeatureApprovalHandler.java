package behavioral.chainOfResponsibility.handler;

import behavioral.chainOfResponsibility.request.FeatureRequest;

public abstract class FeatureApprovalHandler {

    private FeatureApprovalHandler next;

    public FeatureApprovalHandler setNext(FeatureApprovalHandler handler) {
        this.next = handler;
        return this;
    }

    public abstract boolean process(FeatureRequest featureRequest);

    protected boolean handleNext(FeatureRequest featureRequest) {
        System.out.println("[" + this.getClass().getSimpleName() + " Approved]");
        if (next == null) {
            return true;
        }

        return next.process(featureRequest);
    }

}
