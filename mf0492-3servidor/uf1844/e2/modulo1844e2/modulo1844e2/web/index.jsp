<%-- 
    Document   : index
    Created on : 24-jul-2019, 15:34:40
    Author     : USUARIO PRINCIPAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO DE REGISTRO</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        
        
        
        <h1>FORMULARIO DE REGISTRO</h1>
        <form action="registrar.php" method="post" class="form-register">
            <h2 class="form__titulo">CREA UNA CUENTA</h2>
            <div class="contenedor-inputs">
            <input type="text" name="nombre" placeholder="Nombre" class="input-48" required>
            <input type="text" name="apellidos" placeholder="Apellidos" class="input-48" required>
            <input type="email" name="correo" placeholder="Correo" class="input-100" required>
            <input type="text" name="usuario" placeholder="Usuario" class="input-48" required>
            <input type="password" name="clave" placeholder="Contraseña" class="input-48" required>
            <input type="text" name="telefono" placeholder="Teléfono" class="input-100" required>
            <input type="submit" value="Registrar" class="btn-enviar" required>
            <p class="form__link">¿Ya tienes una cuenta? <a href="#">Ingresa aquí</a></p>
        </div>
        
            
            
            
            
            
            
            
            
            
        </form>
          
    </body>
</html>
