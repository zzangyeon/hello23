package hello.hello2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class BoardDTO {

        private long idx;
        private String title;
        private String content;
        private String writer;
        private int hit;

}
