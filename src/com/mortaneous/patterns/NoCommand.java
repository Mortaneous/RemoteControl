/*
 * NoCommand.java
 */
 
package com.mortaneous.patterns;

public class NoCommand implements Command
{
	public NoCommand() {};
	
	public void execute() {};
	
	@Override
	public String toString()
	{
		return "[none]";
	}
}