package com.dfhao.admin.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@OpenAPIDefinition(security = @SecurityRequirement(name = "Authorization"))
@SecurityScheme(type = SecuritySchemeType.APIKEY,
        name = "Authorization",
        scheme = "Authorization",
        in = SecuritySchemeIn.HEADER)
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        // 联系人信息
        Contact contact = new Contact()
                .name("dfhao")
                .email("dfhao12@163.com");

        // 授权许可信息(license)
        License license = new License()
                .name("Apache 2.0")
                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                .identifier("Apache-2.0")
                .extensions(new HashMap<>());

        Info info = new Info()
                .title("API 文档")
                .description("被你捧做神明的人，怎会低头看尘埃里的你")
                .license(license)
                .contact(contact);

        return new OpenAPI().info(info);
    }

}
