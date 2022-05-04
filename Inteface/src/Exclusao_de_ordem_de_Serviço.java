import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Exclusao_de_ordem_de_Serviço extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Exclusao_de_ordem_de_Serviço() {
		setLayout(null);
		
		JLabel lblExclusoDeOrdem = new JLabel("Exclusão de Ordem de Serviço");
		lblExclusoDeOrdem.setBounds(92, 12, 211, 32);
		add(lblExclusoDeOrdem);
		
		JLabel lblBuscarOrdemDe = new JLabel("Buscar ordem de Serviço");
		lblBuscarOrdemDe.setBounds(34, 56, 184, 15);
		add(lblBuscarOrdemDe);
		
		textField = new JTextField();
		textField.setBounds(34, 83, 364, 19);
		add(textField);
		textField.setColumns(10);
		
		JTree tree = new JTree();
		tree.setBounds(49, 143, 254, 83);
		add(tree);
		
		JLabel lblSelecioneAOrdem = new JLabel("Selecione a ordem a ser excluida");
		lblSelecioneAOrdem.setBounds(34, 114, 233, 17);
		add(lblSelecioneAOrdem);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(295, 238, 117, 25);
		add(btnExcluir);

	}
}
