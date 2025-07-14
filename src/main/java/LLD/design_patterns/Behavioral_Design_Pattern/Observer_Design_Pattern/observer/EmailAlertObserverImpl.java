package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer;

import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String email;
    StockObservable observable;


    public EmailAlertObserverImpl(String email,StockObservable observable){
        this.observable=observable;
        this.email=email;
    }

    @Override
    public void update() {
        sendEmail("Product is in stock hurry up!");
    }

    private void sendEmail(String msg) {
        System.out.println("Email sent to: "+this.email+" with message: "+msg);
    }
}
