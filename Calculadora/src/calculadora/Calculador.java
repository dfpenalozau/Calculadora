package calculadora;

public class Calculador {
    
    public float Valor1;
    public float Valor2;
    public float Resultado;
    
    public float Sumar(){
        
        Resultado=Valor1+Valor2;
        return (Resultado);
        
    }
    
    public float Restar(){
        
        Resultado=Valor1-Valor2;
        return(Resultado);
        
    }
    
    public float Multiplicar(){
        
        Resultado=Valor1*Valor2;
        return(Resultado);
        
    }
    
    public float Dividir(){
        
        if(Resultado==0){
            return(0);
        }else{
            Resultado=Valor1/Valor2;
            return(Resultado);
        }
        
    }
}
