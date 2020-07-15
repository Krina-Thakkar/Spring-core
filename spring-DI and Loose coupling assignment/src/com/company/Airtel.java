package com.company;

public class Airtel {
    public Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void activateService(){
        service.service();
    }
}
