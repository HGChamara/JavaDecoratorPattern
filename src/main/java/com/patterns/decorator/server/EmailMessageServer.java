package com.patterns.decorator.server;

public class EmailMessageServer implements MessageServer
{
	public void sendMessage() 
	{
		System.out.println("Sending email message");
	}

	public void receiveMessage() 
	{
		System.out.println("Receiving email message");
	}

	public boolean isRunning() 
	{
		return true;
	}

	public String description() 
	{
		return "Email message server";
	}

}
