package xyz.sidetrip.events;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;

public class EventHandler {
	/*
	 * Generic events class. This will contain all misc events that don't need
	 * proper organization.
	 */

	@EventSubscriber
	public void onReadyEvent(ReadyEvent event) {
		IDiscordClient client = event.getClient();
		client.changePlayingText("banning tards!");
	}

}