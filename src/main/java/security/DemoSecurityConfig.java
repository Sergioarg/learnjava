package security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// Add configuration of security
@Configuration
public class DemoSecurityConfig {

    // Check why this not create this users.
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails jhon = User.builder()
                .username("jhon")
                .password("123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails susan = User.builder()
                .username("mary")
                .password("123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(jhon, mary, susan);
    }
}
