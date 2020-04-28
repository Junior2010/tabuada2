package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableFrame extends JFrame {
	private final BorderLayout layout;
	private final JPanel northPanel;
	private final JPanel southPanel;
	private final JPanel leftPanel;
//	private final JPanel rigthPanel;
	private final JLabel tableOfLabel;
	private final JComboBox<String> tableOfComboBox;
	private final JLabel operationLabel;
	private final JComboBox operationComboBox;
	private final JButton tryButton;
	private final JButton checkButton;
	private final JButton againButton;

	// Valores dos combobox
	private final String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	private final String[] operations = { "Adição", "Subtração", "Multiplicação", "Divisão" };

	// Elementos dinamicos
	private JTextField[] leftFIrstOperandTextFields;
	private JLabel[] operatorLabels;
	private JTextField[] leftSecondOperandTextFields;
	private final JLabel[] equalLabels;
	private JTextField[] leftSResultTextFields;
	private JPanel[] operandsPanel;

	//

	public TableFrame() {
		// Cria parte norte do painel
		northPanel = new JPanel(new FlowLayout());
		tableOfLabel = new JLabel("Tabela de");
		tableOfComboBox = new JComboBox(numbers);
		tableOfComboBox.setMaximumRowCount(10);

		operationLabel = new JLabel("Tipor de operação");
		operationComboBox = new JComboBox(operations);

		tryButton = new JButton("Iniciar treino");
		TryButtonHandler handler = new TryButtonHandler();
		tryButton.addActionListener(handler);

		northPanel.add(tableOfLabel);
		northPanel.add(tableOfComboBox);
		northPanel.add(operationLabel);
		northPanel.add(operationComboBox);
		northPanel.add(tryButton);

		// Cria parte sul do painel
		southPanel = new JPanel(new FlowLayout());
		checkButton = new JButton("Conferir");
		againButton = new JButton("Tentar novamente");
		southPanel.add(checkButton);
		southPanel.add(againButton);

		// cria o painel central esquerdo
		int numberOfRows = 5; //TODO mudar esta forma de tratamento para uma forma mais genérica
		leftPanel = new JPanel(new GridLayout(0, 5));
		leftFIrstOperandTextFields = new JTextField[numberOfRows];
		leftSecondOperandTextFields = new JTextField[numberOfRows];
		leftSResultTextFields = new JTextField[numberOfRows];
		operatorLabels = new JLabel[numberOfRows];
		equalLabels = new JLabel[numberOfRows];

		for (int i = 0; i < numberOfRows; i++) {
			leftFIrstOperandTextFields[i] = new JTextField("1º Operando (" + i + ")");
			leftPanel.add(leftFIrstOperandTextFields[i]);

			operatorLabels[i] = new JLabel("?");
			leftPanel.add(operatorLabels[i]);

			leftSecondOperandTextFields[i] = new JTextField("2º Operando (" + i + ")");
			leftPanel.add(leftSecondOperandTextFields[i]);

			equalLabels[i] = new JLabel("?");
			leftPanel.add(equalLabels[i]);

			leftSResultTextFields[i] = new JTextField("Resultado (" + i + ")");
			leftPanel.add(leftSResultTextFields[i]);
		}

		layout = new BorderLayout(5, 5);
		setLayout(layout);
		add(northPanel, BorderLayout.NORTH);
		add(leftPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);

	}

	private class TryButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Recupera o valor da combo 1 (1-10) e o ÍNDICE da combo2 (0-3)
			String temp = (String) tableOfComboBox.getSelectedItem();
			int tableOfValue = Integer.parseInt(temp);
			int operationValue = operationComboBox.getSelectedIndex();

			//Altera o conteúdo dos labels de sinais e das editText primeiro operando
			int numberOfRows = 5; //TODO mudar esta forma de tratamento para uma forma mais genérica
			for (int i = 0; i < numberOfRows; i++)
			{
				leftFIrstOperandTextFields[i].setText("" + tableOfValue);
				equalLabels[i].setText("=");
			}
		}

	}
}
