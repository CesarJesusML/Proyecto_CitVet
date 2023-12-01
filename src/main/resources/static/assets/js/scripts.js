/* Mascota */

// Boton eliminar mascota
$(document).ready(function(){
	$('.deletebtn').on('click',function(){
		$('#eliminarModal').modal('show');
		$tr = $(this).closest('tr');
		var data = $tr.children("td").map(function(){
			return $(this).text();
		}).get();
		console.log(data);
		$('#codigo').val(data[0]);
		$('#nombreMascota').text("¿Está seguro de eliminar las mascota: "+ data[2]+"?");
	})
});


/* Cliente */

// Boton eliminar cliente
$(document).ready(function(){
	$('.deletebtn').on('click',function(){
		$('#modal_eliminar_cliente').modal('show');
		$tr = $(this).closest('tr');
		var data = $tr.children("td").map(function(){
			return $(this).text();
		}).get();
		console.log(data);
		$('#codigo_cliente').val(data[0]);
		$('#nombre_cliente').text("¿Está seguro de eliminar al cliente: "+ data[1]+"?");
	})
});

// Botón para editar cliente
$('.editbtn').on('click', function () {
    $('#modal_editar_cliente').modal('show');
    $tr = $(this).closest('tr');
    var data = $tr.children("td").map(function () {
        return $(this).text();
    }).get();
    console.log('data[4]:', data[4]); // Registra el valor de data[4]
    $('#codigo_cliente_edit').val(data[0]);
    $('#nombre_cliente_edit').val(data[1]);
    $('#apellidos_cliente_edit').val(data[2]);
    $('#dni_cliente_edit').val(data[3]);
    $('#distrito_cliente_edit').val(data[4]);
    console.log('distrito_cliente_edit value:', $('#distrito_cliente_edit').val()); // Registra el valor del campo de selección
    $('#direccion_cliente_edit').val(data[6]);
    $('#telefono_cliente_edit').val(data[7]);
    $('#email_cliente_edit').val(data[8]);
});


//

$(document).ready(function () {
            $.getJSON('/api/Distrito/findall', function (data) {
                $.each(data, function (key, value) {
                    $('#distrito_cliente_edit')
                        .append($("<option></option>")
                            .attr("value", value.codDistrito)
                            .text(value.nom_distrito));
                });
            });
        });

//
//$.getJSON('/api/Distrito/findall', function (data) {
//    var distritoSeleccionado = $('#distrito_cliente_edit').val();
//    $('#distrito_cliente_edit').empty();  // Limpia el select
//    $('#distrito_cliente_edit').append($("<option></option>").attr("value", "").text("Seleccione"));  // Agrega la opción por defecto
//    $.each(data, function (key, value) {
//        var option = $("<option></option>")
//            .attr("value", value.codDistrito)
//            .text(value.nom_distrito);
//        if (value.nom_distrito === distritoSeleccionado) {
//            option.attr("selected", "selected");  // Selecciona el distrito del cliente
//        }
//        $('#distrito_cliente_edit').append(option);
//    });
//});


/* Servicio */

// Boton eliminar servicio
$(document).ready(function(){
	$('.deletebtn').on('click',function(){
		$('#modal_eliminar_servicio').modal('show');
		$tr = $(this).closest('tr');
		var data = $tr.children("td").map(function(){
			return $(this).text();
		}).get();
		console.log(data);
		$('#codigo_servicio').val(data[0]);
		$('#nombre_servicio').text("¿Está seguro de eliminar el servicio: "+ data[1]+"?");
	})
});

/* Veterinario */

// Boton eliminar veterinario
$(document).ready(function(){
    $('.deletebtn').on('click',function(){
        $('#modal_eliminar_veterinario').modal('show');
        $tr = $(this).closest('tr');
        var data = $tr.children("td").map(function(){
            return $(this).text();
        }).get();
        console.log(data);
        $('#codigo_veterinario').val(data[0]);
        $('#nombre_veterinario').text("¿Está seguro de eliminar al veterinario: "+ data[1]+"?");
    })
});







