package factories;

import interfaces.Board;
import models.BoardImpl;
import repositories.BoardRepositoryImpl;

/**
 * Created by PC2 on 9/5/2016.
 */
public class BoardFactoryImpl {

    private BoardRepositoryImpl boardRepository;
    private String[]data;

    public BoardFactoryImpl(BoardRepositoryImpl boardRepository, String [] data) {
        this.boardRepository = boardRepository;
        this.data = data;
    }

    public void createBord() {

        String widht = this.data[0];
        String height = this.data[1];
        String depth = this.data[2];
        Board board = null;

        if (this.data.length==4&&Integer.valueOf(this.data[3])>0){
            for (int i = 0; i < Integer.valueOf(this.data[3]); i++) {
                board = new BoardImpl(height, widht, depth);
                this.boardRepository.addBoard(board);
            }
        } else {
            board = new BoardImpl(height, widht, depth);
            this.boardRepository.addBoard(board);
        }
    }
}
