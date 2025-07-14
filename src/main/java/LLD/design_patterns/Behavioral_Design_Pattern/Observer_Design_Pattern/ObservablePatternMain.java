package LLD.design_patterns.Behavioral_Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

interface DisplayObserver {
    void update();
}

interface Observable {
    void add(DisplayObserver obj);

    void remove(DisplayObserver obj);

    void notifyAllObserver();

    void setData(int data);
    int getData();
}

class WeatherStationObservableImpl implements Observable{

    List<DisplayObserver> displayObserverList =new ArrayList<>();
    int temperature;

    @Override
    public void add(DisplayObserver obj) {
        displayObserverList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        displayObserverList.remove(obj);
    }

    @Override
    public void notifyAllObserver() {
       for(DisplayObserver observer:displayObserverList){
           observer.update();
       }
    }

    @Override
    public void setData(int newTemperature) {
        temperature=newTemperature;
        notifyAllObserver();
    }

    @Override
    public int getData() {
        return temperature;
    }


}

class CricketBuzzObservableImpl implements Observable{

    List<DisplayObserver> displayObserverList =new ArrayList<>();

    int score;

    @Override
    public void add(DisplayObserver obj) {
        displayObserverList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        displayObserverList.remove(obj);
    }

    @Override
    public void notifyAllObserver() {
        for (DisplayObserver observer:displayObserverList){
            observer.update();
        }
    }

    @Override
    public void setData(int newScore) {
        score = newScore;
        notifyAllObserver();
    }

    @Override
    public int getData() {
        return score;
    }
}

class MobileDisplayObserver implements DisplayObserver{
    Observable observable;

    MobileDisplayObserver(Observable observable){
        this.observable=observable;
    }

    @Override
    public void update() {
        //Showing data on Mobile display
        System.out.println("Mobile Display=> "+observable.getClass().getSimpleName()+" : "+observable.getData());
    }
}

class TVDisplayObserver implements DisplayObserver{

    Observable observable;

    TVDisplayObserver  (Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {
        //showing on display of TV
        System.out.println("TV Display=> "+observable.getClass().getSimpleName()+" : "+observable.getData());

    }
}


public class ObservablePatternMain {
    public static void main(String[] args){
        Observable weatherStationObservable = new WeatherStationObservableImpl();

        MobileDisplayObserver mobileDisplayObserver =
                new MobileDisplayObserver(weatherStationObservable);

        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver(weatherStationObservable);

        weatherStationObservable.add(mobileDisplayObserver);
        weatherStationObservable.add(tvDisplayObserver);

        weatherStationObservable.setData(130);


        Observable cricketObservable = new CricketBuzzObservableImpl();
        mobileDisplayObserver = new MobileDisplayObserver(cricketObservable);
        tvDisplayObserver = new TVDisplayObserver(cricketObservable);

        cricketObservable.add(mobileDisplayObserver);
        cricketObservable.add(tvDisplayObserver);

        cricketObservable.setData(300);



    }
}
