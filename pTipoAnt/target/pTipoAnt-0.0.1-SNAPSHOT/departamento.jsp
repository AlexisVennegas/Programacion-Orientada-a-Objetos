<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>   
<html>
<script>
function visualizar(){
	document.getElementById("panelView").style.display="block";
	document.getElementById("panelModificarForm").style.display="none";
}
function eliminar(){
	if(confirm("¿Desea eliminar este elemento?")){
	document.getElementById("formDepartamento").accion.value = "D";
	document.getElementById("formDepartamento").submit();
	}
}
function modificar(){
	if(confirm("¿Desea modificar este elemento?")){
		
	document.getElementById("formDepartamento").accion.value = "M";
	document.getElementById("formDepartamento").submit();
	document.getElementById("panelView").style.display="block";
	document.getElementById("panelModificarForm").style.display="none";
	}
}
function aModificar(){
	document.getElementById("panelView").style.display="none";
	document.getElementById("panelModificarForm").style.display="block";
}

</script>
<head>
<meta charset="ISO-8859-1">
<title>Departamento</title>
</head>
<body>
<c:choose>
<c:when test="${elemento!=null}">
<div id="panelView" >
Id: ${elemento.id}<br>
Nombre: ${elemento.nombre}<br>
IdLocalización:${elemento.idDireccion}<br>
IdManager:${elemento.idManager}<br>
<!-- fmt:parseDate value="${elemento.fechaCreacion}" pattern="yyyy-MM-dd" var="parsedFecCreacion" type="date"/>
 <fmt:formatDate value="${parsedFecCreacion}" pattern="dd/MM/yyyy" var="fechaCreacion" /> 
Fecha Creacion:${fechaCreacion}<br>
 -->
<a href="javascript:aModificar()">Modificar</a>
<a href="javascript:eliminar()">Eliminar</a>
<a href="./">Volver</a><br>
</div>
<div id="panelModificarForm" style="display:none">
<form method="post" action="./departamento" id="formDepartamento">
 <input hidden="true" type="text" name="accion" value="" />
 <input hidden="true" type="text" name="id" value="${elemento.id}" />
 <input hidden="true" type="text" name="idDireccion" value="${elemento.idDireccion}" />
 <input hidden="true" type="text" name="idManager" value="${elemento.idManager}" />
 Id:${elemento.id} <br>
 Nombre: <input type="text" name="nombre" value="${elemento.nombre}"/><br>
 <!-- Tipo: <select name="tipo">
			
			<c:forEach items="${tipos}" var="tipo">
				<option value="${tipo.tipo}" ${elemento.tipo == tipo.tipo ? 'selected' : ''}>${tipo}</option>
			</c:forEach>
		</select><br> 
		-->
 <input type="button" onClick="javascript:modificar()" value="Enviar"/> 
 <input type="button" onClick="javascript:visualizar()" value="Volver"/> 
</form>
</div>
</c:when>
<c:otherwise>
<div id="panelCrearForm">
<form method="post" action="./departamento" id="formCrearDepartamento">
 <input hidden="true" type="text"  name="accion" value="C" /> 
 Id <input type="text"  name="nombre" value="" /> <br>
 Nombre <input type="text"  name="id" value="" /> <br>
 idDireccion <input type="text"  name="idDireccion" value="" /> <br>
 idManager <input type="text"  name="idManager" value="" /> <br>
 
 <input type="submit" value="Enviar"/> 
</form>
</div>
</c:otherwise>
</c:choose>

<c:if test="${error!=null}">
<div style="color:red">
   ${error}
</div>
</c:if>

<br/>
</body>
</html>