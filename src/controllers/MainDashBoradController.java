/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainDashBoradController implements Initializable {

	@FXML
	private AnchorPane anchor;

	@FXML
	private JFXButton homeBtn;

	@FXML
	private JFXButton assignmentBtn;

	@FXML
	private JFXButton progressreportBtn;

	@FXML
	private JFXButton calendarBtn;

	@FXML
	private JFXButton courseMaterialBtn;

	@FXML
	private JFXButton discussionBtn;

	@FXML
	private JFXHamburger hamburger;

	@FXML
	private JFXDrawer drawer;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
			opencloseDrawer(e);
		});

	}

	public void opencloseDrawer(MouseEvent event) {

		drawer.setSidePane();
		HamburgerBackArrowBasicTransition resize;
		resize = new HamburgerBackArrowBasicTransition(hamburger);
		//resize.setRate(resize.getRate() * -1);
		resize.setRate(-1);
		
		resize.setRate(resize.getRate() * -1);
		resize.play();

		
		

		if (drawer.isShown()) {
			
			drawer.close();
			
			}
		else {
			
			//
			drawer.open();
			
		}

	}
}
