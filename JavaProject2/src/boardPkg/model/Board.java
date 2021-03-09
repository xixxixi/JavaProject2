package boardPkg.model;

public class Board {
	private int boardNo;
	private String title;
	private String contnet;
	private String writer;
	private String creationDate;
	public Board() {}	// 기본 생성자
	public Board(int boardNo, String title, String contnet, String writer, String creationDate) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.contnet = contnet;
		this.writer = writer;
		this.creationDate = creationDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContnet() {
		return contnet;
	}

	public void setContnet(String contnet) {
		this.contnet = contnet;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", contnet=" + contnet + ", writer=" + writer
				+ ", creationDate=" + creationDate + "]";
	}

}
