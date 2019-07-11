


// Código para las funcionalidades del menú de accesibilidad
$(document).ready(function() {
	$("#tema-claro").click(function() {
		$("*").css('backgroundColor', '#eee');
		$("*").css('color', '#000');
	});
	$("#tema-oscuro").click(function() {
		$("*").css('backgroundColor', '#111');
		$("*").css('color', '#ff0');
	});
	$("#agrandar-letra").click(function() {
		$("body").css('fontSize', '1.8em');
		$("#top").css('margin-top', '95em');
	});
	$("#disminuir-letra").click(function() {
		$("body").css('fontSize', '1.1em');
		$("#top").css('margin-top', '125em');
	});
});