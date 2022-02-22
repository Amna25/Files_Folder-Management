package com.codeclan.example.folderManagement.components;

import com.codeclan.example.folderManagement.models.File;
import com.codeclan.example.folderManagement.models.Folder;
import com.codeclan.example.folderManagement.models.User;
import com.codeclan.example.folderManagement.repositories.FileRepository;
import com.codeclan.example.folderManagement.repositories.FolderRepository;
import com.codeclan.example.folderManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Amna");
        userRepository.save(user1);

        User user2 = new User("Ayesha");
        userRepository.save(user2);

        User user3 = new User("Halima");
        userRepository.save(user3);

        User user4 = new User("Nida");
        userRepository.save(user4);

        User user5 = new User("Hira");
        userRepository.save(user5);

        Folder folder1 = new Folder("Pensions");
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Income");
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Study_material");
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Overdue_Payments");
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Expenses");
        folderRepository.save(folder5);

        File file1 = new File("Feb_Income", "TXT", "45MB",folder1);
        fileRepository.save(file1);

        File file2 = new File("Monthly_Pension", "TXT", "33MB",folder1);
        fileRepository.save(file2);

        File file3 = new File("monthly_expense", "ppt", "66GB",folder5);
        fileRepository.save(file3);

        File file4 = new File("individual_income", "TXT", "45MB",folder4);
        fileRepository.save(file4);

        File file5 = new File("Project", "java", "88MB",folder3);
        fileRepository.save(file5);

        folder1.addUser(user1);
        folder1.addUser(user2);
        folderRepository.save(folder1);

        user1.addFolder(folder1);
        user1.addFolder(folder2);
        userRepository.save(user1);

        user2.addFolder(folder2);
        user2.addFolder(folder4);
        userRepository.save(user2);

        user3.addFolder(folder3);
        userRepository.save(user3);

        folder2.addUser(user2);
        folder2.addUser(user3);
        folderRepository.save(folder2);

    }
}
