package com.codeclan.example.folderManagement.repositories;

import com.codeclan.example.folderManagement.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
