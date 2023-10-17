use jugos_ventas;

select * from tabla_de_productos where sabor = 'MANGO' or sabor = 'UVA';

select * from tabla_de_clientes where edad in (25, 26);

select * from tabla_de_clientes where edad like '2%';

select * from tabla_de_clientes where nombre like '%el%';

select * from tabla_de_clientes where estado <> "em";

select distinct nombre from tabla_de_productos;

select * from tabla_de_productos limit 1,2; -- indice toma en cuenta desde el 0

select * from facturas where fecha_venta = '2015-01-15' limit 10;

select * from tabla_de_productos order by nombre, precio_lista desc; 

select * from tabla_de_productos where nombre = 'refrescante' and tamano = '1 litro' and  sabor = 'frutilla/limón';

select estado, limite_credito from tabla_de_clientes;

select estado, sum(limite_credito) as limite_total from tabla_de_clientes
group by estado;

select envase, precio_lista from tabla_de_productos;

select envase, avg(precio_lista) as maximo from tabla_de_productos
group by envase;

use jugos_ventas;

select estado, sum(limite_credito) as limite_total
from tabla_de_clientes group by estado
having limite_total > 300000;

select * from tabla_de_clientes;

select dni, count(*) as ncompras from facturas
where year(fecha_venta) = 2016
group by dni
having ncompras > 2000;

select year(fecha_venta) from facturas;