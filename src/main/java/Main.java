import interfaces.Board;
import models.BoardImpl;
import repositories.BoardRepositoryImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PC2 on 9/5/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BoardRepositoryImpl boards = new BoardRepositoryImpl();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\/");
        String width = tokens[0];
        String height = tokens[1];
        String depth = tokens[2];
        Board board = new BoardImpl(height, width, depth);
        boards.addBoard(board);
        boards.addBoard(board);
        tokens = reader.readLine().split("\\/");
        width = tokens[0];
        height = tokens[1];
        depth = tokens[2];
        board = new BoardImpl(height, width, depth);
        boards.addBoard(board);

        boards.getBoardslist();
    }
}
