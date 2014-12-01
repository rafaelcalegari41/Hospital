$(document).ready(function () {
	$('.selectpicker').selectpicker();

	$('#sandbox-container .input-group.date').datepicker({
		format: "dd/mm/yyyy",
		todayBtn: "linked",
		language: "pt-BR",
		autoclose: true,
		todayHighlight: true
	});

	$(window).load(function () {
		$('#menu-instituicoes').addClass('menu-ativo');
	});

	//Controla o clique do menu lateral
	$('.menu dl dd[id^="menu-"]').click(function () {
		var id = $(this).attr('id');
		var toRemove = 'menu-';
		var idNovoAba = id.replace(toRemove, '');
		$('.menu-instituicoes, .menu-disciplina, .menu-areas, .menu-subareas, .menu-assuntos, .menu-questoes, .menu-avaliacoes').hide();
		$('#menu-instituicoes, #menu-disciplina, #menu-areas, #menu-subareas, #menu-assuntos, #menu-questoes, #menu-avaliacoes').removeClass('menu-ativo');
		$('#menu-' + idNovoAba).addClass('menu-ativo');
		$('.menu-' + idNovoAba).show();
	});

	//Controla o funcionamento das abas
	$('#menu-abas a').click(function (e) {
		e.preventDefault();
		$(this).tab('show');
	});

});




