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

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Tiempo de ciclo', 'Tiempo que transcurre desde el inicio de una historia hasta terminarla estando en producción', 'MENOS_ES_MEJOR', 'TIEMPO', 1);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Compromiso cumplido', 'Cantidad de puntos de historia completados en un sprint', 'MAS_ES_MEJOR', 'CANTIDAD', 1);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Fecha de entrega acordada', 'Cantidad de ocasiones en que se incumple una fecha de entrega acordada', 'MENOS_ES_MEJOR', 'CANTIDAD', 1);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Examen de estándares de Sybase', 'Calificación obtenida en el examen', 'MAS_ES_MEJOR', 'CALIFICACION', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Examen de estándares de Next', 'Calificación obtenida en el examen', 'MAS_ES_MEJOR', 'CALIFICACION', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Curso PLD', 'Calificación obtenida en el curso', 'MAS_ES_MEJOR', 'CALIFICACION', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Estándares Sybase', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Estándares Next', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Estándares Postgres', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Estándares Java', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Estándares REST', 'Cantidad de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 2);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Pruebas', 'Cantidad de defectos encontrados durante pruebas en qa', 'MENOS_ES_MEJOR', 'CANTIDAD', 3);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Postimplementación', 'Cantidad de defectos encontrados durante postimplementación', 'MENOS_ES_MEJOR', 'CANTIDAD', 3);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Convenciones de Java', 'Cantidad de de incumplimientos detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Cobertura', 'Porcentaje de cobertura para código nuevo con pruebas automatizadas', 'MAS_ES_MEJOR', 'PORCENTAJE', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Documentación', 'Cantidad de omisiones detectadas', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Sonar', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'ESLint', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Ortografía', 'Cantidad de errores detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Bugs', 'Cantidad de bugs detectados', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Formato', 'Cumplimiento del uso de estilo previamente definido', 'SI_CUMPLE', 'BOOLEAN', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Manejo de errores', 'Cantidad de ocasiones que no se cumple con un buen manejo de errores', 'MENOS_ES_MEJOR', 'CANTIDAD', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Legibilidad', 'Calificación de legibilidad del código', 'MAS_ES_MEJOR', 'EVALUACION', 4);

insert into metrica (
nombre, descripcion, criterio, tipo_valor, categoria_id)
values(
'Principios', 'Calificación de cumplimiento de principios del desarrollo de software', 'MAS_ES_MEJOR', 'EVALUACION', 4);