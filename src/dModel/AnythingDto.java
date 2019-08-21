package dModel;

public class AnythingDto {
	
	private int boardId;
	private String contents;
	private String id;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "AnythingDto [boardId=" + boardId + ", contents=" + contents
				+ ", id=" + id + "]";
	}
	
}
