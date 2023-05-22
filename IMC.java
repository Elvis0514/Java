
package imc;
public class IMC {
String a,b;
float x,y;
float imc;

public boolean getCheckEmpty(String a, String b){
    if (a.equals("")|| b.equals("")||(a.equals("")&&b.equals(""))){
      return true;
    }else{
       this.a=a;
       this.b=b;
       return false;
    }

}
    public boolean getCheckIsnumeric(){
      try{
      Float.parseFloat(a);
      Float.parseFloat(b);
      setConvertir();
      return true;
      }catch (Exception e){
      return false ;
      }
    
    }
    public boolean getCheckRango(){
    if(x<10 || x>120){
    return false;
    }else{
    if(y<.5 || y>2){
    return false;
    }else{
    return true;
    }
    }
    }
    public void setConvertir(){
        this.x=Float.parseFloat(a);
        this.y=Float.parseFloat(b);
    
    }
    
    public float getIMC(){
     float imc;
     imc=x/(y*y);
     this.imc=imc;
     return imc;
    }
    
    public String getStatus(){
    String status="";
    if(imc<=18.4){
    status="Insuficiencia Ponderada";
    }else if(imc>=18.5 && imc<=24.9){
    status="Peso Normal";
    }else if(imc>=25 && imc<=29.9){
    status="Sobre Peso";
    }else if(imc>=30 && imc<=34.5){
    status="Obesidad I";
    }else if(imc>=35 && imc<=39.9){
    status="Obesidad II";
    }else if(imc>=40){
    status="Obesidad III";
    }
    return status;
    }
    
    public String gettips(){
    String tips="";
    if(imc<=18.4){
    tips="Alimentate Sanamente";
    }else if(imc>=18.5 && imc<=24.9){
    tips="Sigue con la alimentacion que tienes ";
    }else if(imc>=25 && imc<=29.9){
    tips="No comas comida rapida y haz ejercicio";
    }else if(imc>=30 && imc<=34.5){
    tips="Ve al medico y al nutricionista";
    }else if(imc>=35 && imc<=39.9){
    tips="Ve urgente al nutriologo";
    }else if(imc>=40){
    tips="Internate en una clinica para bajar de peso ";
    }
    return tips;
    }
    
}
