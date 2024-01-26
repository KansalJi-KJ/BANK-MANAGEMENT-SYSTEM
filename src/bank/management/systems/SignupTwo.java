
package bank.management.systems;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

   
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton ayes, ano, syes, sno;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel(" Page 2: ADDITIONAL Details ");
        additionalDetails.setFont(new Font ("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel(" Religion: ");
        name.setFont(new Font ("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel(" Category: ");
        fname.setFont(new Font ("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valcategory[] = {"Genereal","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel(" Income: ");
        dob.setFont(new Font ("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valincome[] = {"NUll","<= 1,50,00","<= 2,50,00","<= 5,00,00","<= 10,00,00"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel(" Educational ");
        gender.setFont(new Font ("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        
        
        JLabel email = new JLabel(" Qualification: ");
        email.setFont(new Font ("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel marital = new JLabel(" Occupation: ");
        marital.setFont(new Font ("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel address = new JLabel(" PAN Number: ");
        address.setFont(new Font ("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font ("Railway", Font.BOLD, 20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel(" Aadhar Number: ");
        city.setFont(new Font ("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font ("Railway", Font.BOLD, 20));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel State = new JLabel(" Senior Citizen: ");
        State.setFont(new Font ("Raleway", Font.BOLD, 20));
        State.setBounds(100, 540, 200, 30);
        add(State);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
               
        
        JLabel pincode = new JLabel(" Existing Account: ");
        pincode.setFont(new Font ("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        ayes = new JRadioButton("Yes");
        ayes.setBounds(300, 590, 100, 30);
        ayes.setBackground(Color.WHITE);
        add(ayes);
        
        ano = new JRadioButton("NO");
        ano.setBounds(450, 590, 100, 30);
        ano.setBackground(Color.WHITE);
        add(ano);
        
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(ayes);
        emaritalgroup.add(ano);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen = "NO";
        }
        
        
        String existingaccount = null;
        if(ayes.isSelected())
        {
            existingaccount = "Yes";
        }
        else if(ano.isSelected())
        {
            existingaccount = "NO";
        }
        
        
        String span = addressTextField.getText();
        String saadhar = cityTextField.getText();
        
        
        
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"' , '"+scategory+"', '"+sincome+"',  '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"' , '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
            }
            catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
        
    }
    
}
