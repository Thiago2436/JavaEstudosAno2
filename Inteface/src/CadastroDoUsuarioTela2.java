import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroDoUsuarioTela2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public CadastroDoUsuarioTela2() {
		setLayout(null);
		
		JLabel lblCadastroDeUsusario = new JLabel("Cadastro de Ususario");
		lblCadastroDeUsusario.setBounds(123, 12, 160, 15);
		add(lblCadastroDeUsusario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 35, 70, 15);
		add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(12, 62, 370, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(12, 105, 70, 15);
		add(lblEndereo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 132, 370, 19);
		add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(12, 175, 70, 15);
		add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 202, 96, 19);
		add(textField_2);
		
		JLabel lblRg = new JLabel("R.G:");
		lblRg.setBounds(123, 175, 70, 15);
		add(lblRg);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 202, 114, 19);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF.");
		lblCpf.setBounds(243, 175, 70, 15);
		add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(243, 202, 114, 19);
		add(textField_4);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(289, 242, 117, 25);
		add(btnCadastrar);

	}

}
