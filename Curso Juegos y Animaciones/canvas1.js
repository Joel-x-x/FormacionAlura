const pantalla = document.querySelector('canvas')

const pincel = pantalla.getContext("2d")

pincel.fillStyle = "lightgray"
pincel.fillRect(0,0,600,400)

pincel.fillStyle = "yellow"
pincel.fillRect(0,0,200,400)

pincel.fillStyle = "blue"
pincel.fillRect(200,0,400,400)

pincel.fillStyle = "red"
pincel.fillRect(400,0,600,400)

pincel.fillStyle = "purple"
pincel.beginPath()
pincel.moveTo(300,200)
pincel.lineTo(200,400)
pincel.lineTo(400,400)
pincel.fill();

pincel.fillStyle = "purple"
pincel.beginPath()
pincel.arc(300,200,50,0,2*3.14);
pincel.fill();
