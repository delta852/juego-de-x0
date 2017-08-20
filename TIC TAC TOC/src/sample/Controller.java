package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    int player = 1;
    int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0;
    @FXML Button btn1;
    @FXML Button btn2;
    @FXML Button btn3;
    @FXML Button btn4;
    @FXML Button btn5;
    @FXML Button btn6;
    @FXML Button btn7;
    @FXML Button btn8;
    @FXML Button btn9;
    @FXML TextField jugador1;

    public void Nuevo(ActionEvent actionEvent) {
     btn1.setText("");
     btn2.setText("");
     btn3.setText("");
     btn4.setText("");
     btn5.setText("");
     btn6.setText("");
     btn7.setText("");
     btn8.setText("");
     btn9.setText("");
     player = 1;
     cont1=0;
     cont2=0;
     cont3=0;
     cont4=0;
     cont5=0;
     cont6=0;
     cont7=0;
     cont8=0;
     cont9=0;
    }

    public void Salir(ActionEvent actionEvent) {
        Platform.exit();
    }


    public void player1(ActionEvent actionEvent) {
        player = 1;
    }

    public void player2(ActionEvent actionEvent) {
        player = 2;
    }


    public void add1(ActionEvent actionEvent) {
     if(cont1==0) {
         if (player == 1) {
             btn1.setText("X");
             player = 2;
         }
         else if (player == 2) {
             btn1.setText("O");
             player = 1;
         }

         cont1++;

     }



    }

    public void add2(ActionEvent actionEvent) {
        if(cont2==0) {
            if (player == 1) {
                btn2.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn2.setText("O");
                player = 1;
            }

            cont2++;
        }
    }

    public void add3(ActionEvent actionEvent) {
        if(cont3==0) {
            if (player == 1) {
                btn3.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn3.setText("O");
                player = 1;
            }

            cont3++;

        }
    }

    public void add4(ActionEvent actionEvent) {
        if(cont4==0) {
            if (player == 1) {
                btn4.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn4.setText("O");
                player = 1;
            }
            cont4++;
        }
    }

    public void add5(ActionEvent actionEvent) {
        if(cont5==0) {
            if (player == 1) {
                btn5.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn5.setText("O");
                player = 1;
            }

            cont5++;
        }
    }

    public void add6(ActionEvent actionEvent) {
        if(cont6==0) {
            if (player == 1) {
                btn6.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn6.setText("O");
                player = 1;
            }

            cont6++;
        }
    }

    public void add7(ActionEvent actionEvent) {
        if(cont7==0) {
            if (player == 1) {
                btn7.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn7.setText("O");
                player = 1;
            }

            cont7++;
        }
    }

    public void add8(ActionEvent actionEvent) {
        if(cont8==0) {
            if (player == 1) {
                btn8.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn8.setText("O");
                player = 1;
            }

            cont8++;
        }
    }

    public void add9(ActionEvent actionEvent) {
        if(cont9==0) {
            if (player == 1) {
                btn9.setText("X");
                player = 2;
            }
            else if (player == 2) {
                btn9.setText("O");
                player = 1;
            }

            cont9++;
        }
    }

    /*
    public void ValidarGanador()
    {

    //Horizontal 1
    if ( (btn1 == "X") && (btn2 == "X") && (btn3 == "O") || (btn1 == "O") && (btn2 == "O") && (btn3 == "O") )
             btn1.setText("|");
             btn2.setText("|");
             btn3.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Horizontal 2
     if ( (btn4 == "X") && (btn5 == "X") && (btn6 == "O") || (btn4 == "O") && (btn5 == "O") && (btn6 == "O") )
             btn4.setText("|");
             btn5.setText("|");
             btn6.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Horizontal 3
     if ( (btn7 == "X") && (btn8 == "X") && (btn9 == "O") || (btn7 == "O") && (btn8 == "O") && (btn9 == "O") )
             btn1.setText("|");
             btn2.setText("|");
             btn3.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Vertical 1
     if ( (btn1 == "X") && (btn4 == "X") && (btn7 == "O") || (btn1 == "O") && (btn4 == "O") && (btn7 == "O") )
             btn1.setText("|");
             btn4.setText("|");
             btn7.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Vertical 2
     if ( (btn2 == "X") && (btn5 == "X") && (btn8 == "O") || (btn2 == "O") && (btn5 == "O") && (btn8 == "O") )
             btn2.setText("|");
             btn5.setText("|");
             btn8.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Vertical 3
     if ( (btn3 == "X") && (btn6 == "X") && (btn9 == "O") || (btn3 == "O") && (btn6 == "O") && (btn9 == "O") )
             btn2.setText("|");
             btn5.setText("|");
             btn8.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Diagonal 1 :: 1 --> 9 | 9 --> 1
     if ( (btn1 == "X") && (btn5 == "X") && (btn9 == "O") || (btn1 == "O") && (btn5 == "O") && (btn9 == "O") )
             btn1.setText("|");
             btn5.setText("|");
             btn9.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

     //Diagonal 2 :: 3 --> 7 | 7 --> 3
     if ( (btn3 == "X") && (btn5 == "X") && (btn7 == "O") || (btn3 == "O") && (btn5 == "O") && (btn7 == "O") )
             btn3.setText("|");
             btn5.setText("|");
             btn7.setText("|");
             // *Imprime msj o cuadro de dialogo indicando que jugador ha ganado
             //acumula puntaje y lo imprime

    */


    //if( btn1=="X" && btn2=="X" && btn3="X")
        //jugador1.setText("1");
}

