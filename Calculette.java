package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Calculette extends JFrame{
	
	private boolean selectOp=false;
	private boolean newNumber=false;
	private double x=0d;
	String operateur = "";
	private JLabel ecran =new JLabel();
	private JPanel panEcran = new JPanel();
	private JPanel clavier = new JPanel();
	private JPanel operations = new JPanel();
	//private Dimension dim1 = new Dimension(50,40);
	//private Dimension dim2 = new Dimension(50,31);
	
	JButton bouton1 = new JButton("1");
	JButton bouton2 = new JButton("2");
	JButton bouton3 = new JButton("3");
	JButton bouton4 = new JButton("4");
	JButton bouton5 = new JButton("5");
	JButton bouton6 = new JButton("6");
	JButton bouton7 = new JButton("7");
	JButton bouton8 = new JButton("8");
	JButton bouton9 = new JButton("9");
	JButton bouton0 = new JButton("0");
	JButton boutonPt = new JButton(".");
	JButton boutonEgal = new JButton("=");
	
	JButton boutonC = new JButton("C");
	JButton boutonPlus = new JButton("+");
	JButton boutonMoins = new JButton("-");
	JButton boutonMult = new JButton("x");
	JButton boutonDivis = new JButton("/");
	
	public Calculette(){
		
		this.setTitle("Calculette");
		this.setSize(240, 260);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		initComponent();
		// Operations finales
		panEcran.add(ecran);
		panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
		this.getContentPane().add(panEcran, BorderLayout.NORTH);
		this.getContentPane().add(clavier, BorderLayout.CENTER);
		this.getContentPane().add(operations, BorderLayout.EAST);
		this.setVisible(true);
	}
	
	// Actions du clavier
	class BoutonClavListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			if (newNumber) {
				ecran.setText("");
			}
			newNumber=false;
			if (arg0.getSource().equals(bouton0)){
				ecran.setText(ecran.getText()+"0");
			}
			if (arg0.getSource()==bouton1){
				ecran.setText(ecran.getText()+"1");
			}
			if (arg0.getSource()==bouton2){
				ecran.setText(ecran.getText()+"2");
			}
			if (arg0.getSource()==bouton3){
				ecran.setText(ecran.getText()+"3");
			}
			if (arg0.getSource()==bouton4){
				ecran.setText(ecran.getText()+"4");
			}
			if (arg0.getSource()==bouton5){
				ecran.setText(ecran.getText()+"5");
			}
			if (arg0.getSource()==bouton6){
				ecran.setText(ecran.getText()+"6");
			}
			if (arg0.getSource()==bouton7){
				ecran.setText(ecran.getText()+"7");
			}
			if (arg0.getSource()==bouton8){
				ecran.setText(ecran.getText()+"8");
			}
			if (arg0.getSource()==bouton9){
				ecran.setText(ecran.getText()+"9");
			}
			if (arg0.getSource()==boutonPt){
				ecran.setText(ecran.getText()+".");
				boutonPt.setEnabled(false);
			}
			if (arg0.getSource()==boutonEgal){
				calcul();
				newNumber=true;
				boutonPt.setEnabled(true);
				selectOp=false;
				operateur="";
			}
		}
	}
	
	// Actions des opérations
	class BoutonOpListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			boutonPt.setEnabled(true);
			if (arg0.getSource()==boutonC){
				newNumber=true;
				selectOp=false;
				operateur="";
				ecran.setText("");
				x=0d;
			}
			if (arg0.getSource()==boutonPlus){
				if (selectOp==true) {
					calcul();
				}
				x = Double.valueOf(ecran.getText()).doubleValue();
				newNumber=true;
				selectOp=true;
				operateur="+";
			}
			if (arg0.getSource()==boutonMoins){
				if (selectOp==true) {
					calcul();
				}
				x = Double.valueOf(ecran.getText()).doubleValue();
				newNumber=true;
				selectOp=true;
				operateur="-";
			}
			if (arg0.getSource()==boutonMult){
				if (selectOp==true) {
					calcul();
				}
				x = Double.valueOf(ecran.getText()).doubleValue();
				newNumber=true;
				selectOp=true;
				operateur="x";
			}
			if (arg0.getSource()==boutonDivis){
				if (selectOp==true) {
					calcul();
				}
				x = Double.valueOf(ecran.getText()).doubleValue();
				newNumber=true;
				selectOp=true;
				operateur="/";
			}
		}
	}
	
	public void initComponent(){
		// Initialisation écran
		ecran.setText("");
		ecran.setPreferredSize(new Dimension(215,25));
		ecran.setHorizontalAlignment(JLabel.RIGHT);
		
		panEcran.setPreferredSize(new Dimension(220,30));
		
		// ============================================
		// Définition du clavier
		// ============================================
		GridLayout gl = new GridLayout();
		gl.setColumns(3);
		gl.setRows(4);
		gl.setHgap(5);
		gl.setVgap(5);
		clavier.setLayout(gl);
		
		clavier.add(bouton1);
		clavier.add(bouton2);
		clavier.add(bouton3);
		clavier.add(bouton4);
		clavier.add(bouton5);
		clavier.add(bouton6);
		clavier.add(bouton7);
		clavier.add(bouton8);
		clavier.add(bouton9);
		clavier.add(bouton0);
		clavier.add(boutonPt);
		clavier.add(boutonEgal);
		
		bouton0.addActionListener(new BoutonClavListener());
		bouton1.addActionListener(new BoutonClavListener());
		bouton2.addActionListener(new BoutonClavListener());
		bouton3.addActionListener(new BoutonClavListener());
		bouton4.addActionListener(new BoutonClavListener());
		bouton5.addActionListener(new BoutonClavListener());
		bouton6.addActionListener(new BoutonClavListener());
		bouton7.addActionListener(new BoutonClavListener());
		bouton8.addActionListener(new BoutonClavListener());
		bouton9.addActionListener(new BoutonClavListener());
		boutonPt.addActionListener(new BoutonClavListener());
		boutonEgal.addActionListener(new BoutonClavListener());
		
		// =============================================
		// Définition des opérations
		// =============================================
		operations.setPreferredSize(new Dimension(55,225));
		
		GridLayout gl2 = new GridLayout();
		gl2.setColumns(1);
		gl2.setRows(5);
		gl2.setHgap(5);
		gl2.setVgap(5);
		operations.setLayout(gl2);
		
		operations.add(boutonC);
		operations.add(boutonPlus);
		operations.add(boutonMoins);
		operations.add(boutonMult);
		operations.add(boutonDivis);


		boutonC.addActionListener(new BoutonOpListener());
		boutonPlus.addActionListener(new BoutonOpListener());
		boutonMoins.addActionListener(new BoutonOpListener());
		boutonMult.addActionListener(new BoutonOpListener());
		boutonDivis.addActionListener(new BoutonOpListener());
	}
	
	void calcul(){
		if (operateur.equals("+")){
			x = x+Double.valueOf(this.ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(x));
		}
		if (operateur.equals("-")){
			x = x - Double.valueOf(this.ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(x));
		}		
		if (operateur.equals("x")){
			x = x * Double.valueOf(this.ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(x));
		}
		if (operateur.equals("/")){
			try{
				x = x/Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(x));
			} catch (ArithmeticException e) {
				ecran.setText("Division par 0...");
			}
		}
		if (operateur.equals("")){
			this.ecran.setText("Pas d'opération définie !");
		}
	}
	
	// Method main() lançant le programme
	public static void main(String[] args){
		new Calculette();
	}
}
