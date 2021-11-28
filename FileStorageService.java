package fileUpload.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;



public interface FileStorageService {

	public void init();
	public void Save(MultipartFile file);
	public Resource load(String fileName);
	public Stream<Path> loadAll();
	public void deleteAll();
}
