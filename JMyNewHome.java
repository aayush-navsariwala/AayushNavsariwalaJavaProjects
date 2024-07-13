package jmynewhome;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JMyNewHome extends JFrame {

    //Declaring the Aspen house R110 000
    private JRadioButton aspenOption;
    //Declaring the Britanny house R120 000 
    private JRadioButton brittanyOption;
    //Declaring the Colonial house R120 000
    private JRadioButton colonialOption;
    //Declaring the Dartmoor house R130 000
    private JRadioButton dartmoorOption;
    
    //Grouping for the type of house
    ButtonGroup typeButtonGroup;

    //Declaring the 2 bedroom option R10 500
    private JRadioButton twoBedroomOption;
    //Declaring the 3 bedroom option R21 000
    private JRadioButton threeBedroomOption;
    //Declaring the 4 bedroom option R31 500
    private JRadioButton fourBedroomOption;
    
    //Grouping for the amount of bedrooms
    ButtonGroup bedroomButtonGroup;

    //Declaring the 0 car garage
    private JRadioButton zeroCarGarageOption;
    //Declaring the 1 car garage
    private JRadioButton singleCarGarageOption;
    //Declaring the 2 car garage
    private JRadioButton doubleCarGarageOption;
    //Declaring the 3 car garage
    private JRadioButton threeCarGarageOption;
    
    //Grouping for the type of garage
    ButtonGroup garageButtonGroup;

    private JLabel housePriceLabel;

    //Declaring the price per bedroom R10 500
    private int pricePerBedroom;

    //Declaring the price per garage R7 755
    private int pricePerCarGarage;
    
    public JMyNewHome() {

        //To initialise the values 
        pricePerBedroom = 10500;

        pricePerCarGarage = 7775;

        //Creating the house type UI
        aspenOption = new JRadioButton("Aspen");
        brittanyOption = new JRadioButton("Brittany");
        colonialOption = new JRadioButton("Colonial");
        dartmoorOption = new JRadioButton("Dartmoor");
        
        //Grouping the objects
        typeButtonGroup = new ButtonGroup( );
        typeButtonGroup.add(aspenOption);
        typeButtonGroup.add(brittanyOption);
        typeButtonGroup.add(colonialOption);
        typeButtonGroup.add(dartmoorOption);
        
        //Making the default selected house Aspen
        aspenOption.setSelected( true );

        //Showing the different bedroom options
        twoBedroomOption = new JRadioButton("Two Bedrooms");
        threeBedroomOption = new JRadioButton("Three Bedrooms");
        fourBedroomOption = new JRadioButton("Four Bedrooms");
        
        //Selection grouping for the amount of bedrooms selcted
        bedroomButtonGroup = new ButtonGroup( );
        bedroomButtonGroup.add(twoBedroomOption);
        bedroomButtonGroup.add(threeBedroomOption);
        bedroomButtonGroup.add(fourBedroomOption);
        
        //Making the default selected bedrooms two
        twoBedroomOption.setSelected( true );

        //garage options
        zeroCarGarageOption = new JRadioButton("No car garage");
        singleCarGarageOption = new JRadioButton("Single car garage");
        doubleCarGarageOption = new JRadioButton("Double car garage");
        threeCarGarageOption = new JRadioButton("Three car garage");
        //garage grouping
        garageButtonGroup = new ButtonGroup( );
        garageButtonGroup.add(zeroCarGarageOption);
        garageButtonGroup.add(singleCarGarageOption);
        garageButtonGroup.add(doubleCarGarageOption);
        garageButtonGroup.add(threeCarGarageOption);
        // no garage by default
        zeroCarGarageOption.setSelected( true );

        //will display final results
        housePriceLabel = new JLabel("");

        // on click will trigger calculations
        JButton calculateButton = new JButton("Calculate");

        //ui layout, a grid 5x3
        GridLayout layout = new GridLayout( 5, 3 );
        JPanel content = new JPanel( );

        content.add(aspenOption);
        content.add(zeroCarGarageOption);
        content.add(twoBedroomOption);

        content.add(brittanyOption);
        content.add(singleCarGarageOption);
        content.add(threeBedroomOption);

        content.add(colonialOption);
        content.add(doubleCarGarageOption);
        content.add(fourBedroomOption);

        content.add(dartmoorOption);
        content.add(threeCarGarageOption);
        content.add(calculateButton );

        content.add( housePriceLabel );

        // on user clicks caculate
        calculateButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                //start with price 0
                int housePrice = 0;

                //check which house was selected add its price

                //check if aspen was selected
                if( aspenOption.isSelected( ) )
                    housePrice += 110000;
                else if( brittanyOption.isSelected( ) )
                    housePrice += 120000;
                else if( colonialOption.isSelected( ) )
                    housePrice += 120000;
                else if( dartmoorOption.isSelected( ) )
                    housePrice += 1300000;

                //add bedroom price
                if( twoBedroomOption.isSelected( ) )
                    housePrice += (2 * pricePerBedroom );
                else if(threeBedroomOption.isSelected())
                    housePrice += ( 3 * pricePerBedroom );
                else if(fourBedroomOption.isSelected())
                    housePrice += (4 * pricePerBedroom );

                //add garage costs
                if( singleCarGarageOption.isSelected( ) )
                    housePrice += ( 1 * pricePerCarGarage );
                else if( doubleCarGarageOption.isSelected( ) )
                    housePrice += ( 2 * pricePerCarGarage );
                else if( threeCarGarageOption.isSelected( ) )
                    housePrice += (3 * pricePerCarGarage );
                else if( fourBedroomOption.isSelected( ) )
                    housePrice += ( 4 * pricePerCarGarage );

                //display total result
                housePriceLabel.setText("House Price: $"+Integer.toString( housePrice ));
            }
        });

        content.setLayout( layout );
        setContentPane( content );

        setTitle("MyNewHome");
        setSize(640,250);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        //create window and display
        JMyNewHome window = new JMyNewHome( );
        window.setVisible( true );
    }
}

    
  
