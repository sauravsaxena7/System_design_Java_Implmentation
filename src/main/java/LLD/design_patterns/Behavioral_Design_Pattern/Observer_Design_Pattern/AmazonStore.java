package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern;

import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable.IphoneObservableImpl;
import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observable.StockObservable;
import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer.EmailAlertObserverImpl;
import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer.MobileAlertObservable;
import LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.observer.NotificationAlertObserver;

public class AmazonStore {

    public static void main(String[] args){

        StockObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver o1 = new EmailAlertObserverImpl("xyz@gmail.com",observable);
        NotificationAlertObserver o2 = new EmailAlertObserverImpl("zyx@gmail.com",observable);
        NotificationAlertObserver o3 = new MobileAlertObservable("9771745790",observable);

        observable.add(o1);
        observable.add(o2);
        observable.add(o3);

        observable.setStockCount(30);

    }
}
