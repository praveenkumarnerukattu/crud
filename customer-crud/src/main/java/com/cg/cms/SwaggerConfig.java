package com.cg.cms;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;

import static springfox.documentation.builders.PathSelectors.regex;



@EnableSwagger2
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		
		return new Docket(DocumentationType.SWAGGER_2).groupName("customer-api").apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {

		return or(regex("/customers/.*"), regex("/customers/.*98"));
	}

	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("Customer API").description("sravani API reference for developers")
	    .termsOfServiceUrl("https://sravs.com").license("sravani license").licenseUrl("sravaniksheerasagar15@gmail.com")
	    .version("1.0").build();
	}
}*/


/*import static com.google.common.base.Predicates.or;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("customer-api").apiInfo(apiInfo()).select()
				.paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/customers/.*"), regex("/customers/.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Customer API").description("Raza API reference for developers")
				.termsOfServiceUrl("http://praveen.com").license("praveen License").licenseUrl("praveen@gmail.com")
				.version("1.0").build();
	}

}*/


import static com.google.common.base.Predicates.or;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("customer-api").apiInfo(apiInfo()).select()
				.paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/customers/.*"), regex("/products/.*"), regex("/clients/.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Customer API").description("Raza API reference for developers")
				.termsOfServiceUrl("http://raza.com").license("Raza License").licenseUrl("raza.ahmad.khan786@gmail.com")
				.version("1.0").build();
	}

}




