package com.viettel.designpattern.behavioral.chainofresponse.xinnghi;

public class Client {
    public static void main(String[] args) {
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(7));
    }
}
