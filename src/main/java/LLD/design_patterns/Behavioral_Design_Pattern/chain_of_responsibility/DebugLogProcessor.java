package LLD.design_patterns.Behavioral_Design_Pattern.chain_of_responsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }
        super.log(logLevel, message);
    }
}
