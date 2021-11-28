package fileUpload;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fileUpload.service.FileStorageService;

@SpringBootApplication
public class FileUploadApplication {

	@Resource 
	FileStorageService fileStorageService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}
      
	
	 public void run(String... arg) throws Exception {
		    fileStorageService.deleteAll();
		    fileStorageService.init();
		  }
	
}
