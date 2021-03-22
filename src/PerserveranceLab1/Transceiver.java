/**
 * 
 */
package PerserveranceLab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 128123
 *
 */
public class Transceiver implements SelfCheckCapable {
	String Receiver;
	String Antenna;
	
	/**
	 * 
	 * Commands sent to the rover
	 */
	InputCommand() {
		
	}
	
	/**
	 * 
	 * Commands from to the rover
	 */
	OutputCommand() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
