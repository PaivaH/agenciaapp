<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="utf-8">
	<title>Agencia App</title>
</head>
<body>
	<div class="container mt-3">
	  <h2>Agencia app</h2>
	  <p>Projeto para cadastrar profissionais de saude em agencia</p>
	  
	  <h3>Classe: Profissional</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descricao</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>descricao</td>
	        <td>String</td>
	        <td>Descrição do pedido</td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDateTime</td>
	        <td>Data de realização do pedido</td>
	      </tr>
	      <tr>
	        <td>web</td>
	        <td>boolean</td>
	        <td>Indicativo para um pedido online ou presencial</td>
	      </tr>
	    </tbody>
	  </table>

	  <h3>Classe: Bebida</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>gelada</td>
	        <td>boolean</td>
	        <td>Indicativo se a bebida é gelada ou não</td>
	      </tr>
	      <tr>
	        <td>tamanho</td>
	        <td>float</td>
	        <td>Quantidade de liquido da bebida</td>
	      </tr>
	      <tr>
	        <td>marca</td>
	        <td>String</td>
	        <td>Marca da bebida</td>
	      </tr>
	    </tbody>
	  </table>
	</div>	
</body>
</html>