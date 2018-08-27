package com.patterns.decorator.server;

public class ColoredMessageService extends ModifiedMessageServer
{
	protected TextColor color;
	MessageServer modifiedMessageServer;
	public ColoredMessageService(MessageServer modifiedMessageServer, TextColor color) 
	{
		super(modifiedMessageServer);
		this.color = color;
		this.modifiedMessageServer = modifiedMessageServer;
	}
	public void sendMessage() 
	{
		modifiedMessageServer.sendMessage();
		System.out.println("Sending message with color - "+color);
	}
	public void receiveMessage() 
	{
		modifiedMessageServer.receiveMessage();
		System.out.println("Receiving message with color - "+color);
	}
	public boolean isRunning() 
	{
		return false;
	}
	public String description() 
	{
		return modifiedMessageServer.description()+" text color - "+color;
	}

}
