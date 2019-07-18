
public class DatosUsuario     {
       public DatosUsuario () {
    	   
       }
       String usuario1="";
       String pass1="";
       
       public int probarPass () {
    	   usuario1=Ventana1.txt_usuario.getText ();
    	   pass1=Ventana1.pss_contrasena.getText ();
    	   if (usuario1.equals("lteran")&&pass1.equals("Polo")) {
    		   return 1;
    	   }
    	   else {
    		   return 0;
    	   }
       }
       
}
