package br.com.jailson.cal.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color COR_CIZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CIZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);

		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

		// linha 1
		c.gridwidth = 3;
		aducuibarBotao("AC", COR_CIZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		aducuibarBotao("/", COR_LARANJA, c, 3, 0);

		// linha 2
		aducuibarBotao("7", COR_CIZA_CLARO, c, 0, 1);
		aducuibarBotao("8", COR_CIZA_CLARO, c, 1, 1);
		aducuibarBotao("9", COR_CIZA_CLARO, c, 2, 1);
		aducuibarBotao("*", COR_LARANJA, c, 3, 1);

		// linha 3
		aducuibarBotao("4", COR_CIZA_CLARO, c, 0, 2);
		aducuibarBotao("5", COR_CIZA_CLARO, c, 1, 2);
		aducuibarBotao("6", COR_CIZA_CLARO, c, 2, 2);
		aducuibarBotao("-", COR_LARANJA, c, 3, 2);

		// linha 4
		aducuibarBotao("1", COR_CIZA_CLARO, c, 0, 3);
		aducuibarBotao("2", COR_CIZA_CLARO, c, 1, 3);
		aducuibarBotao("3", COR_CIZA_CLARO, c, 2, 3);
		aducuibarBotao("+", COR_LARANJA, c, 3, 3);

		// linha 5
		c.gridwidth = 2;
		aducuibarBotao("0", COR_CIZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		aducuibarBotao(",", COR_CIZA_CLARO, c, 2, 4);
		aducuibarBotao("=", COR_CIZA_CLARO, c, 3, 4);

	}

	private void aducuibarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = y;
		c.gridx = x;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}

	}
}
