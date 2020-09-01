package com.myapp.expenseapp.websecconfig;


import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Configuration
/*public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.cors();
		http.csrf().disable();
		http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());

			//	authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest().authenticated()
			//	.and().httpBasic();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("expenseuser").password("{noop}expensepassword").roles("*");
	}
}*/
/*
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	 // @Override
	   //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	     //  auth.inMemoryAuthentication().withUser("a").password("a").roles("USER");
	 // }
	  // @Override
	   protected void configure(HttpSecurity http) throws Exception {
	     //  	http	
	    //   			.authorizeRequests()
	    //   			.antMatchers("expenses/")
	    //          	.requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
	    //          	.anyRequest().authenticated()
	     //         	.and().httpBasic();
	       	http.cors(); //.configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
			http.csrf().disable();//.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/expenses/");
	   }
}

*/
	

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
	    http.cors(); //.configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
		http.csrf().disable();//.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/expenses/");
					//.permitAll().anyRequest();
				//	.authenticated().and()
				//	.httpBasic();
		}
	
}


