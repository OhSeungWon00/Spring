package com.aloha.pagehelper.service;

import java.util.List;

import com.aloha.pagehelper.domain.Board;
import com.github.pagehelper.PageInfo;

public interface BoardService {

    // ⭐ 게시글 페이징 목록
    public PageInfo<Board> list(int page, int size) throws Exception;
    // 게시글 목록
    public List<Board> list() throws Exception;
    // 게시글 조회
    public Board select(int no) throws Exception;
    // 게시글 등록
    public int insert(Board board) throws Exception;
    // 게시글 수정
    public int update(Board board) throws Exception;
    // 게시글 삭제
    public int delete(int no) throws Exception;
    
}