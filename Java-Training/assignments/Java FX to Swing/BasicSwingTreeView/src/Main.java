import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Main {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JLabel pathLabel;
   private JPanel controlPanel;
   private JTree tree;
   private TreePath tp;

   public Main(){
      prepareGUI();
   }
   public static void main(String[] args){
      Main swingControlDemo = new Main();      
      swingControlDemo.showTableDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(400,600);
      mainFrame.setLayout(new GridLayout(3, 1));

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("Selection is: ",JLabel.CENTER);
      pathLabel = new JLabel("Selection is: ",JLabel.CENTER);
      //statusLabel.setSize(350,300);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.add(pathLabel);
      mainFrame.setVisible(true);  
   }
   private void showTableDemo(){
      headerLabel.setText("Control in action: JTree"); 
      // Create a root tree item as department
      DefaultMutableTreeNode food = new DefaultMutableTreeNode("Food");

      //create other tree items as department names
      DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
      DefaultMutableTreeNode vegetables = new DefaultMutableTreeNode("Vegetables");
      DefaultMutableTreeNode nuts = new DefaultMutableTreeNode("Nuts");

      //create other tree items as employees
      DefaultMutableTreeNode apples = new DefaultMutableTreeNode("Apples");
      DefaultMutableTreeNode pears = new DefaultMutableTreeNode("Pears");
      DefaultMutableTreeNode oranges = new DefaultMutableTreeNode("Oranges");

      //add employees to sales department
      fruits.add(apples);
      fruits.add(pears);
      fruits.add(oranges);

      DefaultMutableTreeNode fuji = new DefaultMutableTreeNode("Fuji");
      DefaultMutableTreeNode winesap = new DefaultMutableTreeNode("Winesap");
      DefaultMutableTreeNode clark = new DefaultMutableTreeNode("Clark");
      
      apples.add(fuji);
      apples.add(winesap);
      apples.add(clark);
      
      //create other tree items as employees
      DefaultMutableTreeNode corn = new DefaultMutableTreeNode("Corn");
      DefaultMutableTreeNode peas = new DefaultMutableTreeNode("Pears");
      DefaultMutableTreeNode broccoli = new DefaultMutableTreeNode("Broccoli");
      DefaultMutableTreeNode beans = new DefaultMutableTreeNode("Beans");

      //add employees to marketing department
      vegetables.add(corn);
      vegetables.add(peas); 
      vegetables.add(broccoli);
      vegetables.add(beans);
      
      //create other tree items as employees
      DefaultMutableTreeNode walnuts = new DefaultMutableTreeNode("Walnuts");
      DefaultMutableTreeNode almonds = new DefaultMutableTreeNode("Almonds");
      DefaultMutableTreeNode pistachios = new DefaultMutableTreeNode("Pistachios");
      DefaultMutableTreeNode cashews = new DefaultMutableTreeNode("Cashews");

      //add employees to sales department
      nuts.add(walnuts);
      nuts.add(almonds);
      nuts.add(pistachios);
      nuts.add(cashews);

      //add departments to department item
      food.add(fruits);
      food.add(vegetables);
      food.add(nuts);

      
      //create the tree with department as root node
      tree = new JTree(food);
      JScrollPane treeView = new JScrollPane(tree);
      controlPanel.add(treeView);
      tree.setSize(500, 500);
      mainFrame.setVisible(true);     
   
   
   tree.addMouseListener(new MouseAdapter() {
	      public void mouseClicked(MouseEvent me) {
	        doMouseClicked(me);
	      }
	    });
	  }

	  void doMouseClicked(MouseEvent me) {
	    tp = tree.getPathForLocation(me.getX(), me.getY());
	    if (tp != null)
	      statusLabel.setText("Complete Path is " + tp.toString());
	      //pathLabel.setText(tp.getPathForRow(me.getX()));
	    else
	      statusLabel.setText("");
	  }
}