package misc;

public class Calculations {
	private static int SCREEN_WIDTH;
	private static int SCREEN_HEIGHT;
	// Coordinates and size of labels for the rectangles border
	private static int[] AREA_ONE_BACK_SHAPE = new int[4], AREA_TWO_BACK_SHAPE = new int[4];
	private static int[][] AREAS = new int[4][4], AREA_ONE_ZONES_ARRAY = new int[Constants.get_zoneNamesSize()][4],
			AREA_ONE_CELLS_ARRAY = new int[Constants.get_cellNamesSize()][4],
			AREA_TWO_ZONES_ARRAY = new int[Constants.get_zoneNamesSize()][4],
			AREA_TWO_CELLS_ARRAY = new int[Constants.get_cellNamesSize()][4];

	public static void startCalculations() {
		set_screenDimensions();
		set_areasArrays();
		set_shapeArrays();
		set_areaCellsArray();
		set_areaZonesArray();
	}

	private static void set_areaZonesArray() {
		AREA_ONE_ZONES_ARRAY[0][0] = AREA_ONE_CELLS_ARRAY[0][2] + Constants.get_borderSize();
		AREA_ONE_ZONES_ARRAY[0][1] = Constants.get_borderSize();
		AREA_ONE_ZONES_ARRAY[0][2] = 190;
		AREA_ONE_ZONES_ARRAY[0][3] = 60;
		AREA_ONE_ZONES_ARRAY[1][0] = AREA_ONE_CELLS_ARRAY[1][2] + AREA_ONE_CELLS_ARRAY[1][0];
		AREA_ONE_ZONES_ARRAY[1][1] = Constants.get_borderSize();
		AREA_ONE_ZONES_ARRAY[1][2] = 130;
		AREA_ONE_ZONES_ARRAY[1][3] = 60;
		AREA_ONE_ZONES_ARRAY[2][0] = AREA_ONE_CELLS_ARRAY[2][2] + AREA_ONE_CELLS_ARRAY[2][0];
		AREA_ONE_ZONES_ARRAY[2][1] = Constants.get_borderSize();
		AREA_ONE_ZONES_ARRAY[2][2] = 100;
		AREA_ONE_ZONES_ARRAY[2][3] = 60;
		AREA_ONE_ZONES_ARRAY[3][0] = AREA_ONE_CELLS_ARRAY[3][2] + AREA_ONE_CELLS_ARRAY[3][0];
		AREA_ONE_ZONES_ARRAY[3][1] = AREA_ONE_CELLS_ARRAY[3][1];
		AREA_ONE_ZONES_ARRAY[3][2] = 600;
		AREA_ONE_ZONES_ARRAY[3][3] = 60;
		AREA_ONE_ZONES_ARRAY[4][0] = AREA_ONE_CELLS_ARRAY[0][0];
		AREA_ONE_ZONES_ARRAY[4][1] = AREA_ONE_ZONES_ARRAY[0][1] + AREA_ONE_ZONES_ARRAY[0][3];
		AREA_ONE_ZONES_ARRAY[4][2] = 780;
		AREA_ONE_ZONES_ARRAY[4][3] = 160;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				AREA_TWO_ZONES_ARRAY[i][j] = AREA_ONE_ZONES_ARRAY[i][j];
				if (j == 1) {
					AREA_TWO_ZONES_ARRAY[i][j] += 290;
				}
			}
		}
	}

	private static void set_areaCellsArray() {
		AREA_ONE_CELLS_ARRAY[0][0] = Constants.get_borderSize();
		AREA_ONE_CELLS_ARRAY[0][1] = Constants.get_borderSize();
		AREA_ONE_CELLS_ARRAY[0][2] = 150;
		AREA_ONE_CELLS_ARRAY[0][3] = 60;
		AREA_ONE_CELLS_ARRAY[1][0] = Constants.get_borderSize() + 340;
		AREA_ONE_CELLS_ARRAY[1][1] = Constants.get_borderSize();
		AREA_ONE_CELLS_ARRAY[1][2] = 110;
		AREA_ONE_CELLS_ARRAY[1][3] = AREA_ONE_CELLS_ARRAY[0][3];
		AREA_ONE_CELLS_ARRAY[2][0] = Constants.get_borderSize() + 580;
		AREA_ONE_CELLS_ARRAY[2][1] = Constants.get_borderSize();
		AREA_ONE_CELLS_ARRAY[2][2] = 100;
		AREA_ONE_CELLS_ARRAY[2][3] = AREA_ONE_CELLS_ARRAY[0][3];
		AREA_ONE_CELLS_ARRAY[3][0] = Constants.get_borderSize();
		AREA_ONE_CELLS_ARRAY[3][1] = 230;
		AREA_ONE_CELLS_ARRAY[3][2] = 180;
		AREA_ONE_CELLS_ARRAY[3][3] = AREA_ONE_CELLS_ARRAY[0][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				AREA_TWO_CELLS_ARRAY[i][j] = AREA_ONE_CELLS_ARRAY[i][j];
				if (j == 1) {
					AREA_TWO_CELLS_ARRAY[i][j] += 290;
				}
			}
		}
	}

	private static void set_shapeArrays() {
		for (int i = 0; i < 4; i++) {
			Calculations.AREA_ONE_BACK_SHAPE[i] = Calculations.AREAS[i][0];
			Calculations.AREA_TWO_BACK_SHAPE[i] = Calculations.AREAS[i][1];
		}
	}

	private static void set_areasArrays() {
		Calculations.AREAS[0][0] = 0;
		Calculations.AREAS[0][1] = 0;
		Calculations.AREAS[1][0] = 0;
		Calculations.AREAS[1][1] = Calculations.SCREEN_HEIGHT / 2 - Constants.get_borderSize();
		Calculations.AREAS[2][0] = Calculations.SCREEN_WIDTH;
		Calculations.AREAS[2][1] = Calculations.SCREEN_WIDTH;
		Calculations.AREAS[3][0] = Calculations.SCREEN_HEIGHT / 2;
		Calculations.AREAS[3][1] = Calculations.SCREEN_HEIGHT / 2;
		
		Calculations.AREAS[0][2] = Constants.get_borderSize();
		Calculations.AREAS[0][3] = Constants.get_borderSize();
		Calculations.AREAS[1][2] = Constants.get_borderSize();
		Calculations.AREAS[1][3] = Calculations.SCREEN_HEIGHT / 2;
		Calculations.AREAS[2][2] = Calculations.SCREEN_WIDTH - 2 * Constants.get_borderSize();
		Calculations.AREAS[2][3] = Calculations.SCREEN_WIDTH - 2 * Constants.get_borderSize();
		Calculations.AREAS[3][2] = 10;
		Calculations.AREAS[3][3] = 10;
	}

	public static int[][] get_areaOneZonesArrays() {
		return Calculations.AREA_ONE_ZONES_ARRAY;
	}

	public static int[][] get_areaTwoZonesArrays() {
		return Calculations.AREA_TWO_ZONES_ARRAY;
	}

	public static int[][] get_areaOneCellsArrays() {
		return Calculations.AREA_ONE_CELLS_ARRAY;
	}

	public static int[][] get_areaTwoCellsArrays() {
		return Calculations.AREA_TWO_CELLS_ARRAY;
	}

	public static int[] get_areaTwoBackShape() {
		return Calculations.AREA_TWO_BACK_SHAPE;
	}

	public static int[] get_areaOneBackShape() {
		return Calculations.AREA_ONE_BACK_SHAPE;
	}

	public static int[] get_areasX() {
		return Calculations.AREAS[0];
	}

	public static int[] get_areasY() {
		return Calculations.AREAS[1];
	}

	public static int[] get_areasW() {
		return Calculations.AREAS[2];
	}

	public static int[] get_areasH() {
		return Calculations.AREAS[3];
	}

	private static void set_screenDimensions() {
		Calculations.SCREEN_WIDTH = Constants.get_screenWidth();
		Calculations.SCREEN_HEIGHT = Constants.get_screenHeight();
	}
}
