package sherwood.gameScreen.inputs;

public enum Control {
	UP, DOWN, LEFT, RIGHT, SPRINT, JUMP, ACTION;
	public static final int getCondensed(Control c) {
		for (int i=0; i<Control.values().length; i++)
			if (c==Control.values()[i])
				return i;
		return -1;
	}
}