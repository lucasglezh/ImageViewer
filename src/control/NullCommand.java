package control;

public class NullCommand implements Command{

    public static final NullCommand Instance = new NullCommand();
    
    @Override
    public void execute() {
        
    }
    
}
