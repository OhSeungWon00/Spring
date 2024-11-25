package com.aloha.pagehelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.pagehelper.domain.Board;
import com.aloha.pagehelper.mapper.BoardMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service    // 서비스 역할의 스프링 빈
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper boardMapper;

    /**
     * ⭐ 게시글 페이징 목록 조회
     */
    @Override
    public PageInfo<Board> list(int page, int size) throws Exception {
        // ⭐ PageHelper.startPage(현재 페이지, 페이지당 게시글 수);
        PageHelper.startPage(page, size);
        List<Board> boardList = boardMapper.list();
        
        // ⭐ PageInfo<Board>( 리스트, 노출 페이지 개수 )
        PageInfo<Board> pageInfo = new PageInfo<Board>(boardList, 10);
        return pageInfo;
    }


    /**
     * 게시글 목록 조회
     */
    @Override
    public List<Board> list() throws Exception {
        // TODO : boardMapper 로 list() 호출
        /*
         *        ➡ List<Board> boardList 로 받아옴
         *        ➡ return boardList
         */
        List<Board> boardList = boardMapper.list();
        return boardList;
    }

    /**
     * 게시글 조회
     * - no 매개변수로 게시글 번호를 전달받아서
     *   데이터베이스에 조회 요청
     */
    @Override
    public Board select(int no) throws Exception {
        // TODO : boardMapper 로 select(no) 호출
        /*
         *        ➡ Board board 로 받아옴
         *        ➡ return board
         */
        Board board = boardMapper.select(no);
        return board;        
    }

    /**
     * 게시글 등록
     */
    @Override
    public int insert(Board board) throws Exception {
        // TODO : boardMapper 로 insert(Board) 호출
        /*
        *        ➡ int result 로 데이터 처리 행(개수) 받아옴
        *        ➡ return result
        */
        int result = boardMapper.insert(board);
        return result;
    }

    /**
     * 게시글 수정
     */
    @Override
    public int update(Board board) throws Exception {
        // TODO : boardMapper 로 update(Board) 호출
        /*
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.update(board);
        return result;
    }

    /**
     * 게시글 삭제
     */
    @Override
    public int delete(int no) throws Exception {
        // TODO : boardMapper 로 delete(no) 호출
        /*
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.delete(no);
        return result;
    }



}