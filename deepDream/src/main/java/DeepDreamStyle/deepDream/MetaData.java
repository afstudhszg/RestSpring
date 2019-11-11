package DeepDreamStyle.deepDream;

import java.util.Date;
import java.util.UUID;

public class MetaData {
	
	private UUID pictureId;
	private String pictureTitle;
	private Date uploadDate;
	private boolean privateFlag;
	
	public MetaData (String restTitle, boolean restFlag) {
		
		pictureId = UUID.randomUUID();
		pictureTitle = restTitle;
		privateFlag = restFlag;
		uploadDate = new Date();
	}
	
	public UUID getId() {
		return pictureId;
	}
	
	public String getTitle() {
		return pictureTitle;
	}
	
	public Date getUploadDate() {
		return uploadDate;
	}
	
	public void setFlag(boolean newFlag) {
		privateFlag = newFlag;
	}
	
	public boolean getFlag() {
		return privateFlag;
	}
}
