package com.dkte;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame {
	private JButton showDialogButton;
	public MyWindow() {
		this.setTitle("My Window");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		
		showDialogButton = new JButton("Show Dialog...");
		showDialogButton.setBounds(300, 280, 200, 40);
		this.add(showDialogButton);
		
		showDialogButton.addActionListener((e) -> {
			EssayDialog dlg = new EssayDialog();
			dlg.setModal(true); // false: modelss dialog, true: modal dialog
			dlg.setVisible(true);
			// get data from dialog box and display on msg box
			String message = "Title: " + dlg.getTitle() + "\nEssay:" + dlg.getEssay();
			JOptionPane.showMessageDialog(this, message);
		});
	}
}
