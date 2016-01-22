import java.awt.event.*;
import java.awt.*;
public class MouseCorre extends Frame
{
    private Button boton;
    
    public Corre()
    {
        super("Demo");
  setLayout(new FlowLayout());
  addMouseMotionListener(new EscuchaMouse());
 
  boton =new Button("A que no me precionas!!");
 
  add(boton);
 
  setSize(200,150);
  setVisible(true);
    }
    class EscuchaMouse implements MouseMotionListener
    {
        public void mouseMoved(MouseEvent e)
     {
     //Defino la distancia minima a la que se puede acercar el mouse
           int distancia =100;
           Point pMouse = e.getPoint();
           Dimension dimBoton = boton.getSize();
           Point pBoton = boton.getLocation();
           int difX1 = Math.abs(pBoton.x-pMouse.x);
           int difX2 = Math.abs((pBoton.x+dimBoton.width)-pMouse.x);
           int difY1 = Math.abs(pBoton.y-pMouse.y);
           int difY2 = Math.abs((pBoton.y+dimBoton.height)-pMouse.y);    
           if(difX1<distancia || difX2 <distancia || difY1<distancia || difY2 <distancia){
         //Medidas
           Dimension dimVentana = getSize(); 
  //Medidas de la pantalla
           Dimension dimScreen = getToolkit().getScreenSize();
  
  //Elijo nuevas coordenadas para la ventana usando Math.random
           int y = (int)(Math.random()*(dimScreen.height-dimVentana.height));
           int x = (int)(Math.random()*(dimScreen.width-dimVentana.width));
  
     //reubico la ventana
           setLocation(x,y);
           }
    
        }
        public void mouseDragged(MouseEvent e) {}
       }
       public static void main(String[]args)
           {
        new Corre();
    }
 }
