<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulador de Jogos da Megasena</title>
</head>
<body>
<h1>GERADOR DE JOGOS DA MEGASENA</h1>

<form method = "post"  action = "gerador-de-jogos">
        Quantidades de Jogos:
        <input type="number" name="quant" min="1" max="15"/> 
        
        <input type = "submit" value = "Enviar"/>
    </form>
    <br>
</body>
</html>