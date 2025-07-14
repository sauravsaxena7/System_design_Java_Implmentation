package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer;

import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable.StockObservable;

public class MobileAlertObservable implements NotificationAlertObserver{

    String phone;
    StockObservable observable;

    public MobileAlertObservable(String phone, StockObservable observable) {
        this.phone = phone;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageToPhone();
    }

    private void sendMessageToPhone() {
        System.out.println("msg sent:  "+"product is in stock hurry up! "+this.phone);
    }
}
