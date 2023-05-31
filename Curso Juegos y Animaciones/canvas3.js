const pantalla = document.querySelector('canvas')
const pincel = pantalla.getContext("2d")
const colores = ['blue','red','yellowgreen']
let iterador = 0

pincel.fillStyle = "lightgray"
pincel.fillRect(0,0,600,400)

pantalla.onclick = (e) => {
  let x = e.pageX;
  let y = e.pageY;

  dibujarCirculo(x,y)
}

pantalla.oncontextmenu = cambiarColor


function dibujarCirculo(x,y) {
  pincel.fillStyle = colores[iterador]
  pincel.beginPath()
  pincel.arc(x, y, 10, 0, 2 * 3.14)
  pincel.fill()
}

function cambiarColor(e) {
  if(iterador == 2) {
    iterador = 0
  } else {
    iterador++
  }
  // e.preventDefault()
  return false // Evitamos que se ejecute la funcion por defecto que es despegar un menú
}

