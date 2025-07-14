package LLD.design_patterns.Behavioral_Design_Pattern.chain_of_responsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR){
            System.out.println("ERROR: "+message);
        }
        super.log(logLevel, message);
    }


}
