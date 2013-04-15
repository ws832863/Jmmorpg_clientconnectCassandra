package game;

import game.cliente.connections.HostConnect;
import game.cliente.core.Game;

import org.newdawn.slick.SlickException;

/**
 * 
 * @author shuo wang
 * 
 *         the main class,establish connection with server and load client
 *         resource;
 */
public class LaunchGame {

	public static void main(String[] args) {
		try {
			HostConnect hostConnect = new HostConnect();
			hostConnect.login();// get connected with the server//shuowang
			Game g = new Game("libs/resources.jar", hostConnect);
			System.out.println("test");
			g.launch();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
