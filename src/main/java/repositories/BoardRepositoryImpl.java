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

    public void addBoard (Board board){
        if (!boardsQuantity.containsKey(board)) {
            boardsQuantity.put(board,1);
        } else {
            boardsQuantity.put(board, boardsQuantity.get(board)+1);
        }
    }

    public void getBoardslist(){
        for (Board board : boardsQuantity.keySet()) {
            System.out.println(board.toString()+" - "+this.boardsQuantity.get(board));
        }
    }
}
