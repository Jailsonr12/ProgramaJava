package Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");

		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// fecha no X
		janela.setSize(600, 400);// tamanho da tela
		janela.setLayout(new FlowLayout());// tamanho do botao??
		janela.setLocationRelativeTo(null);

		JButton botao = new JButton("Clicar!");
		janela.add(botao); // adicininando botal na tela
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu");
		});

//      botao.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//		System.out.println("Evento ocorreu");//resporta quando clicar no botao
//			}
//		});

		janela.setVisible(true);// ativando a visibilidade da tela
	}
}
