package com.codeclan.example.folderManagement;

import com.codeclan.example.folderManagement.models.File;
import com.codeclan.example.folderManagement.models.Folder;
import com.codeclan.example.folderManagement.models.User;
import com.codeclan.example.folderManagement.repositories.FileRepository;
import com.codeclan.example.folderManagement.repositories.FolderRepository;
import com.codeclan.example.folderManagement.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FolderManagementApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFilesAndFolders(){
		Folder folder = new Folder("Payment_Record");
		folderRepository.save(folder);

		File file = new File("Feb_payment","PDF", "30MB", folder);
		fileRepository.save(file);
	}

	@Test
	public void addFoldersAndUsers(){
		Folder folder = new Folder("Payment_Record");
		folderRepository.save(folder);

		File file = new File("Feb_payment","PDF", "30MB", folder);
		fileRepository.save(file);

		User user = new User("Ayesha");
		userRepository.save(user);

		user.addFolder(folder);
		userRepository.save(user);
	}


}
