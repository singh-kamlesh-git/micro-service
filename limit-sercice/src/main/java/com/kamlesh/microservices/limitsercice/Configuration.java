package com.kamlesh.microservices.limitsercice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	private int maximum;
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	private int minimum;
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
