const pincel = canvas.getContext('2d')

pincel.fillStyle = "white"
pincel.fillRect(0,0,600,400)


function crearCirculo(x,y) {
  pincel.fillStyle = "green"
  pincel.beginPath()
  pincel.arc(x,y,30,0,2 * 3.14)
  pincel.fill()
}


let i = 0
let v = false
setInterval(() => {
  pincel.clearRect(0,0,600,400)
  crearCirculo(50 + i, 50)
  if(i >= 500) {
    v = true
  }
  else if(i <= 50) {
    v = false
  }

  if(v) {
    i--
  } 
  else {
    i++
  }
}, 1);