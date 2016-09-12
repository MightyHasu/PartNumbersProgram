import factories.BoardFactoryImpl;
import interfaces.Reader;
import io.ConsoleReader;
import repositories.BoardRepositoryImpl;

import java.io.IOException;

/**
 * Created by PC2 on 9/5/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BoardRepositoryImpl boards = new BoardRepositoryImpl();
        Reader reader = new ConsoleReader();
        BoardFactoryImpl bf = null;
        for (int i = 0; i < 3; i++) {
            String[] data = reader.readLine().split("\\/");
            bf = new BoardFactoryImpl(boards,data);
            bf.createBord();
        }
        boards.getBoardslist();
    }
}
