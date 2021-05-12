package hello.hello2.mapper;

import hello.hello2.dto.BoardDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback(value = false)
class BoardMapperTest {

    @Autowired
    BoardMapper boardMapper;

/*    @Test
    @DisplayName("R test")
    void selectTest() {
        List<BoardDTO> boardDto = boardMapper.selectBoardList();
        for (BoardDTO boardDtos : boardDto) {
            System.out.println("boardDto = " + boardDtos);
        }
    }

    @Test
    @DisplayName("test")
    void detailselectTest(){
        BoardDTO boardDto = new BoardDTO();
        boardDto.setIdx(1l);
        boardMapper.fileBoardDetail(boardDto.getId());
    }

    @Test
    @DisplayName("ttt")
    void fileBoardUpdate(){
        BoardDto boardDto = new BoardDto();
        boardDto.setTitle("안뇽~");
        boardDto.setId(2L);
        boardMapper.fileBoardUpdate(boardDto);
    }

    @Test
    @DisplayName("ddd")
    void fileBoardDelete(){
        BoardDto boardDto = new BoardDto();
        boardDto.setId(3L);
        boardMapper.fileBoardDelete(boardDto.getId());

    }*/

}