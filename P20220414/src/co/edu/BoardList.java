package co.edu;

public class BoardList {
	private Board[] boards;
	
	//배열크기 초기화.
	public void init(int size) {
		boards = new Board[size];
	}
	
	// 배열에 한건 입력.
	public void addBoard(Board board) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	//수정 : 게시글번호 찾아서 내용, 제목 바꾸도록 하겠습니다.
	public void modifyBoard(Board board) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				break;
			}
		}
		
	}

	//게시글목록
	public Board[] boardList() {
		return boards;
	}
}
