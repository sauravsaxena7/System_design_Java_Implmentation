package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable;

import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stock;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {

        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:notificationAlertObserverList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newCount) {
        //new stock comes
        if(stock==0){
            notifySubscribers();
        }
        stock=newCount;
    }

    @Override
    public int getStockCount() {
        return stock;
    }
}
