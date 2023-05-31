function dibujarCuadrado(x , y) {
  const pantalla = document.querySelector('canvas')
  const pincel = pantalla.getContext("2d")

  pincel.fillStyle = "lightgray"
  pincel.fillRect(x,y,50,50)
  pincel.strokeStyle = "black"
  pincel.strokeRect(x,y,50,50)
}

let longitudArray = 10
let posicionX = 0 

for (let i = 0; i < longitudArray; i++) {
  dibujarCuadrado(posicionX,0)
  posicionX += 50
}
