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
				rs.close(); // ���� ó��
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

	// ��ü����Ʈ
	public Board[] selectBoards() {
		sql = "select * from board order by board_no desc";
		conn = DBCon.getConnection();
		Board[] boards = new Board[100];
		int i = 0;

		try {
			stmt = conn.createStatement(); // ���� ó��
			rs = stmt.executeQuery(sql);
			while (rs.next()) { // rs.next=�� �Ǿ� �о��
				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no")); // set �޼ҵ� �̿�
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd;
			}

		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("��ȸó���߿� ������ �߻��߽��ϴ�.");
		} finally { // �������/���ܹ߻� -> �׻� �����ؾ� �� ������ ������ ����
			close();
		}

		return boards; // ���� �迭�� ���������Ƿ� ����� ����
	}

	// �Ѱ���ȸ
	public Board selectBoard(int boardNo) { // �Ѱ���ȸ�� ��ȸ ������ �ʿ� = boardNo
		sql = "select * from board where board_no = " + boardNo;
		conn = DBCon.getConnection(); // ���� ó��
		Board brd = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				brd = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"), // ������ �̿�
						rs.getString("writer"), rs.getString("creation_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return brd;
	}

	// �Է�
	public void insertBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "insert into board values(" + board.getBoardNo() + ", '" + board.getTitle() + "'" + ", '"
				+ board.getContent() + "'" + ", '" + board.getWriter() + "'" + ", sysdate" + ")"; // ���ڴ� ����ǥx, ���ڴ� ����ǥo
		try {
			conn.createStatement(); // ���� ó��
			int r = stmt.executeUpdate(sql); // executeUpdate�� n���� ����
			System.out.println(r + "�� �ԷµǾ����ϴ�.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// ����
	public void updateBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "update board set content = '" + board.getContent() + "' where board_no = " + board.getBoardNo();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "�� �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// ����
	public void deleteBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "delete from board where board_no = " + board.getBoardNo();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "�� �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
