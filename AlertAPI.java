package fr.northenflo.frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AlertAPI {

	public static JPanel alert_panel = new JPanel();
	public static JLabel alert_label = new JLabel();
	
	public static void Show(String message, String status){
		alert_panel.setVisible(true);
		alert_label.setText(message);
		if(status.equalsIgnoreCase("danger")){
			alert_panel.setBackground(new Color(231,72,69));
		}else if(status.equalsIgnoreCase("success")){
			alert_panel.setBackground(new Color(65,176,67));
		}else if(status.equalsIgnoreCase("infos")){
			alert_panel.setBackground(new Color(77, 163, 205));
		}else{
			System.out.println("[LOG] Erreur lors de l'affichage du FlashAlert");
		}
	}
	
	public static JPanel AddAlertPanel(int x_p, int y_p, int x_s, int y_s)
	{
		alert_panel.setBounds(x_p, y_p, x_s, y_s);
		alert_panel.setVisible(false);
		alert_panel.setLayout(new BoxLayout(alert_panel, BoxLayout.Y_AXIS));
		alert_panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		alert_panel.setBorder(new EmptyBorder(2, 10, 10, 10));
		alert_label.setBounds(10, 10, 20, 20);
		alert_label.setFont(LFrame.font_ui_hallyos.deriveFont(16.0F));
		alert_label.setForeground(Color.WHITE);
		alert_panel.add(alert_label);
		return alert_panel;
	}
}
