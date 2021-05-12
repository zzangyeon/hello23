package hello.hello2.controller;

import hello.hello2.dto.BoardDTO;
import hello.hello2.paging.Criteria;
import hello.hello2.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String boardList(@ModelAttribute("criteria")Criteria criteria, Model model) {

        List<BoardDTO> boardList = boardService.getBoardList(criteria);
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

    @GetMapping("/form")
    public String boardForm() {
        return "board/form";
    }

    @PostMapping("/form")
    public  String boardAdd(@ModelAttribute BoardDTO board){
        boardService.addBoard(board);
        return "redirect:/board/list";
    }

    @GetMapping("/detail")
    public String boardDetail(@RequestParam long idx, Model model){
        BoardDTO board = boardService.getBoardDetail(idx);
        model.addAttribute("board", board);
        return "board/detail";
    }

    @GetMapping("/update")
    public String boardUpdateview(@RequestParam long idx,Model model){
        BoardDTO board = boardService.getBoardDetail(idx);
        model.addAttribute("board",board);
        return "/board/update";
    }

    @PostMapping("/update")
    public String boardUpdate(@ModelAttribute BoardDTO board){
        boardService.updateBoard(board);
        return "redirect:/board/list";
    }

    @GetMapping("/delete")
    public String boardDelete(@RequestParam long idx){
        boardService.deleteBoard(idx);
        return "redirect:/board/list";
    }
}