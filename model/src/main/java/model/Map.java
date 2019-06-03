package model;
import java.util.*;
import entity.*;
import java.sql.*;

public class DAOMap {
	
	//private int level = ;
	
	private int X;
	/**
	 * Gets X.
	 *
	 * @return X.
	 */
	public int getX() {
		return this.X;
	}

	/**
	 * Sets X.
	 *
	 * @param X
	 */
	private void setX(int X) {
		this.X = X;
	}
	
	private int Y;
	/**
	 * Gets Y.
	 *
	 * @return Y.
	 */
	public int getY() {
		return this.Y;
	}

	/**
	 * Sets Y.
	 *
	 * @param Y.
	 */
	public void setY(int Y) {
		this.Y = Y;
	}
	
	/**
     * Creates the map.
     */

	public void getLevel() {
	try {
		final String sql = "{call LevelOne}";
		final CallableStatement call = this.getConnection().prepareCall(sql);
		call.execute();
		System.out.println("Maxim si tu lis ça c'est que tout marche à peu près");
		final ResultSet resultSet = call.getResultSet();
		if (resultSet.first()) {
			helloWorld = new HelloWorld(resultSet.getInt("id"), code, resultSet.getString("message"));
		}
		return helloWorld;
	} catch (final SQLException e) {
		e.printStackTrace();
	}
	}
	
	  public static ArrayList<Objects> mapImage(){
	  
	  ArrayList<Objet> tabObjet=new ArrayList<Objet>();
	  	for(int X=0;X<24;X++) {
	  	System.out.println(level.getMap()[X][Y]);
	 	switch(level.getMap()[X][Y]){
	 
	 	case("t"):
	 		 Dirt dirt = new Dirt();
		break;
		
		case("e"):
			EmptyDirt emptyDirt = new EmptyDirt();
		break;
		
		case("X"):
			Wall wall = new Wall();
		break;
	
		case("b"):
			 Boulder boulder = new Boulder();
		break;
		
		case("d"):
			Diamond diamond = new Diamond();
		break;
		
		case("p"):
			 Player player = new Player();
		break;
		
		case("s"):
			Exit exit = new Exit();
		break;
			
		default:
			System.out.println("OOF");
		break;
		}
		}
		System.out.println("\n");
		}
		
}
