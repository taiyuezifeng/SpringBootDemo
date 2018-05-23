package top.taiyuezifeng.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}

/**
 * 自定义Servlet、Filter和Listener的另一种配置方式。
 */
/*
@SpringBootApplication
public class SpringbootDemoApplication implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 配置自定义Servlet
		servletContext.addServlet("customServlet",new CustomServlet()).addMapping("/servlet/demo");
		// 配置自定义过滤器
		servletContext.addFilter("customFilter",new CustomFilter()).addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
		// 配置自定义监听器
		servletContext.addListener(new CustomListener());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
*/

/**
 * 如果需要打成war包，则使用下面的类，并配置pox.xml中jar为war
 */
/*
@SpringBootApplication
public class SpringbootDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
*/