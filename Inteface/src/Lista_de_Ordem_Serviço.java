import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTree;

public class Lista_de_Ordem_Serviço extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lista_de_Ordem_Serviço() {
		setLayout(null);
		
		JLabel lblListaDeOrdem = new JLabel("Lista de ordem de serviço");
		lblListaDeOrdem.setBounds(12, 12, 182, 22);
		add(lblListaDeOrdem);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ordem Alfabetica");
		rdbtnNewRadioButton.setBounds(291, 30, 149, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPorPrioridade = new JRadioButton("Por Prioridade");
		rdbtnPorPrioridade.setBounds(291, 68, 149, 23);
		add(rdbtnPorPrioridade);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Por Data");
		rdbtnNewRadioButton_1.setBounds(291, 109, 149, 23);
		add(rdbtnNewRadioButton_1);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(295, 156, 117, 25);
		add(btnListar);
		
		JTree tree = new JTree();
		tree.setBounds(22, 46, 83, 72);
		add(tree);
		
		JTree tree_1 = new JTree();
		tree_1.setBounds(22, 148, 83, 72);
		add(tree_1);
		
		JTree tree_2 = new JTree();
		tree_2.setBounds(180, 46, 83, 72);
		add(tree_2);
		
		JList list = new JList();
		list.setBounds(12, 33, 271, 255);
		add(list);

	}
}
