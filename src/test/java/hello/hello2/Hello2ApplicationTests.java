package hello.hello2;

import hello.hello2.dto.BoardDTO;
import hello.hello2.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Hello2ApplicationTests {

	@Autowired
	BoardMapper boardMapper;

	@Test
	void update(){
		BoardDTO board = new BoardDTO(1L, "안냥", "룰루", "하하", 0);
		boardMapper.updateBoard(board);

	}

}
