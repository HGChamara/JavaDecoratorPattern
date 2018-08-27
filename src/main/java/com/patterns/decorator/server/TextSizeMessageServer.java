package com.patterns.decorator.server;

public class TextSizeMessageServer extends ModifiedMessageServer
{
	protected TextSize textSize;
	protected MessageServer modifiedMessageServer;
	public TextSizeMessageServer(MessageServer modifiedMessageServer, TextSize textSize) 
	{
		super(modifiedMessageServer);
		this.textSize = textSize;
		this.modifiedMessageServer = modifiedMessageServer;
	}

	public void sendMessage() 
	{
		modifiedMessageServer.sendMessage();
		System.out.println("Text size - "+textSize);
	}

	public void receiveMessage() 
	{
		modifiedMessageServer.receiveMessage();
		System.out.println("Text size - "+textSize);
	}

	public boolean isRunning() 
	{
		return false;
	}

	public String description() 
	{
		return modifiedMessageServer.description()+" text size - "+textSize;
	}

}
