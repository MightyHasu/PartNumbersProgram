/**
 * Created by PC2 on 9/6/2016.
 */
public class CommandInterpreterImpl {

    private String[] data;

    public CommandInterpreterImpl(){
    }

    public void interpretCommand(String input) {
        try {
            String[] data = input.split("\\/");
            this.data = data;

        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }


}
