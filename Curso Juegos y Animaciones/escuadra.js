const pantalla = document.querySelector('canvas')

const pincel = pantalla.getContext("2d")

pincel.fillStyle = "lightgray"
pincel.fillRect(0,0,600,450)

pincel.fillStyle = "white"
pincel.beginPath()
pincel.moveTo(50,50)
pincel.lineTo(50,400)
pincel.lineTo(400,400)

pincel.fill()

pincel.fillStyle = "lightgray"
pincel.beginPath()
pincel.moveTo(100,175)
pincel.lineTo(100,350)
pincel.lineTo(275,350)

pincel.fill()