/**
 * 
 */
package com.nkk.rest.storage;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author narenderk
 *
 */
public interface StorageService {
	
	void init();
	
	void store(MultipartFile file);
	
	Stream<Path> loadAll();
	
	Resource loadAsResource(String filename);
	
	void deleteAll();

}