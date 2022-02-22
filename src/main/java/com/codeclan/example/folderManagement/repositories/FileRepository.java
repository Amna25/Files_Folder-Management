package com.codeclan.example.folderManagement.repositories;

import com.codeclan.example.folderManagement.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

}
