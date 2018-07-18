package pl.smartphone.patterns.start;

public class NoStrategyFoundException extends Exception {
    public NoStrategyFoundException(){
        super("I don't know this kind of phone!");
    }
}
