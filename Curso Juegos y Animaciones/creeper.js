const pantalla = document.querySelector('canvas')

const pincel = pantalla.getContext("2d")

// Canvas
pincel.fillStyle = "lightgray"
pincel.fillRect(0,0,600,400)

// 1
pincel.fillStyle = "darkgreen"
pincel.fillRect(125,50,350,300)

pincel.fillStyle = "black"
// // 2 - 3
pincel.fillRect(175,110,90,90)
pincel.fillRect(335,110,90,90)
// // 4
pincel.fillRect(265,200,70,100)
// // 5 - 6
pincel.fillRect(225,240,40,110)
pincel.fillRect(335,240,40,110)