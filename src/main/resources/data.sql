/* Categorías por defecto */
insert into categoria (
	nombre) 
values 
	('Agilidad');

insert into categoria (
	nombre) 
values (
	'Estándares');

insert into categoria (
	nombre) 
values (
	'Cumplimiento');

insert into categoria (
	nombre) 
values (
	'Calidad');

/* Eventos por defecto */
insert into evento (
	nombre)
values(
	'Cierre de historia');

insert into evento (
	nombre)
values(
	'Cierre de sprint');

insert into evento (
	nombre)
values(
	'Fecha límite alcanzada');

insert into evento (
	nombre)
values(
	'Examen realizado');

insert into evento (
	nombre)
values(
	'Curso realizado');

insert into evento (
	nombre)
values(
	'Instalación');

insert into evento (
	nombre)
values(
	'Pruebas');

insert into evento (
	nombre)
values(
	'Postimplementación');

insert into evento (
	nombre)
values(
	'Pull request');

/* Métricas por defecto */
insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Tiempo de ciclo', 'Tiempo que transcurre desde el inicio de una historia hasta terminarla estando en producción', 'MENOS_ES_MEJOR', 'TIEMPO', 1, 1);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Compromiso cumplido', 'Cantidad de puntos de historia completados en un sprint', 'MAS_ES_MEJOR', 'CANTIDAD', 1, 2);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Fecha de entrega acordada', 'Cantidad de ocasiones en que se incumple una fecha de entrega acordada', 'MENOS_ES_MEJOR', 'CANTIDAD', 1, 3);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Examen de estándares de Sybase', 'Calificación obtenida en el examen', 'MAS_ES_MEJOR', 'CALIFICACION', 2, 4);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Examen de estándares de Next', 'Calificación obtenida en el examen', 'MAS_ES_MEJOR', 'CALIFICACION', 2, 4);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Curso PLD', 'Calificación obtenida en el curso', 'MAS_ES_MEJOR', 'CALIFICACION', 2, 5);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Estándares Sybase', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Estándares Next', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Estándares Postgres', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Estándares Java', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Estándares REST', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Pruebas', 'Cantidad de defectos encontrados durante pruebas', 'MENOS_ES_MEJOR', 'CANTIDAD', 3, 7);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Postimplementación', 'Cantidad de defectos encontrados durante postimplementación', 'MENOS_ES_MEJOR', 'CANTIDAD', 3, 8);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Convenciones de Java', 'Cantidad de de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Cobertura', 'Porcentaje de cobertura para código nuevo con pruebas automatizadas', 'MAS_ES_MEJOR', 'PORCENTAJE', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Documentación', 'Cantidad de omisiones detectadas', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Sonar', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 6);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'ESLint', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 6);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Ortografía', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Bugs', 'Cantidad de bugs detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Formato', 'Cumplimiento del uso de estilo previamente definido', 'SI_CUMPLE', 'BOOLEAN', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Manejo de errores', 'Cantidad de ocasiones que no se cumple con un buen manejo de errores', 'MENOS_ES_MEJOR', 'CANTIDAD', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Legibilidad', 'Calificación de legibilidad del código', 'MAS_ES_MEJOR', 'EVALUACION', 4, 9);

insert into metrica (
	nombre, descripcion, criterio, tipo_valor, categoria_id, evento_id)
values(
	'Principios', 'Calificación de cumplimiento de principios del desarrollo de software', 'MAS_ES_MEJOR', 'EVALUACION', 4, 9);

/* Personas por defecto */
insert into persona (
	nombre, apellido_paterno, apellido_materno)
values (
	'Armida', 'González', 'González');

insert into persona (
	nombre, apellido_paterno, apellido_materno)
values (
	'Valeria Scarlett', 'Villarreal', 'Moreno');

insert into persona (
	nombre, apellido_paterno, apellido_materno)
values (
	'Seth Karim', 'Luis', 'Martínez');
