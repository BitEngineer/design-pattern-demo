package com.dengjian.dpd.creational.simplefactory;

public class Test {

	public static void main(String[] args) {
		Chart lineChart = ChartFactory.getChartInstance("line");
		lineChart.display();
		Chart pieChart = ChartFactory.getChartInstance("pie");
		pieChart.display();
	}
}
