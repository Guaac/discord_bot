package discord_bot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class bot_1 {

	public static void main(String[] args) {
		
		try {
			JDA jda = new
			JDABuilder("NjkxNTU2OTUzMTI1NjgzMjAz.Xnhsrg.ono7mhMQDhT"
					+ "5nc7cyC-9SwIEe84").build();
			jda.addEventListener(new bbot());
		} catch (LoginException e) {
			e.printStackTrace();
			
		}
	}
	
	

}
