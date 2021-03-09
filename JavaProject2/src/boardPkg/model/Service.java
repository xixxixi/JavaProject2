package boardPkg.model;

public interface Service {
	public Board[] getBoardList(); // ��ü���
	public Board getBoard(int boardNo); // �Ѱ���ȸ
	public void createBoard(Board board); // �Խñ� �ۼ�
	public void modifyBoard(Board board); // �ۼ���
	public void removeBoard(Board board); // �ۻ���

}
