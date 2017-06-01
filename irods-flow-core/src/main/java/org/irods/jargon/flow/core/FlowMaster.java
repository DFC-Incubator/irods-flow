/**
 * 
 */
package org.irods.jargon.flow.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Master flow core
 * 
 * @author mcc
 *
 */

@SpringBootApplication
@ImportResource("/integration.xml")
public class FlowMaster {

	/**
	 * 
	 */
	public FlowMaster() {
	}

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = new SpringApplication(FlowMaster.class).run(args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		ctx.close();
	}

}
