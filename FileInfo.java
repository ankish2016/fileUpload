package fileUpload.model;

import lombok.Data;

@Data
public class FileInfo 
{
	private String fileName;
	private String fileUrl;
	public FileInfo(String fileName, String fileUrl) {
		super();
		this.fileName = fileName;
		this.fileUrl = fileUrl;
	}
	

}
