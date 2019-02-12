package misc;

import java.awt.Color;

public class Constants {
	// Port of server
	private static int SERVER_PORT = 6666;
	// Size of the border
	private static int BORDER_SIZE = 10;
	// Font
	private static final String FONT = "Monospaced";
	// Cell font text size
	private static final int CELL_FONT_SIZE = 30;
	// Screen sizes
	private static final int SCREEN_HEIGHT = 600;
	private static final int SCREEN_WIDTH = 800;
	// Name of the cells that appear in the output
	private static final String[] CELL_NAMES = { "ORDEM:", "MAT:", "QTD:", "PROX CT:" };
	// Name of all zones to display
	private static final String[] ZONE_NAMES = { "ORDEM:", "MAT:", "QTD:", "PROX CT:", "Descritivo" };
	// Default color for borders
	private static final Color COLOR_BORDER = new Color(96, 96, 96);
	// Default color for back shape
	private static final Color COLOR_BACK_SHAPE = new Color(0, 0, 0);
	// Default color, for my sake. This can't be changed!
	private static final Color COLOR_DEFAULT = new Color(255, 255, 255);
	// Default cell text color
	private static final Color COLOR_CELL_TEXT = new Color(192, 192, 192);
	// Default zone text color
	private static final Color COLOR_ZONE_TEXT = new Color(255, 255, 255);
	//Text position variables
	public static final int LEFT = 1;
	public static final int CENTER = 2;
	public static final int RIGHT = 3;
	// Colors
	public static final Color COLOR_BLACK = new Color(0, 0, 0);
	public static final Color COLOR_RED = new Color(255, 0, 0);
	public static final Color COLOR_LIGHTER_RED = new Color(255, 51, 51);
	public static final Color COLOR_LIGHT_RED = new Color(255, 102, 102);
	public static final Color COLOR_GREEN = new Color(0, 255, 0);
	public static final Color COLOR_LIGHTER_GREEN = new Color(51, 255, 51);
	public static final Color COLOR_LIGHT_GREEN = new Color(102, 255, 102);
	public static final Color COLOR_VERY_LIGHT_GREEN = new Color(153, 255, 153);
	public static final Color COLOR_BLUE = new Color(0, 0, 255);
	public static final Color COLOR_LIGHT_BLUE_ONE = new Color(153, 204, 255);
	public static final Color COLOR_LIGHT_BLUE_TWO = new Color(51, 153, 255);
	public static final Color COLOR_YELLOW = new Color(255, 255, 0);
	public static final Color COLOR_LIGHTER_YELLOW = new Color(255, 255, 51);
	public static final Color COLOR_LIGHT_YELLOW = new Color(255, 255, 102);
	public static final Color COLOR_ORANGE = new Color(255, 140, 0);
	public static final Color COLOR_GREY = new Color(96, 96, 96);
	public static final Color COLOR_DARK_GREY = new Color(64, 64, 64);
	public static final Color COLOR_LIGHT_GREY = new Color(192, 192, 192);
	public static final Color COLOR_CYAN = new Color(0, 255, 255);
	public static final Color COLOR_LIGHT_CYAN = new Color(102, 255, 255);
	public static final Color COLOR_WHITE = new Color(255, 255, 255);
	
	public static int get_serverPort() {
		return Constants.SERVER_PORT;
	}
	
	public static int get_zoneNamesSize() {
		return Constants.ZONE_NAMES.length;
	}
	
	public static String get_cellNames(int n) {
		return Constants.CELL_NAMES[n];
	}
	
	public static int get_cellNamesSize() {
		return Constants.CELL_NAMES.length;
	}

	public static int get_screenHeight() {
		return Constants.SCREEN_HEIGHT;
	}

	public static int get_screenWidth() {
		return Constants.SCREEN_WIDTH;
	}

	public static void set_borderSize(int n) {
		Constants.BORDER_SIZE = n;
	}

	public static int get_borderSize() {
		return Constants.BORDER_SIZE;
	}
	
	public static String get_font() {
		return Constants.FONT;
	}
	
	public static int get_cellFontSize() {
		return Constants.CELL_FONT_SIZE;
	}
	
	public static Color get_colorZoneText() {
		return Constants.COLOR_ZONE_TEXT;
	}
	
	public static Color get_colorCellText() {
		return Constants.COLOR_CELL_TEXT;
	}
	
	public static Color get_colorBorder() {
		return Constants.COLOR_BORDER;
	}
	
	public static Color get_colorBackShape() {
		return Constants.COLOR_BACK_SHAPE;
	}

	public static Color get_colorDefault() {
		return Constants.COLOR_DEFAULT;
	}
}
