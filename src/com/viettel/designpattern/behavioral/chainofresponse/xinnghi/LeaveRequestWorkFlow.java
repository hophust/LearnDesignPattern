package com.viettel.designpattern.behavioral.chainofresponse.xinnghi;

public class LeaveRequestWorkFlow {
    public static Approver getApprover() {
        Approver supervisor = new Supervisor();
        Approver manager = new DeliveryManager();
        Approver director = new Director();

        supervisor.setNext(manager);
        manager.setNext(director);
        return supervisor;
    }
}
