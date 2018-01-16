/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//package org.jfree.chart.demo;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Mayur
 */

public class LayeredBarChart extends ApplicationFrame implements WindowListener{

    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public LayeredBarChart(final String title, Network network) {

        super(title);
        int size = network.getEnterpriseDirectory().getEnterpriseList().size();
       final double[][] data = new double[3][size];
        String[] waters = new String[] {"Storage","Available","Threshold"};
        String[] enterpriseName =new String[size];
        
         // create a dataset...
        int i = 0;
        //for(int i=0; i<size; i++){
             for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                 //do{
                    data[0][i] = enterprise.getWaterStorage();
                    data[1][i] = enterprise.getWaterAvail();
                    data[2][i] = enterprise.getWaterThreshold();
                    enterpriseName[i] = enterprise.getName();
                    i++;
                 //}while(i < size); 
                }
        //}
       
      

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(waters, enterpriseName, data);

        // create the chart...
        final CategoryAxis categoryAxis = new CategoryAxis("Measure");
        final ValueAxis valueAxis = new NumberAxis("Water(Gallons)");


        final CategoryPlot plot = new CategoryPlot(dataset,
                                             categoryAxis, 
                                             valueAxis, 
                                             new LayeredBarRenderer());
        
        plot.setOrientation(PlotOrientation.VERTICAL);
        final JFreeChart chart = new JFreeChart(
            "Enterprise Water Measures Chart", 
            JFreeChart.DEFAULT_TITLE_FONT, 
            plot, 
            true
        );
       // chart.setDefaultCloseOperation(ApplicationFrame.DISPOSE_ON_CLOSE);
        // set the background color for the chart...
        chart.setBackgroundPaint(Color.lightGray);

        final LayeredBarRenderer renderer = (LayeredBarRenderer) plot.getRenderer();

        // we can set each series bar width individually or let the renderer manage a standard view.
        // the width is set in percentage, where 1.0 is the maximum (100%).
        renderer.setSeriesBarWidth(0, 1.0);
        renderer.setSeriesBarWidth(1, 0.7);
        renderer.setSeriesBarWidth(2, 0.5);

        renderer.setItemMargin(0.01);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.25);
        domainAxis.setUpperMargin(0.05);
        domainAxis.setLowerMargin(0.05);

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
        
        

    }

    public void windowClosing(WindowEvent e) 
    { 
        this.dispose(); 

    } 

    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    

}
