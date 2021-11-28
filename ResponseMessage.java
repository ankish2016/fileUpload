package fileUpload.model;

import lombok.Data;

@Data
public class ResponseMessage {

	

	public ResponseMessage(String message) {
		super();
		this.message = message;
	}

	private String message;
	
}
