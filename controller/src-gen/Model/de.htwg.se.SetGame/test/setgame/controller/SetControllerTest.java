package setgame.controller;


import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.setgame.controller.impl.SetController;
import de.htwg.se.setgame.modell.ICard;

public class SetControllerTest {
	SetController setcontroll;
	LinkedList<ICard> aSetListe;

	@Before
	public void setUp() {
		this.setcontroll = new SetController();
		this.aSetListe = new LinkedList<ICard>();
		aSetListe.addAll(this.setcontroll.getSetInField());
	}

	@Test
	public void testSetController() {
		System.out.println(this.setcontroll.geTplayerOnePoints());
	}

	@Test
	public void testIsAsetForController() {
		setcontroll.isAsetForController(aSetListe.get(0), aSetListe.get(1), aSetListe.get(2), setcontroll.getPlayerOne());
		
	}

}
