package security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// Add configuration of security
@Configuration
public class DemoSecurityConfig {

        // Check why this not create this users.
        @Bean
        public InMemoryUserDetailsManager userDetailsManager() {

                UserDetails jhon = User.builder()
                                .username("jhon")
                                .password("{noop}123")
                                .roles("EMPLOYEE")
                                .build();

                UserDetails mary = User.builder()
                                .username("mary")
                                .password("{noop}123")
                                .roles("EMPLOYEE", "MANAGER")
                                .build();

                UserDetails susan = User.builder()
                                .username("mary")
                                .password("{noop}123")
                                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                                .build();

                return new InMemoryUserDetailsManager(jhon, mary, susan);

        }

        // Add permissions authorization
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http.authorizeHttpRequests(
                                configurer -> configurer
                                .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                                .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                                .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN"));

                // Use HTTP basic auth
                http.httpBasic(Customizer.withDefaults());
                // Disable CSRF - not necesary for REST API
                http.csrf(csrf -> csrf.disable());

                return http.build();
        }
}
