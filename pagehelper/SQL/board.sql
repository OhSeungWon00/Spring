DROP TABLE IF EXISTS `board`;
CREATE TABLE `board` (
  `no` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id` varchar(255) NOT NULL,
  `title` varchar(100) NOT NULL,
  `writer` varchar(100) NOT NULL,
  `content` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) COMMENT='게시판';


-- 샘플 데이터
INSERT INTO board (id, title, writer, content)
 VALUES 
   (UUID(), '제목1', '작성자1', '내용1')
  ,(UUID(), '제목2', '작성자2', '내용2')
  ,(UUID(), '제목3', '작성자3', '내용3')
  ,(UUID(), '제목4', '작성자4', '내용4')
  ,(UUID(), '제목5', '작성자5', '내용5')
 ;