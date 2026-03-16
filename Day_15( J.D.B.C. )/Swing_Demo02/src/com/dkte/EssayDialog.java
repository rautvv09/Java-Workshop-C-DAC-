package com.dkte;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EssayDialog extends JDialog {
	private JLabel titleLabel;
	private JTextField titleTextField;
	private JTextArea essayTextArea;
	private JButton submitButton;
	private JScrollPane essayScrollPane;
	private String title = "";
	private String essay = "";
	
	public EssayDialog() {
		this.setTitle("Essay");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
	
		titleLabel = new JLabel("Title: ");
		titleLabel.setBounds(50, 20, 80, 30);
		this.add(titleLabel);
		
		titleTextField = new JTextField();
		titleTextField.setBounds(150, 20, 150, 30);
		this.add(titleTextField);
		
		essayTextArea = new JTextArea();
		essayScrollPane = new JScrollPane(essayTextArea);
		essayScrollPane.setBounds(50, 60, 300, 150);
		this.add(essayScrollPane);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(150, 220, 100, 30);
		this.add(submitButton);
		
		submitButton.addActionListener((e) -> {
			this.title = titleTextField.getText();
			this.essay = essayTextArea.getText();
			this.dispose(); // destroy the dialog box
		});
	}

	public String getTitle() {
		return title;
	}

	public String getEssay() {
		return essay;
	}
}
