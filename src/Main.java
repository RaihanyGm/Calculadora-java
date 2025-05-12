import javax.swing.*;

class Valores {
    static String valorTextField = "";
    static int  valor1;
    static String opcao;
    static int  valor2;
}

class TesteSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo de JButton");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(30, 100, 100, 30);

        JTextField field = new JTextField();
        field.setBounds(30, 20, 217, 40);
        field.disable();

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(30, 80, 50, 25);

        JButton buttonSub = new JButton("-");
        buttonSub.setBounds(85, 80, 50, 25);

        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(140, 80, 50, 25);

        JButton buttonMult = new JButton("*");
        buttonMult.setBounds(195, 80, 50, 25);

        JButton buttonC = new JButton("C");
        buttonC.setBounds(195, 110, 50, 25);

        JButton buttonIgual = new JButton("=");
        buttonIgual.setBounds(195, 140, 50, 85);

        JButton button1 = new JButton("1");
        button1.setBounds(30, 110, 50, 25);

        JButton button2 = new JButton("2");
        button2.setBounds(85, 110, 50, 25);

        JButton button3 = new JButton("3");
        button3.setBounds(140, 110, 50, 25);

        JButton button4 = new JButton("4");
        button4.setBounds(30, 140, 50, 25);

        JButton button5 = new JButton("5");
        button5.setBounds(85, 140, 50, 25);

        JButton button6 = new JButton("6");
        button6.setBounds(140, 140, 50, 25);

        JButton button7 = new JButton("7");
        button7.setBounds(30, 170, 50, 25);

        JButton button8 = new JButton("8");
        button8.setBounds(85, 170, 50, 25);

        JButton button9 = new JButton("9");
        button9.setBounds(140, 170, 50, 25);

        JButton button0 = new JButton("0");
        button0.setBounds(85, 200, 50, 25);

        JButton buttonEfeite = new JButton(".");
        buttonEfeite.setBounds(30, 200, 50, 25);

        JButton buttonEnfeite2 = new JButton("()");
        buttonEnfeite2.setBounds(140, 200, 50, 25);


        frame.add(label);
        frame.add(field);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonC);
        frame.add(buttonPlus);
        frame.add(buttonSub);
        frame.add(buttonDiv);
        frame.add(buttonMult);
        frame.add(buttonIgual);
        frame.add(buttonEfeite);
        frame.add(buttonEnfeite2);

        button1.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "1";
            field.setText(Valores.valorTextField);
        });
        button2.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "2";
            field.setText(Valores.valorTextField);
        });
        button3.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "3";
            field.setText(Valores.valorTextField);
        });
        button4.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "4";
            field.setText(Valores.valorTextField);
        });
        button5.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "5";
            field.setText(Valores.valorTextField);
        });
        button6.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "6";
            field.setText(Valores.valorTextField);
        });
        button7.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "7";
            field.setText(Valores.valorTextField);
        });
        button8.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "8";
            field.setText(Valores.valorTextField);
        });
        button9.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "9";
            field.setText(Valores.valorTextField);
        });
        button0.addActionListener((e) ->{
            Valores.valorTextField = Valores.valorTextField + "0";
            field.setText(Valores.valorTextField);
        });
        buttonC.addActionListener((e) ->{
            Valores.valorTextField = "";
            field.setText(Valores.valorTextField);
        });
        buttonPlus.addActionListener((e) ->{
            Valores.valor1 = Integer.parseInt(Valores.valorTextField);
            Valores.opcao = "Soma";
            Valores.valorTextField = "";
            field.setText(Valores.valorTextField);
        });

        buttonSub.addActionListener((e) ->{
            Valores.valor1 = Integer.parseInt(Valores.valorTextField);
            Valores.opcao = "Sub";
            Valores.valorTextField = "";
            field.setText(Valores.valorTextField);
        });

        buttonMult.addActionListener((e) ->{
            Valores.valor1 = Integer.parseInt(Valores.valorTextField);
            Valores.opcao = "Mult";
            Valores.valorTextField = "";
            field.setText(Valores.valorTextField);
        });

        buttonDiv.addActionListener((e) ->{
            Valores.valor1 = Integer.parseInt(Valores.valorTextField);
            Valores.opcao = "Div";
            Valores.valorTextField = "";
            field.setText(Valores.valorTextField);
        });

        buttonIgual.addActionListener((e) ->{
            Valores.valor2 = Integer.parseInt(Valores.valorTextField);

            int resultado = 0;

            if(Valores.opcao.equals("Soma")){
                resultado = Valores.valor1 + Valores.valor2;
            }
            field.setText(String.valueOf(resultado));

            if (Valores.opcao.equals("Sub")) {
                resultado = Valores.valor1 - Valores.valor2;
            }
            field.setText(String.valueOf(resultado));

            if(Valores.opcao.equals("Mult")){
                resultado = Valores.valor1 * Valores.valor2;
            }
            field.setText(String.valueOf(resultado));

            if (Valores.opcao.equals("Div")) {
                resultado = Valores.valor1 / Valores.valor2;
            }
            field.setText(String.valueOf(resultado));

        });


        frame.setVisible(true);
        }
    }