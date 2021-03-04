import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.beans.PropertyVetoException;

import javax.swing.*;

class Ventana extends JFrame{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	GridBagLayout gbl2=new GridBagLayout();
	GridBagConstraints gbc2=new GridBagConstraints();
	JMenuBar menuBar;
	JMenu menuNaster,menuBooking,menuTestPerform,menuTransisation,menuLabReport,Priting,menuSetings,menuUtilities,menuWindow,menuHelp;
	JInternalFrame IF_DentroTodo;
	JButton btnadd,btnEdit,btnBlack,btnNext,btnList,btnSave,btnPrint,btnTest,btnCancel,btnSettings,btnDelet,btnSlip,btnExit;
	JToolBar barraDeHerramientas = new JToolBar("Barra de herramientas");
	public Ventana() {
				setResizable(false);//Para que no se estire la pantalla 
				setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				setSize(950, 720);
				setLocationRelativeTo(null);
				setTitle("InterFrames");
				setVisible(true);
				
				menuBar=new JMenuBar();
					menuNaster=new JMenu("Naster");
					menuBar.add(menuNaster);
					menuBooking=new JMenu("Booking");
					agregarJbar(menuBar, menuBooking);
					menuTestPerform=new JMenu("TestPerform");
					agregarJbar(menuBar, menuTestPerform);
					Priting=new JMenu("Priting");
					agregarJbar(menuBar, Priting);
					menuTransisation=new JMenu("Transation");
					agregarJbar(menuBar, menuTransisation);
					menuLabReport=new JMenu("Lab Report");
					agregarJbar(menuBar, menuLabReport);
					menuSetings=new JMenu("Setings");
					agregarJbar(menuBar, menuSetings);
					menuUtilities=new JMenu("Utilities");
					agregarJbar(menuBar, menuUtilities);
					menuWindow=new JMenu("Window");
					agregarJbar(menuBar, menuWindow);
					menuHelp=new JMenu("Help");
					menuHelp.addSeparator();
					getContentPane().add(barraDeHerramientas, BorderLayout.NORTH);
				setJMenuBar(menuBar);
				//----------------------------------------------
				
				ImageIcon icono=new ImageIcon("Iconos/add.png");
				btnadd=new JButton(icono);
				
				barraDeHerramientas.add(btnadd);
				icono=new ImageIcon("Iconos/Edit.png");
				btnEdit=new JButton(icono);
				btnBlack=new JButton(icono);
				
				barraDeHerramientas.add(btnBlack);
				icono=new ImageIcon("Iconos/Next.png");
				btnNext=new JButton(icono);
				
				barraDeHerramientas.add(btnNext);
				icono=new ImageIcon("Iconos/Save.png");
				btnSave=new JButton(icono);
				
				barraDeHerramientas.add(btnSave);
				icono=new ImageIcon("Iconos/Print.png");
				btnPrint=new JButton(icono);
				
				barraDeHerramientas.add(btnPrint);
				icono=new ImageIcon("Iconos/Ies.png");
				btnTest =new JButton(icono);
				barraDeHerramientas.add(btnTest);
				
				icono=new ImageIcon("Iconos/Cancel.png");
				btnCancel=new JButton(icono);
				barraDeHerramientas.add(btnCancel);
				
				icono=new ImageIcon("Iconos/Settings.png");
				btnSettings=new JButton(icono);
				barraDeHerramientas.add(btnSettings);
				
				icono=new ImageIcon("Iconos/Delet.png");
				btnDelet=new JButton(icono);
				
				barraDeHerramientas.add(btnDelet);
				icono=new ImageIcon("Iconos/Slip.png");
				btnSlip=new JButton(icono);
				
				barraDeHerramientas.add(btnSlip);
				icono=new ImageIcon("Iconos/Exit.png");
				btnExit=new JButton(icono);
				
				barraDeHerramientas.add(btnExit);
				
				//--------------------------------------------
				JDesktopPane dp = new JDesktopPane();
				dp.add(new JButton("asasa"));
				IF_DentroTodo = new JInternalFrame();
				IF_DentroTodo.getContentPane().setLayout(new FlowLayout());		
		        											// HIDE_ON_CLOSE para cerrar
				IF_DentroTodo.setDefaultCloseOperation(HIDE_ON_CLOSE);
				IF_DentroTodo.setTitle("");
				
				IF_DentroTodo.setIconifiable(true);
				
				// Boton para maximizar
				IF_DentroTodo.setResizable(true);
				
				// Boton para cerrar
				IF_DentroTodo.setClosable(true);
				
				IF_DentroTodo.setVisible(true);
				
				dp.add(IF_DentroTodo);
				try {
					IF_DentroTodo.setMaximum(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//add(IF_DentroTodo);No lo ponga compa
				//-------------------------------------
				
				
				JPanel panelSuperior=new JPanel();
				panelSuperior.setLayout(gbl2);
				panelSuperior.setBorder(BorderFactory.createTitledBorder("Datos"));
					paneSu(panelSuperior);
					IF_DentroTodo.add(panelSuperior);
					//------------------------------------------------------------------------
					JTextArea tablaImaginaria=new JTextArea(15,60);
					tablaImaginaria.setText("En este lugar iria una tabla imaginatelo :D");
					IF_DentroTodo.add(tablaImaginaria);
					//--------------------------------------------------------------------------
				JTextArea ta = new JTextArea(15, 60);
				llenado(GridBagConstraints.EAST, 0, 13, 5, 10, ta);
		
				JPanel panelIzq = new JPanel();
				panelIzq.setBackground(new Color(162, 217, 206));
				panelIzq.setPreferredSize(new Dimension(170, 250));
				llenado(GridBagConstraints.WEST,9,13, 3,5, panelIzq);
				
				panelIzq.add(new JLabel("Lotad led"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Lest amt"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Conssecion"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Home colector"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Lax AMT"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Net AMT"));
				panelIzq.add(new JTextField(5));
				
				panelIzq.add(new JLabel("Balance"));
				panelIzq.add(new JTextField(5));
				
				//panelIzq.add();
				IF_DentroTodo.add(panelIzq);
				//-----------------------------------
				//IF_DentroTodo.add());
				JLabel lblHOME = new JLabel("Home Collection");
		    	JLabel lblPAID = new JLabel("Paid");
		    	JLabel lblPAY = new JLabel("Pay Type");
		    	JLabel lblREC = new JLabel("Receipt No.");
		    	
		    	JTextField txt = new JTextField(5);
		    	JTextField txt1= new JTextField(5);
		    	JTextField txt3= new JTextField(5);
		    	
		    	IF_DentroTodo.add(lblHOME);
		    	IF_DentroTodo.add(txt);
		    	
		    	IF_DentroTodo.add(lblPAID);
		    	IF_DentroTodo.add(txt1);
		    	
		    	IF_DentroTodo.add(lblPAY);
		    	String elementos[] = {"CASH"};
		    	JComboBox <String>combo = new JComboBox<String>(elementos);
		    	IF_DentroTodo.add(combo);
		    	
		    	IF_DentroTodo.add(lblREC);
		    	IF_DentroTodo.add(txt3);
		    	//------------------------------------
		    	JPanel panelInferior = new JPanel();
		    	panelInferior.setBackground(Color.blue);
		    	panelInferior.setPreferredSize(new Dimension(900,50));
				IF_DentroTodo.add(panelInferior);
				//------------------------------------
				add(dp, BorderLayout.CENTER);
	}
	public void llenadoP2(JPanel panel,int x, int y,int altura,int largo,Component componente) {
		gbc2.gridx = x;
		gbc2.gridy = y;
		gbc2.gridheight = altura;;
		gbc2.gridwidth = largo;;

		gbc2.anchor = GridBagConstraints.WEST;

		gbl2.setConstraints(componente, gbc2);
		panel.add(componente, gbc2);
		
	}
	
	public void paneSu(JPanel panel) {
		JLabel label=new JLabel("Pacient ID");
		llenadoP2(panel,0, 0, 1, 1, label);
		llenadoP2(panel,1, 0, 1, 2, new JTextField(10));
		label=new JLabel("Date");
		llenadoP2(panel,5, 0, 1, 1, label);
		String v[]= {"##/##/##",""};
		JComboBox combo=new JComboBox(v);
		
		llenadoP2(panel, 6, 0, 1, 2, combo);
		label=new JLabel("Time (hh:mm)");
		llenadoP2(panel, 8, 0, 1, 1, label);
		JTextField caja1=new JTextField("0");
		llenadoP2(panel,10, 0, 1, 1, caja1);
		caja1=new JTextField("0");
		llenadoP2(panel,11, 0, 1, 1, new JLabel(":"));
		llenadoP2(panel,12, 0, 1, 1, caja1);
		llenadoP2(panel,13, 0, 1, 1, new JLabel("Lab No"));
		
		llenadoP2(panel,14, 0, 1, 1, new JTextField(10));
		
		llenadoP2(panel,0, 1, 1, 1, new JLabel("Name"));
		v[0]="Mr";
		combo=new JComboBox<String>(v);
		llenadoP2(panel, 1, 1, 1, 1,combo);
		llenadoP2(panel, 2, 1, 1, 1, new JTextField(10));
		
		llenadoP2(panel, 0, 2, 1, 1, new JLabel("Sex"));
		v[0]="Male";
		combo=new JComboBox(v);
		llenadoP2(panel, 2, 2, 1, 1, combo);
		llenadoP2(panel, 3, 2, 1, 1, new JLabel("Age"));
		llenadoP2(panel, 4, 2, 1, 1, new JTextField(2));
		llenadoP2(panel, 5, 2, 1, 1, new JLabel("Mons"));
		llenadoP2(panel, 6, 2, 1, 1, new JTextField(2));
		llenadoP2(panel, 7, 2, 1, 1, new JLabel("Days"));
		llenadoP2(panel, 8, 2, 1, 1, new JTextField(2));
		
		llenadoP2(panel,10, 2, 1, 1, new JLabel("Sample by"));
		llenadoP2(panel,11, 2, 1, 1, new JTextField(5));
		
		llenadoP2(panel,0, 3, 1, 1, new JLabel("Refered by: "));
		llenadoP2(panel,1, 3, 1, 1, new JTextField(5));
		
		llenadoP2(panel,10, 3, 1, 1, new JLabel("Panel code: "));
		llenadoP2(panel,11, 3, 1, 1, new JTextField(5));
		
		llenadoP2(panel,10, 4, 1, 1, new JLabel("e-mail: "));
		llenadoP2(panel,11, 4, 1, 1, new JTextField(5));
		//llenadoP2(panel,12, 4, 1, 1, new JTextArea(15,60));
		
	}
	
	

	public void agregarJbar(JMenuBar men,JMenu a) {
		men.add(a);
	}
	public void llenado(int rellenado,int x, int y,int altura,int largo,Component componente) {
		gbc.gridx= x;
		gbc.gridy=y;
		gbc.gridheight=altura;
		gbc.gridwidth=largo;
		gbc.fill=rellenado;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	
}
public class Prueba {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Ventana();
				
			}
		});

	}

}
