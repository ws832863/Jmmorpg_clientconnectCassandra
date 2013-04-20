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
		new LaunchGame("player2", "player");
	}
	
	
	

	public LaunchGame(String username, String pwd) {
		try {
			//darkstar client instance, communicate with the server
			HostConnect hostConnect = new HostConnect();
			//login with a username and password
			hostConnect.setUser(username, pwd);
			hostConnect.login();// get connected with the
			Game g = new Game("libs/resources.jar", hostConnect);
			System.out.println("test");
			g.launch();

		} catch (SlickException ex) {
			ex.printStackTrace();
		}
	}

}
