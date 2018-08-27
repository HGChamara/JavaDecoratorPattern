package com.patterns.decorator.server;

public abstract class ModifiedMessageServer implements MessageServer
{
	private MessageServer modifiedMessageServer;
	
	public ModifiedMessageServer(MessageServer modifiedMessageServer) 
	{
		super();
		this.modifiedMessageServer = modifiedMessageServer;
	}
}
