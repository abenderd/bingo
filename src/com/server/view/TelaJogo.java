package com.server.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TelaJogo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton btnNewButton = new JToggleButton("01");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 11, 53, 45);
		contentPane.add(btnNewButton);
		
		JToggleButton button = new JToggleButton("01");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(73, 11, 53, 45);
		contentPane.add(button);
		
		JToggleButton button_1 = new JToggleButton("01");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(136, 11, 53, 45);
		contentPane.add(button_1);
		
		JToggleButton button_2 = new JToggleButton("01");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(199, 11, 53, 45);
		contentPane.add(button_2);
		
		JToggleButton button_3 = new JToggleButton("01");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBounds(262, 11, 53, 45);
		contentPane.add(button_3);
		
		JToggleButton button_4 = new JToggleButton("01");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(10, 67, 53, 45);
		contentPane.add(button_4);
		
		JToggleButton button_5 = new JToggleButton("01");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBounds(73, 67, 53, 45);
		contentPane.add(button_5);
		
		JToggleButton button_6 = new JToggleButton("01");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBounds(136, 67, 53, 45);
		contentPane.add(button_6);
		
		JToggleButton button_7 = new JToggleButton("01");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBounds(199, 67, 53, 45);
		contentPane.add(button_7);
		
		JToggleButton button_8 = new JToggleButton("01");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBounds(262, 67, 53, 45);
		contentPane.add(button_8);
		
		JToggleButton button_9 = new JToggleButton("01");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBounds(10, 123, 53, 45);
		contentPane.add(button_9);
		
		JToggleButton button_10 = new JToggleButton("01");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBounds(10, 179, 53, 45);
		contentPane.add(button_10);
		
		JToggleButton button_11 = new JToggleButton("01");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.setBounds(10, 235, 53, 45);
		contentPane.add(button_11);
		
		JToggleButton button_12 = new JToggleButton("01");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setBounds(73, 123, 53, 45);
		contentPane.add(button_12);
		
		JToggleButton button_13 = new JToggleButton("01");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.setBounds(73, 179, 53, 45);
		contentPane.add(button_13);
		
		JToggleButton button_14 = new JToggleButton("BINGO");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 5));
		button_14.setBounds(136, 123, 53, 45);
		contentPane.add(button_14);
		
		JToggleButton button_15 = new JToggleButton("01");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setBounds(199, 123, 53, 45);
		contentPane.add(button_15);
		
		JToggleButton button_16 = new JToggleButton("01");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setBounds(262, 123, 53, 45);
		contentPane.add(button_16);
		
		JToggleButton button_17 = new JToggleButton("01");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.setBounds(136, 179, 53, 45);
		contentPane.add(button_17);
		
		JToggleButton button_18 = new JToggleButton("01");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_18.setBounds(199, 179, 53, 45);
		contentPane.add(button_18);
		
		JToggleButton button_19 = new JToggleButton("01");
		button_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_19.setBounds(262, 179, 53, 45);
		contentPane.add(button_19);
		
		JToggleButton button_20 = new JToggleButton("01");
		button_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_20.setBounds(73, 235, 53, 45);
		contentPane.add(button_20);
		
		JToggleButton button_21 = new JToggleButton("01");
		button_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_21.setBounds(136, 235, 53, 45);
		contentPane.add(button_21);
		
		JToggleButton button_22 = new JToggleButton("01");
		button_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_22.setBounds(199, 235, 53, 45);
		contentPane.add(button_22);
		
		JToggleButton button_23 = new JToggleButton("01");
		button_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_23.setBounds(262, 235, 53, 45);
		contentPane.add(button_23);
		
		JLabel lblNmeroSorteado = new JLabel("N\u00FAmero Sorteado:");
		lblNmeroSorteado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNmeroSorteado.setBounds(73, 311, 137, 14);
		contentPane.add(lblNmeroSorteado);
		
		JLabel lblXx = new JLabel("xx");
		lblXx.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXx.setBounds(220, 311, 46, 14);
		contentPane.add(lblXx);
	}
}
