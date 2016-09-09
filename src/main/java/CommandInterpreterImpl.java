/**
 * Created by PC2 on 9/6/2016.
 */
public class CommandInterpreterImpl {

    public CommandInterpreterImpl(){
    }

    public String[] interpretCommand(String input) {
        try {
            String[] data = input.split("\\/");
            return data;
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }
}
