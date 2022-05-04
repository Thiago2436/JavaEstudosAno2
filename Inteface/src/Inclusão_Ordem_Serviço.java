import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;

public class Inclusão_Ordem_Serviço extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inclusão_Ordem_Serviço() {
		setLayout(null);
		
		JLabel lblInclusoDeOrdem = new JLabel("Inclusão De ordem De serviço");
		lblInclusoDeOrdem.setBounds(38, 12, 236, 15);
		add(lblInclusoDeOrdem);
		
		JLabel lblTipoDeServio = new JLabel("Tipo De serviço");
		lblTipoDeServio.setBounds(12, 39, 124, 15);
		add(lblTipoDeServio);
		
		JCheckBox chckbxJardinagem = new JCheckBox("Jardinagem");
		chckbxJardinagem.setBounds(7, 62, 129, 23);
		add(chckbxJardinagem);
		
		JCheckBox chckbxHidraulica = new JCheckBox("Hidraulica");
		chckbxHidraulica.setBounds(145, 62, 129, 23);
		add(chckbxHidraulica);
		
		JCheckBox chckbxEletrica = new JCheckBox("Eletrica");
		chckbxEletrica.setBounds(276, 62, 129, 23);
		add(chckbxEletrica);
		
		JCheckBox chckbxManutenoGeral = new JCheckBox("Manutenção Geral");
		chckbxManutenoGeral.setBounds(7, 94, 163, 23);
		add(chckbxManutenoGeral);
		
		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setBounds(12, 139, 98, 15);
		add(lblPrioridade);
		
		JRadioButton rdbtnUrgenteDias = new JRadioButton("Urgente( 3 dias uteis)");
		rdbtnUrgenteDias.setBounds(12, 162, 198, 23);
		add(rdbtnUrgenteDias);
		
		JRadioButton rdbtnNormaldiasUteis = new JRadioButton("Normal( 7dias uteis)");
		rdbtnNormaldiasUteis.setBounds(214, 162, 198, 23);
		add(rdbtnNormaldiasUteis);
		
		JLabel lblDataDaOs = new JLabel("Data da O.S");
		lblDataDaOs.setBounds(12, 214, 124, 23);
		add(lblDataDaOs);
		
		JLabel lblNewLabel = new JLabel("___/__/______");
		lblNewLabel.setBounds(26, 249, 84, 23);
		add(lblNewLabel);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(288, 236, 117, 25);
		add(btnIncluir);

	}
}
