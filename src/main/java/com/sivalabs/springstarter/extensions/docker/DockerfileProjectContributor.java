package com.sivalabs.springstarter.extensions.docker;

import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A {@link ProjectContributor} that creates "Dockerfile".
 *
 * @author Siva
 */
public class DockerfileProjectContributor implements ProjectContributor {

	private final Dockerfile dockerfile;

	public DockerfileProjectContributor(Dockerfile dockerfile) {
		this.dockerfile = dockerfile;
	}

	@Override
	public void contribute(Path projectRoot) throws IOException {
		Path output = projectRoot.resolve("Dockerfile");
		if (!output.toFile().exists()) {
			Files.createDirectories(output.getParent());
			Files.createFile(output);
		}

		try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(output))) {
			this.dockerfile.write(writer);
		}
	}

}
