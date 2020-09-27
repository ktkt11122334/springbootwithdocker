package com.docker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "test" )
public class DockerEntity {

	@Id
	@Column( name = "id" )
	Integer id;

	@Column( name = "data" )
	String data;

}
