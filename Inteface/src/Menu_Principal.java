import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Principal extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu_Principal() {
		setLayout(null);
		
		JLabel lblMenuPrincipal = new JLabel("MENU PRINCIPAL");
		lblMenuPrincipal.setBounds(166, 12, 115, 39);
		add(lblMenuPrincipal);
		
		JButton btnNewButton = new JButton("INCLUSÃO ORDEM DE SERVIÇO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(106, 51, 243, 25);
		add(btnNewButton);
		
		JButton btnListaDeOrdem = new JButton("LISTA DE ORDEM DE SERVIÇO");
		btnListaDeOrdem.setBounds(106, 125, 236, 25);
		add(btnListaDeOrdem);
		
		JButton btnExclusoDeOrdem = new JButton("EXCLUSÃO DE ORDEM DE SERVIÇO");
		btnExclusoDeOrdem.setBounds(106, 88, 268, 25);
		add(btnExclusoDeOrdem);
		
		JButton btnLoguinDeUsuario = new JButton("LOGIN DE USUARIO");
		btnLoguinDeUsuario.setBounds(106, 162, 208, 25);
		add(btnLoguinDeUsuario);
		
		JButton btnCadastroDeUsuario = new JButton("CADASTRO DE USUARIO");
		btnCadastroDeUsuario.setBounds(106, 202, 208, 25);
		add(btnCadastroDeUsuario);
		
		JButton btnNewButton_5 = new JButton("SAIR");
		btnNewButton_5.setBounds(25, 318, 117, 25);
		add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("AJUDA");
		btnNewButton_5_1.setBounds(291, 318, 117, 25);
		add(btnNewButton_5_1);
		
		JLabel lblThiagoMartins = new JLabel("THIAGO MARTINS");
		lblThiagoMartins.setBounds(303, 388, 117, 15);
		add(lblThiagoMartins);
		
		JLabel lblRenataDeSa = new JLabel("RENATA DE SA SALVARANI");
		lblRenataDeSa.setBounds(226, 359, 194, 15);
		add(lblRenataDeSa);

	}

}
