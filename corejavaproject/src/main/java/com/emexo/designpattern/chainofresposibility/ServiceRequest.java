package com.emexo.designpattern.chainofresposibility;


public class ServiceRequest {

    private ServiceLevel type;
    private String conclusion = null;

    public ServiceLevel getType() {
        return type;
    }
    public void setType(ServiceLevel type) {
        this.type = type;
    }
    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
