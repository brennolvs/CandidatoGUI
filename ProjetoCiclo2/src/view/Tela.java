package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerCandidato;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Tela extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JButton btnEnviar;
	private JButton btnLimpar;


	public Tela() {
		
		/**
		 * Construção da tela
		 */
		setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInscrição = new JLabel("INSCRI\u00C7\u00C3O DO CANDIDATO");
		lblInscrição.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInscrição.setBounds(51, 11, 212, 40);
		contentPane.add(lblInscrição);
		
		JLabel lblnome = new JLabel("NOME");
		lblnome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblnome.setBounds(32, 62, 57, 17);
		contentPane.add(lblnome);
		
		txtNome = new JTextField();
		txtNome.setBounds(32, 85, 242, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(32, 121, 57, 17);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(32, 144, 242, 20);
		contentPane.add(txtCpf);
		
		JLabel lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargo.setBounds(32, 184, 57, 17);
		contentPane.add(lblCargo);
		
		JRadioButton rdbtnFundamental = new JRadioButton("Professor de Ensino Fundamental");
		rdbtnFundamental.setBounds(32, 212, 242, 23);
		contentPane.add(rdbtnFundamental);
		
		JRadioButton rdbtnMedio = new JRadioButton("Professor de Ensino M\u00E9dio");
		rdbtnMedio.setBounds(32, 238, 242, 23);
		contentPane.add(rdbtnMedio);
		
		JRadioButton rdbtnSuperior = new JRadioButton("Professor de Ensino Superior");
		rdbtnSuperior.setBounds(32, 264, 242, 23);
		contentPane.add(rdbtnSuperior);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(32, 316, 108, 23);
		contentPane.add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEnviar.setBounds(166, 317, 108, 23);
		contentPane.add(btnEnviar);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	/**
	 * Criação do método de limpar
	 */
	public void limpar() {
		txtCpf.setText("");
		txtNome.setText("");
	}
	public class Ouvinte implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnLimpar) {
				limpar();
			}
			if(e.getSource()==btnEnviar) {
				if((txtNome.equals(""))||(txtCpf.equals(""))){
					JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "ATENÇÃO", 2,null);
				}else {
					JOptionPane.showMessageDialog(null, "DADOS CADASTRADOS COM SUCESSOS!", "SUCESSO", 1,null);
				
			}
			}
		}
		
	}
}
