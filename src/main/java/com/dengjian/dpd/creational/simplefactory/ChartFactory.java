package com.dengjian.dpd.creational.simplefactory;

public class ChartFactory {

	public static Chart getChartInstance(String chartType) {
		if("line".equals(chartType)) {
			return new LineChart();
		} else if("pie".equals(chartType)) {
			return new PieChart();
		}
		
		return null;
	}
}
