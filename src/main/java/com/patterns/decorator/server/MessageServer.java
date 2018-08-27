package com.patterns.decorator.server;

public interface MessageServer 
{
	void sendMessage();
	void receiveMessage();
	boolean isRunning();
	String description();
}
