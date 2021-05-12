package hello.hello2.service;

import hello.hello2.dto.BoardDTO;
import hello.hello2.paging.Criteria;
import hello.hello2.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public boolean addBoard(BoardDTO params) {
        return boardMapper.insertBoard(params);
    }

    @Override
    public BoardDTO getBoardDetail(long idx) {
        //조회수 증가 로직 추가
        return boardMapper.selectBoardDetail(idx);
    }

    @Override
    public List<BoardDTO> getBoardList(Criteria criteria) {
        List<BoardDTO> boardList = Collections.emptyList();//NPE 방지를 위해 비어있는 리스트를 선언

        int boardTotalCount = boardMapper.selectBoardTotalCount(criteria);

        if (boardTotalCount > 0) {
            boardList = boardMapper.selectBoardList(criteria);
        }

        return boardList;
    }

    @Override
    public boolean updateBoard(BoardDTO params) {
        int queryResult = 0;
        queryResult = boardMapper.updateBoard(params);

        return (queryResult == 1) ? true : false;
    }

    @Override
    public boolean deleteBoard(long idx) {
        int queryResult = 0;

        BoardDTO board = boardMapper.selectBoardDetail(idx);

        /*if (board != null && "N".equals(board.getDeleteYn())) {
            queryResult = boardMapper.deleteBoard(idx);
        }*/
        boardMapper.deleteBoard(idx);

        return (queryResult == 1) ? true : false;
    }

}
