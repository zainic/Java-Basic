
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider implements ChangeListener{
	
	JFrame frame;
	JPanel panel1, panel2;
	JLabel celcius, fahrenheit, reamur, kelvin;
	JSlider slider;
	
	Double f,r,k;
	
	Slider(){
		
		frame = new JFrame("Slider Demo");
		frame.setLayout(null);
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.green);
		panel1.setBounds(0, 0, 500, 200);
		panel2.setBounds(0, 200, 500, 300);
		celcius = new JLabel();
		fahrenheit = new JLabel();
		reamur = new JLabel();
		kelvin = new JLabel();
		slider = new JSlider(0, 100, 50);
		
		celcius.setText(slider.getValue() + " °C");
		celcius.setFont(new Font("Courier New", Font.BOLD, 20));
		celcius.setBounds(0, 0, 500, 50);
		celcius.setHorizontalAlignment(JLabel.CENTER);
		
		f = 32 + (9./5)*slider.getValue();
		fahrenheit.setText(f + " °F");
		fahrenheit.setFont(new Font("Courier New", Font.BOLD, 20));
		fahrenheit.setBounds(0, 50, 500, 50);
		fahrenheit.setHorizontalAlignment(JLabel.CENTER);
		
		r = (4./5)*slider.getValue();
		reamur.setText(r + " °R");
		reamur.setFont(new Font("Courier New", Font.BOLD, 20));
		reamur.setBounds(0, 100, 500, 50);
		reamur.setHorizontalAlignment(JLabel.CENTER);
		
		k = 273.15 + slider.getValue();
		kelvin.setText(k + " °K");
		kelvin.setFont(new Font("Courier New", Font.BOLD, 20));
		kelvin.setBounds(0, 150, 500, 50);
		kelvin.setHorizontalAlignment(JLabel.CENTER);
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setBackground(Color.yellow);
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("Courier New", Font.BOLD, 10));
		
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setOrientation(SwingConstants.HORIZONTAL);
		
		slider.addChangeListener(this);
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		panel1.add(slider);
		panel2.add(celcius);
		panel2.add(fahrenheit);
		panel2.add(reamur);
		panel2.add(kelvin);
		
		frame.add(panel1);
		frame.add(panel2);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		celcius.setText(slider.getValue() + " °C");
		
		f = 32 + (9./5)*slider.getValue();
		fahrenheit.setText(f + " °F");
		
		r = (4./5)*slider.getValue();
		reamur.setText(r + " °R");
		
		k = 273.15 + slider.getValue();
		kelvin.setText(k + " °K");
		
	}
	
}
