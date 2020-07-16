package com.mda.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("My Channel")
				.apiInfo(apiInfo()).select().paths(regex("/book.*")).build();
		}
	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample documentation generated Using Swagger2 for uor rest API")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaek-kQ")
				.version("1.0").build();
	}
}
