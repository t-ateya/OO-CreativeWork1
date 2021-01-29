package View;

import java.awt.event.MouseEvent;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Controller.DataController;
import Controller.DataControllerInterface;

public class DataView extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// Composition
	private DataControllerInterface controller = new DataController();
	private JScrollPane jScrollPanel;
	private JButton loadData;
	private JLabel myLabel;
	private JTextArea myMessage;
	private JButton writeData;
	


	public DataView() {
		initComponents();

	}

	@SuppressWarnings("Unchecked")

	private void initComponents() {
		myLabel = new JLabel();
		loadData = new JButton();
		jScrollPanel = new JScrollPane();
		myMessage = new JTextArea();
		writeData = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setName("My Data View Frame");

		myLabel.setText("The text is currently not loaded...");

		loadData.setText("Load Data");
		loadData.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent event) {
				loadDataWhenMouseClicked(event);
			}


		});

		myMessage.setColumns(20);
		myMessage.setRows(5);
		jScrollPanel.setViewportView(myMessage);

		writeData.setText("Write Data");
		writeData.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent event){
				writeDataWhenMouseClicked(event);
			}
		});

		var layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(myLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
							.addComponent(jScrollPanel))
						.addContainerGap())
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap (0, 0, Short.MAX_VALUE)
						.addComponent(loadData)
						.addGap(158, 158, 158))))
			.addGroup(layout.createSequentialGroup()
				.addGap(154, 154, 154)
				.addComponent(writeData)
				.addGap(0, 0, Short.MAX_VALUE))
		);

		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(myLabel)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(loadData)
				.addGap(39, 39, 39)
				.addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(writeData)
				.addContainerGap(82, Short.MAX_VALUE))
				
		);
		pack();



	}

	private  void writeDataWhenMouseClicked(MouseEvent event) {
		String message  = myMessage.getText();
		controller.writeMessage(message);
	}

	private void loadDataWhenMouseClicked(MouseEvent event) {
		try {
			String data = controller.getMessage();
			myLabel.setText(data);
			myLabel.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[]args){
		java.awt.EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				new DataView().setVisible(true);

			}
			
		});
	}
	

	
}
