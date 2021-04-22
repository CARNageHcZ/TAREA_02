
/** 
 * El matematico
 * 
 * @CARNageHcZ
 * 1.0
 */

public class Matematico
{ 
  private String diferencia;
  private String posicionCuadrante;

  public String PuedeDiferenciar(int c, int a, int b)
  { 
    this.diferencia = diferencia;
    if(a<b)
    {
      diferencia = "el menor es :" + a;
    }
    return diferencia;
  }  
  public String CalcularArea(int base, int altura)
  {
    int area = base * altura;
    return area + " es el area";
  }
  public String CalcularDistancia(int x1, int y1, int x2, int y2)
  {
    double distancia = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    
    return "La distancia es: " + distancia;
  }
  public String IndicarElcuadrante(int x, int y)
  {
     this.posicionCuadrante = posicionCuadrante;
    
    if((x>0 && y>0))
    {
      posicionCuadrante = "Tu coordenada esta en el primer cuadrante"; 
    } 
    else
    {
      if((x<0 && y>0))
      {
        posicionCuadrante = "Tu coordenada esta en el segundo cuadrante"; 
      }
      else
      {
        if((x<0 && y<0))
        {
          posicionCuadrante = "Tu coordenada esta en el tercer cuadrante"; 
        }
        else
        {
         if((x>0 && y<0))
          {
            posicionCuadrante = "Tu coordenada esta en el cuarto cuadrante"; 
          }
        }
      }
    }
    return posicionCuadrante;  
  }
  
  
    
}
