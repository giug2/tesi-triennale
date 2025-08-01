package it.uniroma3.utility;

import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStore {

	public static final String uploadDirectory = System.getProperty("user.dir")+"/src/main/resources/static/images/";
	
	//per salvare
	public static String store(MultipartFile file, String folderName) {
        new File(uploadDirectory+folderName).mkdir();
        Path fileNameAndPath  = Paths.get(uploadDirectory+folderName, file.getOriginalFilename());
        try {
            Files.write(fileNameAndPath, file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileNameAndPath.getFileName().toString();
    }
}
