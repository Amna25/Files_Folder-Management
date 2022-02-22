package com.codeclan.example.folderManagement.repositories;

import com.codeclan.example.folderManagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
}
