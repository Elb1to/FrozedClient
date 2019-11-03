package (YourClient).mods.impl;

import (YourClient).gui.hud.ScreenPosition;
import (YourClient).mods.ModDraggable;

// Remember to replace "(YourClient)" with the actual name of your client
// Also remove the "(" and ")"
// Duh xd

public class ModToggleSprint extends ModDraggable {

	private static ScreenPosition pos;
	private String ToggleSprint;
	
	@Override
	public int getWidth() {
		return 42;
	}

	@Override
	public int getHeight() {
		return 10;
	}

	@Override
	public void render(ScreenPosition pos) {
		font.drawString(ToggleSprint, pos.getAbsoluteX(), pos.getAbsoluteY(), 0xFF00FFFF);
		/*
	 	* I'm currently working on the Toggle Event
	 	* so ToggleSprint can actually be toggleable
	 	* if(mc.gameSettings.CLIENT_TOGGLE_SPRINT.isPressed()) {
	 	*/
		if(isEnabled()) {
			this.ToggleSprint = "§bSprinting";
			mc.thePlayer.setSprinting(true);
		} /*else {
			this.ToggleSprint = "§bWalking";
			mc.thePlayer.setSprinting(false);
		}*/
		
	}

	@Override
	public void save(ScreenPosition pos) {
		this.pos = pos;
	}

	@Override
	public ScreenPosition load() {
		return pos;
	}

}
