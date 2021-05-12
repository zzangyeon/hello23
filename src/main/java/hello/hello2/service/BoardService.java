package hello.hello2.service;


import hello.hello2.dto.BoardDTO;
import hello.hello2.paging.Criteria;

import java.util.List;

public interface BoardService {


    //C
    public boolean addBoard(BoardDTO board);
    //R
    public List<BoardDTO> getBoardList(Criteria criteria);
    public BoardDTO getBoardDetail(long idx);
    //U
    public boolean deleteBoard(long idx);
    //D
    public boolean updateBoard(BoardDTO params);
}
