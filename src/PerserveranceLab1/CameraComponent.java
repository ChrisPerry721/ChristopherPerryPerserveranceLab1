/**
 * 
 */
package PerserveranceLab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 128123
 *
 */
public class CameraComponent implements SelfCheckCapable {
	String Camera;
	String Resolution;
	
	/**
	 * CameraCompnent takes a picture 
	 * @returns images or videos from Optics and Detection
	 */
	
	CameraComponent TakePicture () {
		
	}
	
	/**
	* Video/Picture is processed
	* @returns picture ad video in high resolution
	*/
	DigitalProcessing () {
			
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
