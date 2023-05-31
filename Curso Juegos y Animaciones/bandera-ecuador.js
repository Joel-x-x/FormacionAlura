const pantalla = document.querySelector('canvas')

const pincel = pantalla.getContext("2d")

pincel.fillStyle = "yellow"
pincel.fillRect(0,0,600,150)

pincel.fillStyle = "blue"
pincel.fillRect(0,150,600,275)

pincel.fillStyle = "red"
pincel.fillRect(0,275,600,400)


