package com.demo.pri.demo.repo;

import com.demo.pri.demo.entity.RelationshipManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RelationshipManagerRepo extends JpaRepository<RelationshipManager, String> {

}
