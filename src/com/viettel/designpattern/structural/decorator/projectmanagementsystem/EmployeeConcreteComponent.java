package com.viettel.designpattern.structural.decorator.projectmanagementsystem;
import java.util.Date;
public class EmployeeConcreteComponent implements EmployeeComponent{
    private String name;
    public EmployeeConcreteComponent (String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + formatDate(joinDate));
    }
    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
    }
    @Override
    public void doTask() {
        System.out.println("Nhan vien nao cung phai lam cong viec nay");
    }
}
