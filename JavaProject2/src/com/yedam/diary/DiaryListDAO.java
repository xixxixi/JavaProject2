package com.yedam.diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class DiaryListDAO implements DAO {

	String fileName = "diary.dat";
	String filePath;
	List<DiaryVO> list;

	public DiaryListDAO() {
		filePath = System.getProperty("user.home") + "/" + fileName;
		readFile(); // 파일 초기화.
	}

	@SuppressWarnings("unchecked")
	public void readFile() {
		File file = new File(filePath);
		if (!file.exists()) {
			list = new ArrayList<DiaryVO>();
		} else {
			try {
				FileInputStream fis = new FileInputStream(filePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);

				list = (List<DiaryVO>) ois.readObject();
				System.out.println((list != null ? list.size() : 0) + "건 read됨."); // ? : 3항연산자 참이면 왼쪽: 거짓이면 :오른쪽
				ois.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void writeFile() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeObject(list);
			oos.close();
//			System.out.println("저장됨.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(DiaryVO vo) {
		int cnt = list.size();
		for (; cnt > 0; cnt--) {
			// 중복 날짜 입력불가
			if (list.get(cnt - 1).getWdate().equals(vo.getWdate())) {
				return 0;
			}
			// 정렬 입력
			if (list.get(cnt - 1).getWdate().compareTo(vo.getWdate()) < 0) {
				break;
			}
		}
		list.add(cnt, vo);
		writeFile();

		return 1;
	}

	@Override
	public void update(DiaryVO vo) {

		int cnt = list.size();
		for (int i = 0; i < cnt; i++) {
			if (list.get(i).getWdate().equals(vo.getWdate())) {
				list.set(i, vo);
//				list.get(i).setContents(vo.getContents());
				writeFile();
			}
		}
	}

	@Override
	public int delete(String date) {
		int cnt = list.size();
		for (int i = 0; i < cnt; i++) {
			if (list.get(i).getWdate().equals(date)) {
				list.remove(i);
				writeFile();
				return 1;
			}
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		int cnt = list.size();
		DiaryVO vo = null;
		for (int i = 0; i < cnt; i++) {
			if (list.get(i).getWdate().equals(date)) {
				vo = list.get(i);
			}
		} 
		return vo;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		List<DiaryVO> result = new ArrayList<DiaryVO>();
		int cnt = list.size();
		for(int i = 0; i<cnt; i++ ) {
			if(list.get(i).getContents().equals(content)) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return list;
	}

}
