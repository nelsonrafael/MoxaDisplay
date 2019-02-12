package display;

import java.awt.Graphics;

import javax.swing.JPanel;

import misc.Calculations;
import misc.Constants;

public class SimplePanel extends JPanel implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Area areaOne;
	private static Area areaTwo;
	private SimpleLabel[] labels;
	private static String[] info;

	public SimplePanel() {
		Calculations.startCalculations();
		setLayout(null);
		createAreasAndLabels();
		loadAll();
		repaint();
		displayAreas();
	}

	private void createAreasAndLabels() {
		info = new String[10];
		int xPos[] = Calculations.get_areasX();
		int yPos[] = Calculations.get_areasY();
		int xSize[] = Calculations.get_areasW();
		int ySize[] = Calculations.get_areasH();
		labels = new SimpleLabel[4];
		for (int i = 0; i < labels.length; i++) {
			SimpleLabel l = new SimpleLabel(xPos[i], yPos[i], xSize[i], ySize[i]);
			l.setBorder(Constants.get_colorBorder(), Constants.get_borderSize());
			labels[i] = l;
		}
		areaOne = new Area(Calculations.get_areaOneZonesArrays(), Calculations.get_areaOneCellsArrays(),
				Calculations.get_areaOneBackShape(), Constants.get_zoneNamesSize(), Constants.get_cellNamesSize());
		areaTwo = new Area(Calculations.get_areaTwoZonesArrays(), Calculations.get_areaTwoCellsArrays(),
				Calculations.get_areaTwoBackShape(), Constants.get_zoneNamesSize(), Constants.get_cellNamesSize());
	}

	public synchronized static void parseInfo(String input) {
		if (input == null) {
			return;
		}
		for (int i = 0; i < 5; i++) {
			info[i] = info[i + 5];
		}
		if (input.contains("<>")) {
			String[] arrOfStr = input.split("<>");
			for (int i = 0; i < 5; i++) {
				info[i + 5] = arrOfStr[i];
			}
		} else {
			for (int i = 0; i < 4; i++) {
				info[i + 5] = "";
				info[9] = input;
			}
		}
		displayAreas();
	}

	private static void displayAreas() {
		for (int i = 0; i < Constants.get_cellNamesSize(); i++) {
			areaOne.getCell(i).setText(Constants.get_cellNames(i), Constants.get_colorCellText(), Constants.get_font(),
					Constants.get_cellFontSize(), Constants.CENTER);
			areaTwo.getCell(i).setText(Constants.get_cellNames(i), Constants.get_colorCellText(), Constants.get_font(),
					Constants.get_cellFontSize(), Constants.CENTER);
		}
		areaOne.getZone(0).setText(info[0], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaOne.getZone(1).setText(info[1], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaOne.getZone(2).setText(info[2], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaOne.getZone(3).setText(info[3], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaOne.getZone(4).setText(info[4], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaTwo.getZone(0).setText(info[5], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaTwo.getZone(1).setText(info[6], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaTwo.getZone(2).setText(info[7], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaTwo.getZone(3).setText(info[8], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
		areaTwo.getZone(4).setText(info[9], Constants.get_colorZoneText(), Constants.get_font(),
				Constants.get_cellFontSize(), Constants.LEFT);
	}

	private void loadAll() {
		for (int i = 0; i < labels.length; i++) {
			if(i==2) {
				labels[i].setBorder(Constants.COLOR_YELLOW, Constants.get_borderSize());
			}else if(i==3) {
				labels[i].setBorder(Constants.COLOR_GREEN, Constants.get_borderSize());
			}
			this.add(labels[i]);
		}
		for (int i = 0; i < areaOne.getCells().length; i++) {
			// areaOne.getCell(i).setBorder(Constants.COLOR_BLACK,
			// Constants.get_borderSize());
			this.add(areaOne.getCell(i));
		}
		for (int i = 0; i < areaTwo.getCells().length; i++) {
			// areaTwo.getCell(i).setBorder(Constants.COLOR_BLACK,
			// Constants.get_borderSize());
			this.add(areaTwo.getCell(i));
		}
		for (int i = 0; i < areaOne.getZones().length; i++) {
			// areaOne.getZone(i).setBorder(Constants.COLOR_BLUE,
			// Constants.get_borderSize());
			this.add(areaOne.getZone(i));
		}
		for (int i = 0; i < areaTwo.getZones().length; i++) {
			// areaTwo.getZone(i).setBorder(Constants.COLOR_BLUE,
			// Constants.get_borderSize());
			this.add(areaTwo.getZone(i));
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		areaOne.getShapeBack().draw(g);
		areaTwo.getShapeBack().draw(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
