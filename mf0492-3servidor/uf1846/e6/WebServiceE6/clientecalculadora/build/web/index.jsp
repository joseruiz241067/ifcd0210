<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Calculadora</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        
        
        <img src="imagen/panterarosa1.jpg" alt=""/>
        
        <div class="container-fluid mt-5">
            
            <h1 class="display-4 bg-success">Calculadora</h1>
            
           <form action="suma.jsp" method="post">
                <div class="row mt-5">
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero1" name="variable1" >
                  </div>
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero2" name="variable2">
                  </div>
                     <div class="col-md-3">
                    <input type="submit" value="Resultado Suma" class="btn btn-danger">
                  </div>
                </div>
           </form>
            
            <form action="resta.jsp" method="post">
                <div class="row mt-5">
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero1" name="variable1" >
                  </div>
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero2" name="variable2">
                  </div>
                     <div class="col-md-3">
                    <input type="submit" value="Resultado Resta" class="btn btn-danger">
                  </div>
                </div>
           </form>
            
           <form action="multiplicacion.jsp" method="post">
                <div class="row mt-5">
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero1" name="variable1" >
                  </div>
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero2" name="variable2">
                  </div>
                     <div class="col-md-3">
                    <input type="submit" value="Resultado Multiplicación" class="btn btn-danger">
                  </div>
                </div>
           </form> 
            
             <form action="division.jsp" method="post">
                <div class="row mt-5 mb-5">
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero1" name="variable1" >
                  </div>
                  <div class="col-md-3">
                    <input type="text" class="form-control" placeholder="numero2" name="variable2">
                  </div>
                     <div class="col-md-3">
                    <input type="submit" value="Resultado División" class="btn btn-danger">
                  </div>
                </div>
           </form> 
            
            
            
            
            
            
            
        </div>
        
        
        
        
        
        
        
        
      <!--   <div class="container-fluid mt-2">
            <div class="row">
            
            
            <form action="suma.jsp" method="post">
                <input name="variable1" type="text"/>
                <input name="variable2" type="text"/>
                <input type="submit" name="boton"/>
            </form>
            
            
            </div>
        </div>
        -->
   
    </body>
</html>
