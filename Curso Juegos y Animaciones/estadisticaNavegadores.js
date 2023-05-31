const pantalla = document.querySelector("canvas");
const pincel = pantalla.getContext("2d");
const serie2009 = [6, 47, 41, 3, 3];
const serie2019 = [81, 9, 3, 3, 4];
const colores = ["blue","green","yellow", "red","gray"]



function dibujarRectangulo(x, y, base, altura, color) {

  pincel.fillStyle = color;
  pincel.fillRect(x, y, base, altura);
  pincel.strokeStyle = "black";
  pincel.strokeRect(x, y, base, altura);
}

function dibujarBarra(x,y,serie,texto) {
  let sumaY = 0

  escribirTexto(x + 50,y - 20,texto)
  dibujarRectangulo(x,y,150,300,"black")

  for(let i = 0; i < 5; i++) {
    dibujarRectangulo(x, y + sumaY, 150, (serie[i] * 3), colores[i])
    sumaY += (serie[i] * 3)
  }
}

function escribirTexto(x,y,texto) {
  pincel.font = "15px Georgia"
  pincel.fillStyle = "black"
  pincel.fillText(texto,x,y)
}

dibujarBarra(50,50,serie2009,"2009")
dibujarBarra(400,50,serie2019,"2019")