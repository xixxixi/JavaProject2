package com.yedam.diary;

public enum Menu {
	종료(0), 추가(1), 수정(2), 삭제(3), 전체조회(4);

	private int value;

	private Menu(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static Menu getMenu(int m) {
		Menu em = null;
		for(Menu menu : Menu.values()){	// values : 배열 값으로 리턴해줌
			if(menu.getValue() == m) {
				em = menu;
			}
		}
		return em;
	}

}
