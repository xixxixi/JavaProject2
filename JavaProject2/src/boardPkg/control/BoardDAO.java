package boardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import boardPkg.common.DBCon;
import boardPkg.model.Board;

public class BoardDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close(); // 예외 처리
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 전체리스트
	public Board[] selectBoards() {
		sql = "select * from board order by board_no desc";
		conn = DBCon.getConnection();
		Board[] boards = new Board[100];
		int i = 0;

		try {
			stmt = conn.createStatement(); // 예외 처리
			rs = stmt.executeQuery(sql);
			while (rs.next()) { // rs.next=한 건씩 읽어옴
				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no")); // set 메소드 이용
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd;
			}

		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("조회처리중에 에러가 발생했습니다.");
		} finally { // 정상실행/예외발생 -> 항상 실행해야 할 내용이 있으면 구현
			close();
		}

		return boards; // 보드 배열로 선언했으므로 보드로 리턴
	}

	// 한건조회
	public Board selectBoard(int boardNo) { // 한건조회는 조회 조건이 필요 = boardNo
		sql = "select * from board where board_no = " + boardNo;
		conn = DBCon.getConnection(); // 예외 처리
		Board brd = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				brd = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"), // 생성자 이용
						rs.getString("writer"), rs.getString("creation_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return brd;
	}

	// 입력
	public void insertBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "insert into board values(" + board.getBoardNo() + ", '" + board.getTitle() + "'" + ", '"
				+ board.getContent() + "'" + ", '" + board.getWriter() + "'" + ", sysdate" + ")"; // 숫자는 따옴표x, 문자는 따옴표o
		try {
			conn.createStatement(); // 예외 처리
			int r = stmt.executeUpdate(sql); // executeUpdate는 n건을 리턴
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 수정
	public void updateBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "update board set content = '" + board.getContent() + "' where board_no = " + board.getBoardNo();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 삭제
	public void deleteBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "delete from board where board_no = " + board.getBoardNo();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
