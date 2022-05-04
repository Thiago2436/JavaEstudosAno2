import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LoginTela1 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public LoginTela1() {
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(280, 230, 117, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(55, 55, 342, 39);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do Usuario");
		lblNewLabel.setBounds(59, 12, 139, 44);
		add(lblNewLabel);
		
		JLabel lblDigiteSuaSenha = new JLabel("Digite sua senha");
		lblDigiteSuaSenha.setBounds(55, 106, 139, 44);
		add(lblDigiteSuaSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(55, 149, 347, 39);
		textField_1.setColumns(10);
		add(textField_1);

	}
}
