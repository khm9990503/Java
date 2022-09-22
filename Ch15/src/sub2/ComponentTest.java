package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 42, 92, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("컴포넌트 실습하기");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 10, 170, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(22, 67, 70, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(93, 67, 70, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btn3.setBounds(163, 67, 70, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn4.setBounds(233, 67, 70, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel = new JLabel("TextField 컴포넌트");
		lblNewLabel.setBounds(12, 100, 113, 22);
		contentPane.add(lblNewLabel);
		
		txtf1 = new JTextField();
		txtf1.setBounds(22, 125, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(22, 153, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(22, 181, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxt1result = new JLabel("결과 :");
		lbltxt1result.setBounds(224, 128, 183, 15);
		contentPane.add(lbltxt1result);
		
		JLabel lbltxt2result = new JLabel("결과 :");
		lbltxt2result.setBounds(224, 156, 183, 15);
		contentPane.add(lbltxt2result);
		
		JLabel lbltxt3result = new JLabel("결과 :");
		lbltxt3result.setBounds(224, 184, 183, 15);
		contentPane.add(lbltxt3result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxt1result.setText("결과 : "+txt);
				
			}
		});
		btntxtf1.setBounds(150, 124, 62, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxt2result.setText("결과 : "+txt);
				
			}
		});
		btntxtf2.setBounds(150, 152, 62, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf3.getText();
				lbltxt3result.setText("결과 : "+txt);
				
			}
		});
		btntxtf3.setBounds(150, 180, 62, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 213, 113, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요");
		lblNewLabel_4.setBounds(35, 236, 92, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(35, 257, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(93, 257, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(150, 257, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(208, 257, 55, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(267, 257, 61, 23);
		contentPane.add(chk5);
		
		JLabel lblchkresult = new JLabel("결과 :");
		lblchkresult.setBounds(35, 286, 293, 15);
		contentPane.add(lblchkresult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblchkresult.setText("결과 : "+chks.toString());
			}
		});
		btnchk.setBounds(336, 257, 62, 23);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(12, 311, 126, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdmale = new JRadioButton("남자");
		rdmale.setBounds(35, 335, 62, 23);
		contentPane.add(rdmale);
		
		
		JRadioButton rdfemale = new JRadioButton("여자");
		rdfemale.setBounds(101, 335, 62, 23);
		contentPane.add(rdfemale);
		
		JLabel lblgenderresult = new JLabel("결과 :");
		lblgenderresult.setBounds(35, 365, 90, 15);
		contentPane.add(lblgenderresult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdfemale);
		bg.add(rdmale);
		
		JButton btngender = new JButton("확인");
		btngender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> rds = new ArrayList<>();
				
				if(rdmale.isSelected()) {
					rds.add(rdmale.getText());
				}else {
					rds.add(rdfemale.getText());
				}
				
				lblgenderresult.setText("결과 : "+rds.toString());
				
			}
		});
		btngender.setBounds(206, 335, 70, 23);
		contentPane.add(btngender);
		
		
		
		
		

	}
}
