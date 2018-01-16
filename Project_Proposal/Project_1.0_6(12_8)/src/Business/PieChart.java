/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//package org.jfree.chart.demo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;
/**
 *
 * @author Mayur
 */

public class PieChart extends ApplicationFrame {

    /**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public PieChart(final String title) {

        super(title);

        // create a dataset...
        final DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Java", new Double(43.2));
        data.setValue("Visual Basic", new Double(10.0));
        data.setValue("C/C++", new Double(17.5));
        data.setValue("PHP", new Double(32.5));
        data.setValue("Perl", new Double(12.5));

        // create the chart...
        final JFreeChart chart = ChartFactory.createPieChart3D(
            "Pie Chart 3D Demo 2",  // chart title
            data,                   // data
            true,                   // include legend
            true,
            false
        );

        chart.setBackgroundPaint(Color.CYAN);
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(90);
        plot.setDirection(Rotation.ANTICLOCKWISE);
        plot.setForegroundAlpha(0.90f);
        plot.setInteriorGap(0.33);
        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);

        final Rotator rotator = new Rotator(plot);
        rotator.start();

    }

    

}

