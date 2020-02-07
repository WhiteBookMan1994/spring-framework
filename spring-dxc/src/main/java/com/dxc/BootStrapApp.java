package com.dxc;

import com.dxc.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingchenchen
 * @since 2020-02-07
 */
public class BootStrapApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
