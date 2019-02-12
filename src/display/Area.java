package display;

import misc.Constants;
import primitives.Shape;
import primitives.Square;

public class Area {
	private int zonesVar[][], cellsVar[][];
	private SimpleLabel[] zones, cells;
	private Shape back;
	private int numberOfZones, numberOfCells;

	public Area(int[][] zV, int[][] cV, int[] bArr, int nZ, int nC) {
		this.zonesVar = zV;
		this.cellsVar = cV;
		this.back = new Square(bArr[0], bArr[1], bArr[2], bArr[3]);
		this.back.setColor(Constants.get_colorBackShape());
		this.zones = new SimpleLabel[nZ];
		this.cells = new SimpleLabel[nC];
		this.numberOfZones = nZ;
		this.numberOfCells = nC;
		generateZones();
		generateCells();
	}

	public void generateZones() {
		for (int i = 0; i < numberOfZones; i++) {
			SimpleLabel l = new SimpleLabel(zonesVar[i][0], zonesVar[i][1], zonesVar[i][2], zonesVar[i][3]);
			this.zones[i] = l;
		}
	}

	public void generateCells() {
		for (int i = 0; i < numberOfCells; i++) {
			SimpleLabel l = new SimpleLabel(cellsVar[i][0], cellsVar[i][1], cellsVar[i][2], cellsVar[i][3]);
			this.cells[i] = l;
		}
	}

	public SimpleLabel getZone(int n) {
		return this.zones[n];
	}

	public SimpleLabel[] getZones() {
		return this.zones;
	}

	public SimpleLabel getCell(int n) {
		return this.cells[n];
	}

	public SimpleLabel[] getCells() {
		return this.cells;
	}

	public Shape getShapeBack() {
		return this.back;
	}
}