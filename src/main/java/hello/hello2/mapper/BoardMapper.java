package hello.hello2.mapper;
import hello.hello2.dto.BoardDTO;
import hello.hello2.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
    public interface BoardMapper {


    public boolean insertBoard(BoardDTO board);

    public BoardDTO selectBoardDetail(long idx);

    public int updateBoard(BoardDTO board);

    public int deleteBoard(long idx);

    public List<BoardDTO> selectBoardList(Criteria criteria);

    public int selectBoardTotalCount(Criteria criteria);




}
