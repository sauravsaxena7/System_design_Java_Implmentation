package LLD.design_patterns.Behavioral_Design_Pattern.chain_of_responsibility;

public class LogProcessorMain {

    public static void main(String[] args){

        LogProcessor logProcessorObj = new InfoLogProcessor(
                new DebugLogProcessor(
                        new ErrorLogProcessor(null)
                )
        );

        logProcessorObj.log(LogProcessor.ERROR,"Exception happen");
        logProcessorObj.log(LogProcessor.DEBUG,"On going debug");
        logProcessorObj.log(LogProcessor.INFO,"Info message");

    }
}
