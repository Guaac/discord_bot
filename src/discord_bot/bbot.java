package discord_bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class bbot extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
	event.getMessage().getContentRaw();
		super.onMessageReceived(event);
		System.out.println(event.getMessage().getContentRaw());
	}
	
}
