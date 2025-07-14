package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable;

import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int count);
    int getStockCount();

}
