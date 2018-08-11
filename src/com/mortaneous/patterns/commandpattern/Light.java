/*
 * Light.java
 */

package com.mortaneous.patterns.commandpattern;

public interface Light
{
	public void on();
	public void off();
	public boolean isOn();
	
	public String toString();
}