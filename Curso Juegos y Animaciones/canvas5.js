const pincel = canvas.getContext('2d')

pincel.fillStyle = "white"
pincel.fillRect(0,0,600,400)

let radio = 10
let randomX
let randomY
let objetivoX
let objetivoY
let intentos = 0



function crearCirculo(x,y,radio,color) {
  pincel.fillStyle = color
  pincel.beginPath()
  pincel.arc(x,y,radio,0,2 * 3.14)
  pincel.fill()
}


// let i = 0
// let v = false
// setInterval(() => {
//   pincel.clearRect(0,0,600,400)
//   crearCirculo(50 + i, 50)
//   if(i >= 500) {
//     v = true
//   }
//   else if(i <= 50) {
//     v = false
//   }

//   if(v) {
//     i--
//   } 
//   else {
//     i++
//   }
// }, 1);

function crearObjetivo(x,y) {
  crearCirculo(x,y,radio + 20, "red")
  crearCirculo(x,y,radio + 10, "white")
  crearCirculo(x,y,radio, "red")
}

function limpiarRect() {
  pincel.clearRect(0,0,600,400)
}

function numeroAleatorio(min,max) {
  return Math.floor(Math.random()*(max - min)+min)
}

canvas.onclick = disparar


function  disparar(e) {
  let userX = e.pageX
  let userY = e.pageY

  // posicion 5 el circulo rojo tiene un radio de 10 a cada lado entonces su rango sería 15 arriba y 15 abajo de igual forma derecha izquierda y menos el pixel de la posicion no 10 sino 9.5 o 9
  if(userX > objetivoX - 9 && userX < objetivoX + 9 & userY > objetivoY - 9 && userY < objetivoY + 9) {
    alert("Le diste al blanco número de intentos: " + intentos)
    intentos = 0
  }
  else {
    randomizar()
    intentos++
  }

}






function randomizar() {
    randomX = numeroAleatorio(60,540)
    randomY = numeroAleatorio(60,340)

    limpiarRect()
    crearObjetivo(randomX,randomY)

    objetivoX = randomX
    objetivoY = randomY
}

randomizar()


