package repositories;

import interfaces.Board;

import java.util.HashMap;

/**
 * Created by PC2 on 9/5/2016.
 */
public class BoardRepositoryImpl {

    private HashMap<Board, Integer> boardsQuantity;

    public BoardRepositoryImpl() {
        this.boardsQuantity = new HashMap<Board, Integer>();
    }

    public void addBoard(Board board) {
        if (this.boardsQuantity.size() == 0) {
            boardsQuantity.put(board, 1);
        } else {
            for (Board board1 : boardsQuantity.keySet()) {
                if (board.toString().equals(board1.toString())) {
                    boardsQuantity.put(board1, boardsQuantity.get(board1) + 1);
                } else {

                    boardsQuantity.put(board, 1);
                    continue;
                }
            }
        }
    }

    public void getBoardslist() {
        for (Board board : boardsQuantity.keySet()) {
            System.out.println(board.toString() + " - " + this.boardsQuantity.get(board));
        }
    }
}
