package Novem.Finance.Model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
private String token;
	
	public JwtAuthenticationToken(String token) {
		super(null, null);
		// TODO Auto-generated constructor stub
		this.setToken(token);
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override 
	public Object getCredentials()
	{
		return null;
	}
	public Object getPrincipals()
	{
		return null;
	}


}
