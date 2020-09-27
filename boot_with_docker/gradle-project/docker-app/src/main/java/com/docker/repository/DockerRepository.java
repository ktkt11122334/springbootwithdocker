package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.docker.entity.DockerEntity;

@Repository
public interface DockerRepository extends JpaRepository<DockerEntity, Integer> {

	@Query( value = "SELECT * FROM test WHERE test.id = 1", nativeQuery = true )
	DockerEntity getInitialText(int id);

}
