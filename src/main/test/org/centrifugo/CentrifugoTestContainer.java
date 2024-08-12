package org.centrifugo;

import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.api.model.Ports;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.MountableFile;

public class CentrifugoTestContainer {

    public static GenericContainer<?> getTestContainer(final int port) {
        return new GenericContainer<>("centrifugo/centrifugo")
                .withExposedPorts(port)
                .withCreateContainerCmdModifier(cmd ->
                        cmd.withHostConfig(new HostConfig().withPortBindings(
                                new PortBinding(Ports.Binding.bindPort(port), new ExposedPort(port)))))
                .withCopyFileToContainer(
                        MountableFile.forClasspathResource("config.json"),
                        "/centrifugo/config.json"
                );
    }
}
