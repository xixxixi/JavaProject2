package com.yedam.diary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// 날짜, 내용
// 테이블
// 접속 계정 : diary / diary

public class DiaryOracleDAO implements DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public DiaryOracleDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "diary";
		String passwd = "diary";
		conn = DButil.getConnection(url, user, passwd);
	}

	@Override
	public int insert(DiaryVO vo) {

		int cnt = 0;
		sql = "insert into diary values( wdate(" + vo.getWdate() + ", 'YYMMDD'), '" + vo.getContents() + "' )";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
			cnt++;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, stmt, conn);
		}
		return cnt;
	}

	@Override
	public void update(DiaryVO vo) {

		sql = "update diary set content ='" + vo.getContents() + "' where wdate to_char(wdate, 'YYMMDD') = '"
				+ vo.getWdate() + "'";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, stmt, conn);
		}

	}

	@Override
	public int delete(String date) {

		int cnt = 0;
		sql = "delete from dairy where to+char(wdate, 'YYMMDD') ='" + date + "'";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, stmt, conn);
		}
		return cnt;
	}

	@Override
	public DiaryVO selectDate(String date) {
		DiaryVO vo = new DiaryVO();
		sql = "select to_char(wdate,'YYMMDD') AS wdate, content from diary where to_char(wdate,'YYMMDD') = '" + date
				+ "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo.setWdate(rs.getString("wdate"));
				vo.setContents(rs.getString("content"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DBUtil.close(null, stmt, conn);
		}
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		return null;
	}

	@Override
	public List<DiaryVO> selectAll() {
		List<DiaryVO> list = new ArrayList<DiaryVO>();
		sql = "select * from dairy order by wdate DESC";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String wdate = rs.getString("wdate");
				String content = rs.getString("content");
				list.add(new DiaryVO(wdate, content));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DButil.close(null, stmt conn);
		}
		return list;
	}

}
