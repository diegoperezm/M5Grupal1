<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Empresa Prevención De Riesgos</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/M5Grupal1">Menu</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Inicio">Inicio</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Contacto">Contacto</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="CrearCapacitacion">Crear
							Capacitación</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div>
		<div class="container-fluid">
			<div class="row">
				<div class="col">
				     <h1>Formulario de contacto:</h1>
				     
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Correo</label> <input type="email" class="form-control"
							id="exampleFormControlInput1" placeholder="nombre@ejemplo.com">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlTextarea1" class="form-label">Comentarios</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3"></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>

