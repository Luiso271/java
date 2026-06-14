package figura;

import pruebas.Punto;
import java.lang.Math;

public class Triangulo extends Figura{
	
	Punto p1, p2, p3;
	
	public double calculaPerimetro() {
		double lado1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
		double lado2 = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2));
		double lado3 = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2));
		
		return lado1 + lado2 + lado3;
	}
	
	public double calculaArea() {
		double Xmenor, Xmayor = 0, Ymenor, Ymayor = 0, base, altura;
		if(p1.getX() > Xmayor)
			Xmayor = p1.getX();
		if(p2.getX() > Xmayor)
			Xmayor = p2.getX();
		if(p3.getX() > Xmayor)
			Xmayor = p3.getX();
		Xmenor = p1.getX();
		if(p2.getX() < Xmenor)
			Xmenor = p2.getX();
		if(p3.getX() < Xmenor)
			Xmenor = p3.getX();
		if(p1.getY() > Ymayor)
			Ymayor = p1.getY();
		if(p2.getY() > Ymayor)
			Ymayor = p2.getY();
		if(p3.getY() > Ymayor)
			Ymayor = p3.getY();
		Ymenor = p1.getY();
		if(p2.getY() < Ymenor)
			Ymenor = p2.getY();
		if(p3.getY() < Ymenor)
			Ymenor = p3.getY();
		base = Xmayor - Xmenor;
		altura = Ymayor - Ymenor;
		
		return ((base * altura) / 2);
	}

}
