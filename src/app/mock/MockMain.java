package app.mock;

import control.Command;
import control.ExitCommand;
import control.InitCommand;
import control.NextCommand;
import control.PrevCommand;
import java.util.List;
import java.util.Scanner;
import model.Image;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import view.ImageDisplay;
import view.ImageLoader;

public class MockMain {
    /*
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> commands = initCommands(new ArrayList<>(), new MockImageDisplay(), new MockImageLoader());
        while(true) {
            commands.getOrDefault(scanner.next(), NullCommand.Instance).execute();
        }
           
    }
    */
    private static Map<String, Command> initCommands(List<Image> images, ImageDisplay imageDisplay, ImageLoader imageLoader) {
        HashMap<String, Command> result = new HashMap<>();
        result.put("q", new ExitCommand());
        result.put("i", new InitCommand(imageLoader, images, imageDisplay));
        result.put("p", new PrevCommand(images, imageDisplay));
        result.put("n", new NextCommand(images, imageDisplay));
        result.put("Q", result.get("q"));
        result.put("P", result.get("p"));
        result.put("N", result.get("n"));
        return result;
    }
    
}
