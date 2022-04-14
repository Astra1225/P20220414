package co.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// BoardList에 정의해놓은 필드와 메소드를 활용해서 기능.
		BoardList boardList = new BoardList();
		boardList.init(5);  //배열의 크기지정.
		
		while (true) {
			
			System.out.println("1.추가 2.수정 3. 목록 9.종료");
			System.out.print("선택>> ");
			int menu = scn.nextInt();
			
			scn.nextLine();
			if(menu == 1) {
				System.out.print("글번호입력>> ");
				int bNo = scn.nextInt();
				scn.nextLine();
				System.out.println();
				System.out.print("제목입력>>");
				String bTitle = scn.nextLine();
				System.out.print("내용입력>>");
				String bContent = scn.nextLine();
				System.out.print("작성자>>");
				String bWriter = scn.nextLine();
				
				Board newBoad = new Board(bNo, bTitle, bContent, bWriter); // 생성자호출.
				boardList.addBoard(newBoad);
				
			} else if (menu == 2) {
				System.out.print("수정할 글번호입력>>>>");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("변경할 제목입력>>>  ");
				String title = scn.nextLine();
				System.out.print("변경할 내용입력>>>  ");
				String content = scn.nextLine();
				
				Board cBoard = new Board(bNo, title, content, null);
				boardList.modifyBoard(cBoard);
				
			} else if (menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호               제목           내용     사용자   조회수");
				System.out.println("======================================================");
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
					
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}
		}
		System.out.println("end of prog.");
	}

}
