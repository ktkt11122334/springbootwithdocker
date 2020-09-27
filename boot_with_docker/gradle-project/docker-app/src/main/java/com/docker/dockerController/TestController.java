package com.docker.dockerController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.docker.repository.DockerRepository;

@RestController
public class TestController {

	private DockerRepository dockerRepository;

	public TestController (DockerRepository docRepository) {
		this.dockerRepository = docRepository;
	}

	@RequestMapping( value = "docker/test", method = RequestMethod.GET )
	public String test() {
		return this.dockerRepository.getInitialText(1).getData();
	}

}
